/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neobpodho.exception;

import com.neobpodho.util.FacesUtil;
import java.io.IOException;
import java.util.Iterator;
import javax.faces.FacesException;
import javax.faces.application.ViewExpiredException;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ExceptionQueuedEvent;
import javax.faces.event.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author alex.asilva
 */
public class JsfExceptionHandler extends ExceptionHandlerWrapper {

    private static Log log = LogFactory.getLog(JsfExceptionHandler.class);
    private ExceptionHandler wrapped;

    public JsfExceptionHandler(ExceptionHandler wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public ExceptionHandler getWrapped() {
        return this.wrapped;
    }
    
    @Override
    public void handle() throws FacesException {

        Iterator<ExceptionQueuedEvent> events = getUnhandledExceptionQueuedEvents().iterator();

        while (events.hasNext()) {
            ExceptionQueuedEvent event = events.next();
            ExceptionQueuedEventContext context = (ExceptionQueuedEventContext) event.getSource();

            Throwable exception = context.getException();
            NegocioException negocioException = getNegocioException(exception);

            boolean handler = false;
            try {
                if (exception instanceof ViewExpiredException) {
                    handler = true;
                    redirect("/");
                } else if (negocioException != null) {
                    handler = true;
                    FacesUtil.addErrorMessage(negocioException.getMessage());

                } else {
                    handler = true;
                    log.error("Erro de sistema" + exception.getMessage(), exception);                    
                    redirect("/dho/Erro.xhtml");
                }
            } finally {
                if (handler) {
                    events.remove();
                }
            }
        }
        getWrapped().handle();

    }

    private NegocioException getNegocioException(Throwable exception) {
        if (exception instanceof NegocioException) {
            return (NegocioException) exception;
        } else if (exception.getCause() != null) {
            return getNegocioException(exception.getCause());
        }
        return null;
    }

    public void redirect(String page) {
        try {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            ExternalContext externalContext = facesContext.getExternalContext();
            String contextPath = externalContext.getRequestContextPath();

            externalContext.redirect(contextPath + page);
            facesContext.responseComplete();

        } catch (IOException e) {
            throw new FacesException(e);
        }

    }

}