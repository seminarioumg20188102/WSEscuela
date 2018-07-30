/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.servicio;

import com.umg.entities.Aula;
import com.umg.sessionbeans.AulaFacadeLocal;
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
@WebService(serviceName = "WSAula")
@Stateless()
public class WSAula {

    @EJB
    private AulaFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "aula") Aula aula) {
        ejbRef.create(aula);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "aula") Aula aula) {
        ejbRef.edit(aula);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "aula") Aula aula) {
        ejbRef.remove(aula);
    }

    @WebMethod(operationName = "find")
    public Aula find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Aula> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Aula> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }
    
}
