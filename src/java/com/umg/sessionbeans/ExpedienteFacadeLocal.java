/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.sessionbeans;

import com.umg.entities.Expediente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author EstelaChayoMonse
 */
@Local
public interface ExpedienteFacadeLocal {

    void create(Expediente expediente);

    void edit(Expediente expediente);

    void remove(Expediente expediente);

    Expediente find(Object id);

    List<Expediente> findAll();

    List<Expediente> findRange(int[] range);

    int count();
    
}
