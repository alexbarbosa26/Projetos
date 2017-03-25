package com.neobpodho.model;

import java.io.Serializable;

public class CandidatoFiltro implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String cidade;

    
    //GET - SET
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade == null ? null : cidade.toUpperCase();
    }
}
