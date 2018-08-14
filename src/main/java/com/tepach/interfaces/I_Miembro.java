package com.tepach.interfaces;

import com.tepach.beans.Miembro;

/**
 *  
 * @author Anthony Tepach
 */
public interface I_Miembro {
    public void registrar(Miembro miembro) throws Exception;
    public void actualizar(Miembro miembro) throws Exception;
    public void eliminar(Miembro miembro)throws Exception;
}
