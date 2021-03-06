/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neobpodho.com.relatorio;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author Ramon
 */
@ManagedBean
@RequestScoped
public class RelatorioData implements Serializable {

    private HttpServletResponse response;
    private FacesContext context;
    private ByteArrayOutputStream baos;
    private InputStream stream;
    private Connection con;
    private Date dataInicio;
    private Date dataFim;

    public RelatorioData() {
        this.context = FacesContext.getCurrentInstance();
        this.response = (HttpServletResponse) context.getExternalContext().getResponse();
    }

    /*
    defina um parametro: List<Objeto> lista, se usar JavaBean DataSource
     */
    public void getRelatorio() {

        stream = this.getClass().getResourceAsStream("/report/RelatorioData.jasper");

        Map<String, Object> params = new HashMap<>();

        params.put("data_inicio", this.dataInicio);
        params.put("data_fim", this.dataFim);

        baos = new ByteArrayOutputStream();

        try {

            JasperReport report = (JasperReport) JRLoader.loadObject(stream);
            /*Para usar JavaBeanDataSource defina: new JRBeanCollectionDataSource(lista)
            mude a string do getResourceAsStream("/report/reportPessoaJavaBeanDS.jasper")
             */
            JasperPrint print = JasperFillManager.fillReport(report, params, getConexao());
            JasperExportManager.exportReportToPdfStream(print, baos);

            response.reset();
            response.setContentType("application/pdf");
            response.setContentLength(baos.size());
            response.setHeader("Content-disposition", "inline; filename=RelatorioData.pdf");
            response.getOutputStream().write(baos.toByteArray());
            response.getOutputStream().flush();
            response.getOutputStream().close();

            context.responseComplete();
            fecharConexao();

        } catch (JRException ex) {
            Logger.getLogger(RelatorioData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RelatorioData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //**************************************************************************
    //Metodo de conex�o com o banco    
    //**************************************************************************
    public Connection getConexao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/neobpodho", "root", "tivitrep123");
            return con;

        } catch (SQLException ex) {
            Logger.getLogger(RelatorioData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RelatorioData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }

    public void fecharConexao() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(RelatorioData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //**************************************************************************
    // metodo GET/SET
    //**************************************************************************
    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

}
