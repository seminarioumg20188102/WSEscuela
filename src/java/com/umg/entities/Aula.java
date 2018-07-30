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
@Table(name = "AULA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aula.findAll", query = "SELECT a FROM Aula a")
    , @NamedQuery(name = "Aula.findByIDAula", query = "SELECT a FROM Aula a WHERE a.iDAula = :iDAula")
    , @NamedQuery(name = "Aula.findByCapacidadAula", query = "SELECT a FROM Aula a WHERE a.capacidadAula = :capacidadAula")
    , @NamedQuery(name = "Aula.findByDescripcionAula", query = "SELECT a FROM Aula a WHERE a.descripcionAula = :descripcionAula")})
public class Aula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDAula")
    private Integer iDAula;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CapacidadAula")
    private int capacidadAula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DescripcionAula")
    private String descripcionAula;

    public Aula() {
    }

    public Aula(Integer iDAula) {
        this.iDAula = iDAula;
    }

    public Aula(Integer iDAula, int capacidadAula, String descripcionAula) {
        this.iDAula = iDAula;
        this.capacidadAula = capacidadAula;
        this.descripcionAula = descripcionAula;
    }

    public Integer getIDAula() {
        return iDAula;
    }

    public void setIDAula(Integer iDAula) {
        this.iDAula = iDAula;
    }

    public int getCapacidadAula() {
        return capacidadAula;
    }

    public void setCapacidadAula(int capacidadAula) {
        this.capacidadAula = capacidadAula;
    }

    public String getDescripcionAula() {
        return descripcionAula;
    }

    public void setDescripcionAula(String descripcionAula) {
        this.descripcionAula = descripcionAula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDAula != null ? iDAula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aula)) {
            return false;
        }
        Aula other = (Aula) object;
        if ((this.iDAula == null && other.iDAula != null) || (this.iDAula != null && !this.iDAula.equals(other.iDAula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.umg.entities.Aula[ iDAula=" + iDAula + " ]";
    }
    
}
