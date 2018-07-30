/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author EstelaChayoMonse
 */
@Entity
@Table(name = "EXPEDIENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Expediente.findAll", query = "SELECT e FROM Expediente e")
    , @NamedQuery(name = "Expediente.findByIDExpediente", query = "SELECT e FROM Expediente e WHERE e.iDExpediente = :iDExpediente")
    , @NamedQuery(name = "Expediente.findByEstado", query = "SELECT e FROM Expediente e WHERE e.estado = :estado")
    , @NamedQuery(name = "Expediente.findByFechaCreacion", query = "SELECT e FROM Expediente e WHERE e.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Expediente.findByMemo", query = "SELECT e FROM Expediente e WHERE e.memo = :memo")})
public class Expediente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDExpediente")
    private Integer iDExpediente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Memo")
    private String memo;
    @JoinColumn(name = "IDAlumno", referencedColumnName = "IDAlumno")
    @ManyToOne(optional = false)
    private Alumno iDAlumno;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDExpediente")
    private Collection<Imagen> imagenCollection;

    public Expediente() {
    }

    public Expediente(Integer iDExpediente) {
        this.iDExpediente = iDExpediente;
    }

    public Expediente(Integer iDExpediente, String estado, Date fechaCreacion, String memo) {
        this.iDExpediente = iDExpediente;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.memo = memo;
    }

    public Integer getIDExpediente() {
        return iDExpediente;
    }

    public void setIDExpediente(Integer iDExpediente) {
        this.iDExpediente = iDExpediente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Alumno getIDAlumno() {
        return iDAlumno;
    }

    public void setIDAlumno(Alumno iDAlumno) {
        this.iDAlumno = iDAlumno;
    }

    @XmlTransient
    public Collection<Imagen> getImagenCollection() {
        return imagenCollection;
    }

    public void setImagenCollection(Collection<Imagen> imagenCollection) {
        this.imagenCollection = imagenCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDExpediente != null ? iDExpediente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Expediente)) {
            return false;
        }
        Expediente other = (Expediente) object;
        if ((this.iDExpediente == null && other.iDExpediente != null) || (this.iDExpediente != null && !this.iDExpediente.equals(other.iDExpediente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.umg.entities.Expediente[ iDExpediente=" + iDExpediente + " ]";
    }
    
}
