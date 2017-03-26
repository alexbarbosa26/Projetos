package com.neobpodho.model;

import java.io.Serializable;
import java.util.Date;

public class CandidatoFiltro implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cidade;
    private String bairro;
    private String disponivel;
    private Date dataInicio;
    private Date dataFim;

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

    
    
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro == null ? null : bairro.toUpperCase();
    }

    public String getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(String disponivel) {
        this.disponivel = disponivel;
    }

    //GET - SET

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade == null ? null : cidade.toUpperCase();
    }
}
