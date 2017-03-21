package neobpodho.com.model;

import java.io.Serializable;

/**
 *
 * @author alex.asilva
 */
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
