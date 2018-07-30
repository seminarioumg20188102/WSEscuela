/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EstelaChayoMonse
 */
@Entity
@Table(name = "CATEDRATICO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Catedratico.findAll", query = "SELECT c FROM Catedratico c")
    , @NamedQuery(name = "Catedratico.findByIDCatedratico", query = "SELECT c FROM Catedratico c WHERE c.iDCatedratico = :iDCatedratico")
    , @NamedQuery(name = "Catedratico.findByNombreCatedratico", query = "SELECT c FROM Catedratico c WHERE c.nombreCatedratico = :nombreCatedratico")
    , @NamedQuery(name = "Catedratico.findByApellidoCatedratico", query = "SELECT c FROM Catedratico c WHERE c.apellidoCatedratico = :apellidoCatedratico")
    , @NamedQuery(name = "Catedratico.findByFechaNacimiento", query = "SELECT c FROM Catedratico c WHERE c.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Catedratico.findBySexo", query = "SELECT c FROM Catedratico c WHERE c.sexo = :sexo")
    , @NamedQuery(name = "Catedratico.findByDpi", query = "SELECT c FROM Catedratico c WHERE c.dpi = :dpi")
    , @NamedQuery(name = "Catedratico.findByDireccionCatedratico", query = "SELECT c FROM Catedratico c WHERE c.direccionCatedratico = :direccionCatedratico")
    , @NamedQuery(name = "Catedratico.findByTelefono", query = "SELECT c FROM Catedratico c WHERE c.telefono = :telefono")})
public class Catedratico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCatedratico")
    private Integer iDCatedratico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 75)
    @Column(name = "NombreCatedratico")
    private String nombreCatedratico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 75)
    @Column(name = "ApellidoCatedratico")
    private String apellidoCatedratico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaNacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "Sexo")
    private String sexo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "DPI")
    private String dpi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DireccionCatedratico")
    private String direccionCatedratico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Telefono")
    private int telefono;

    public Catedratico() {
    }

    public Catedratico(Integer iDCatedratico) {
        this.iDCatedratico = iDCatedratico;
    }

    public Catedratico(Integer iDCatedratico, String nombreCatedratico, String apellidoCatedratico, Date fechaNacimiento, String sexo, String dpi, String direccionCatedratico, int telefono) {
        this.iDCatedratico = iDCatedratico;
        this.nombreCatedratico = nombreCatedratico;
        this.apellidoCatedratico = apellidoCatedratico;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.dpi = dpi;
        this.direccionCatedratico = direccionCatedratico;
        this.telefono = telefono;
    }

    public Integer getIDCatedratico() {
        return iDCatedratico;
    }

    public void setIDCatedratico(Integer iDCatedratico) {
        this.iDCatedratico = iDCatedratico;
    }

    public String getNombreCatedratico() {
        return nombreCatedratico;
    }

    public void setNombreCatedratico(String nombreCatedratico) {
        this.nombreCatedratico = nombreCatedratico;
    }

    public String getApellidoCatedratico() {
        return apellidoCatedratico;
    }

    public void setApellidoCatedratico(String apellidoCatedratico) {
        this.apellidoCatedratico = apellidoCatedratico;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getDireccionCatedratico() {
        return direccionCatedratico;
    }

    public void setDireccionCatedratico(String direccionCatedratico) {
        this.direccionCatedratico = direccionCatedratico;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDCatedratico != null ? iDCatedratico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catedratico)) {
            return false;
        }
        Catedratico other = (Catedratico) object;
        if ((this.iDCatedratico == null && other.iDCatedratico != null) || (this.iDCatedratico != null && !this.iDCatedratico.equals(other.iDCatedratico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.umg.entities.Catedratico[ iDCatedratico=" + iDCatedratico + " ]";
    }
    
}
