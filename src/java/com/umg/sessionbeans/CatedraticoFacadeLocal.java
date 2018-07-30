/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.sessionbeans;

import com.umg.entities.Catedratico;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author EstelaChayoMonse
 */
@Local
public interface CatedraticoFacadeLocal {

    void create(Catedratico catedratico);

    void edit(Catedratico catedratico);

    void remove(Catedratico catedratico);

    Catedratico find(Object id);

    List<Catedratico> findAll();

    List<Catedratico> findRange(int[] range);

    int count();
    
}
