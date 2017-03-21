/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neobpodho.com.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alex.asilva
 */
@Entity
@Table(name = "tb_paises")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbPaises.findAll", query = "SELECT t FROM TbPaises t")
    , @NamedQuery(name = "TbPaises.findByIdPaises", query = "SELECT t FROM TbPaises t WHERE t.idPaises = :idPaises")
    , @NamedQuery(name = "TbPaises.findByNomePaises", query = "SELECT t FROM TbPaises t WHERE t.nomePaises = :nomePaises")})
public class TbPaises implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_paises")
    private Integer idPaises;
    @Basic(optional = false)
    @Column(name = "nomePaises")
    private String nomePaises;

    public TbPaises() {
    }

    public TbPaises(Integer idPaises) {
        this.idPaises = idPaises;
    }

    public TbPaises(Integer idPaises, String nomePaises) {
        this.idPaises = idPaises;
        this.nomePaises = nomePaises;
    }

    public Integer getIdPaises() {
        return idPaises;
    }

    public void setIdPaises(Integer idPaises) {
        this.idPaises = idPaises;
    }

    public String getNomePaises() {
        return nomePaises;
    }

    public void setNomePaises(String nomePaises) {
        this.nomePaises = nomePaises;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPaises != null ? idPaises.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbPaises)) {
            return false;
        }
        TbPaises other = (TbPaises) object;
        if ((this.idPaises == null && other.idPaises != null) || (this.idPaises != null && !this.idPaises.equals(other.idPaises))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "neobpodho.com.model.TbPaises[ idPaises=" + idPaises + " ]";
    }
    
}
