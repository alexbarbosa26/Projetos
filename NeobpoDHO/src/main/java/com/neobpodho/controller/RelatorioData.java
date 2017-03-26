package com.neobpodho.controller;

import com.neobpodho.relatorio.ExecutorRelatorio;
import com.neobpodho.util.FacesUtil;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotNull;

import org.hibernate.Session;

@Named("emitirData")
@RequestScoped
public class RelatorioData implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Date DataInicio;
    private Date DataFim;
    
    
    private final HttpServletResponse response;
    
    
    private final FacesContext context; 
    
    @Inject
    private EntityManager manager;
    
    public RelatorioData(){
            this.context = FacesContext.getCurrentInstance();
            this.response = (HttpServletResponse) context.getExternalContext().getResponse();
        }
    	
    
    

    public void EmitirRelatorio(){
        
        Map<String, Object> parametros = new HashMap<>();        
        parametros.put("data_inicio", this.DataInicio);
        parametros.put("data_fim", this.DataFim);
        
        ExecutorRelatorio executor = new ExecutorRelatorio("/report/RelatorioData.jasper", this.response, parametros,"Relatorio.pdf");
        
        Session sessao = manager.unwrap(Session.class);        
        sessao.doWork(executor);
        
        if(executor.isRelatorioGerado()){
        context.responseComplete();
        }else{
            FacesUtil.addErrorMessage("A execução do relatorio não retornou dados.");
        }
    }
    
    @NotNull    
    public Date getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(Date DataInicio) {
        this.DataInicio = DataInicio;
    }

    @NotNull
    public Date getDataFim() {
        return DataFim;
    }

    public void setDataFim(Date DataFim) {
        this.DataFim = DataFim;
    }
}
