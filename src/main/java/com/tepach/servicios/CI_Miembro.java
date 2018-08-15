package com.tepach.servicios;

import com.tepach.beans.Miembro;

/**
 *
 * @author Anthony Tepach
 */
public interface CI_Miembro {
    public void registrar(Miembro miembro) throws Exception;
    public void actulizar(Miembro miembro) throws Exception;
    public void elimiar(Miembro miembro) throws Exception;
}
