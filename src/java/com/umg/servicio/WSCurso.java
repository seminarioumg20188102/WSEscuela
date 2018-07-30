/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.servicio;

import com.umg.entities.Curso;
import com.umg.sessionbeans.CursoFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author EstelaChayoMonse
 */
@WebService(serviceName = "WSCurso")
@Stateless()
public class WSCurso {

    @EJB
    private CursoFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "curso") Curso curso) {
        ejbRef.create(curso);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "curso") Curso curso) {
        ejbRef.edit(curso);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "curso") Curso curso) {
        ejbRef.remove(curso);
    }

    @WebMethod(operationName = "find")
    public Curso find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Curso> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Curso> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }
    
}
