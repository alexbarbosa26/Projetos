package com.neobpodho.relatorio;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import org.hibernate.jdbc.Work;

public class ExecutorRelatorio implements Work{
    
    private String caminhoRelatorio;
    private HttpServletResponse response;
    private Map<String, Object> parametros;
    private String nomeArquivoSaida;
    
    private boolean relatorioGerado;

    public ExecutorRelatorio(String caminhoRelatorio, HttpServletResponse response, Map<String, Object> parametros, String nomeArquivoSaida) {
        this.caminhoRelatorio = caminhoRelatorio;
        this.response = response;
        this.parametros = parametros;
        this.nomeArquivoSaida = nomeArquivoSaida;
        
        this.parametros.put(JRParameter.REPORT_LOCALE, new Locale("pt","BR"));
    }
    @Override
    public void execute(Connection con) throws SQLException {
        InputStream relatorioStream = this.getClass().getResourceAsStream(this.caminhoRelatorio);
        
        try {
            JasperPrint print = JasperFillManager.fillReport(relatorioStream, this.parametros, con);
            this.relatorioGerado = print.getPages().size()>0;
            
            if(this.relatorioGerado){
            JRExporter exportador = new JRPdfExporter();
            exportador.setParameter(JRExporterParameter.OUTPUT_STREAM, response.getOutputStream());
            exportador.setParameter(JRExporterParameter.JASPER_PRINT, print);
                        
            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "attachment; filename=\""+this.nomeArquivoSaida+"\"");
            exportador.exportReport();
            
            }
        } catch (JRException ex) {
            throw new SQLException("Erro ao executar o relatorio" +this.caminhoRelatorio, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExecutorRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isRelatorioGerado() {
        return relatorioGerado;
    }    
    
    
}
