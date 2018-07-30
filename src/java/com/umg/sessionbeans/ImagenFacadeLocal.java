/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.sessionbeans;

import com.umg.entities.Imagen;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author EstelaChayoMonse
 */
@Local
public interface ImagenFacadeLocal {

    void create(Imagen imagen);

    void edit(Imagen imagen);

    void remove(Imagen imagen);

    Imagen find(Object id);

    List<Imagen> findAll();

    List<Imagen> findRange(int[] range);

    int count();
    
}
