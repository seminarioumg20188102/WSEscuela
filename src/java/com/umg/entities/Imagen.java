/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EstelaChayoMonse
 */
@Entity
@Table(name = "IMAGEN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Imagen.findAll", query = "SELECT i FROM Imagen i")
    , @NamedQuery(name = "Imagen.findByIDImagen", query = "SELECT i FROM Imagen i WHERE i.iDImagen = :iDImagen")
    , @NamedQuery(name = "Imagen.findByUrlImagen", query = "SELECT i FROM Imagen i WHERE i.urlImagen = :urlImagen")})
public class Imagen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDImagen")
    private Integer iDImagen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "UrlImagen")
    private String urlImagen;
    @JoinColumn(name = "IDExpediente", referencedColumnName = "IDExpediente")
    @ManyToOne(optional = false)
    private Expediente iDExpediente;

    public Imagen() {
    }

    public Imagen(Integer iDImagen) {
        this.iDImagen = iDImagen;
    }

    public Imagen(Integer iDImagen, String urlImagen) {
        this.iDImagen = iDImagen;
        this.urlImagen = urlImagen;
    }

    public Integer getIDImagen() {
        return iDImagen;
    }

    public void setIDImagen(Integer iDImagen) {
        this.iDImagen = iDImagen;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public Expediente getIDExpediente() {
        return iDExpediente;
    }

    public void setIDExpediente(Expediente iDExpediente) {
        this.iDExpediente = iDExpediente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDImagen != null ? iDImagen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Imagen)) {
            return false;
        }
        Imagen other = (Imagen) object;
        if ((this.iDImagen == null && other.iDImagen != null) || (this.iDImagen != null && !this.iDImagen.equals(other.iDImagen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.umg.entities.Imagen[ iDImagen=" + iDImagen + " ]";
    }
    
}
