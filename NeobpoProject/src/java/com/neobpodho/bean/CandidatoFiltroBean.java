package com.neobpodho.bean;

import com.neobpodho.model.CandidatoFiltro;
import com.neobpodho.model.TbCandidatos;
import com.neobpodho.relatorio.RelatorioFiltrado;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

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
