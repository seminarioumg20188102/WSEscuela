/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.servicio;

import com.umg.entities.Catedratico;
import com.umg.sessionbeans.CatedraticoFacadeLocal;
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
@WebService(serviceName = "WSCatedratico")
@Stateless()
public class WSCatedratico {

    @EJB
    private CatedraticoFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "catedratico") Catedratico catedratico) {
        ejbRef.create(catedratico);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "catedratico") Catedratico catedratico) {
        ejbRef.edit(catedratico);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "catedratico") Catedratico catedratico) {
        ejbRef.remove(catedratico);
    }

    @WebMethod(operationName = "find")
    public Catedratico find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Catedratico> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Catedratico> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }
    
}
