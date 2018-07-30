/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.servicio;

import com.umg.entities.Expediente;
import com.umg.sessionbeans.ExpedienteFacadeLocal;
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
@WebService(serviceName = "WSExpediente")
@Stateless()
public class WSExpediente {

    @EJB
    private ExpedienteFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "expediente") Expediente expediente) {
        ejbRef.create(expediente);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "expediente") Expediente expediente) {
        ejbRef.edit(expediente);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "expediente") Expediente expediente) {
        ejbRef.remove(expediente);
    }

    @WebMethod(operationName = "find")
    public Expediente find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Expediente> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Expediente> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }
    
}
