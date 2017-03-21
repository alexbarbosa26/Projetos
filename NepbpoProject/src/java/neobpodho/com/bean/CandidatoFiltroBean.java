/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neobpodho.com.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import neobpodho.com.model.CandidatoFiltro;
import neobpodho.com.model.TbCandidatos;
import neobpodho.com.relatorio.RelatorioFiltrado;

/**
 *
 * @author alex.asilva
 */
@Named
@RequestScoped
public class CandidatoFiltroBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    private RelatorioFiltrado candidatos;

    private final CandidatoFiltro filtro;
    private List<TbCandidatos> candidatosFiltrados;

    public CandidatoFiltroBean() {
        filtro = new CandidatoFiltro();
    }

    public void pesquisar() {
        candidatosFiltrados = candidatos.filtrados(filtro);

    }

    public List<TbCandidatos> getCandidatosFiltrados() {
        return candidatosFiltrados;
    }

    public CandidatoFiltro getFiltro() {
        return filtro;
    }

}
