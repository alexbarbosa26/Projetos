/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neobpodho.model;

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
@Table(name = "tb_usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbUsuarios.findAll", query = "SELECT t FROM TbUsuarios t")
    , @NamedQuery(name = "TbUsuarios.findByIdUsuario", query = "SELECT t FROM TbUsuarios t WHERE t.idUsuario = :idUsuario")
    , @NamedQuery(name = "TbUsuarios.findByLogin", query = "SELECT t FROM TbUsuarios t WHERE t.login = :login")
    , @NamedQuery(name = "TbUsuarios.findBySenha", query = "SELECT t FROM TbUsuarios t WHERE t.senha = :senha")
    , @NamedQuery(name = "TbUsuarios.findByEmail", query = "SELECT t FROM TbUsuarios t WHERE t.email = :email")
    , @NamedQuery(name = "TbUsuarios.findByNomeCompleto", query = "SELECT t FROM TbUsuarios t WHERE t.nomeCompleto = :nomeCompleto")})
public class TbUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Basic(optional = false)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "nome_completo")
    private String nomeCompleto;

    public TbUsuarios() {
    }

    public TbUsuarios(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public TbUsuarios(Integer idUsuario, String login, String senha, String email, String nomeCompleto) {
        this.idUsuario = idUsuario;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.nomeCompleto = nomeCompleto;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbUsuarios)) {
            return false;
        }
        TbUsuarios other = (TbUsuarios) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.neobpodho.model.TbUsuarios[ idUsuario=" + idUsuario + " ]";
    }
    
}
