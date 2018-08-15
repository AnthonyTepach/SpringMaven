package com.tepach.servicios;

import com.tepach.beans.Miembro;
import com.tepach.interfaces.I_Miembro;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Anthony Tepach
 */
public class C_Miembro implements CI_Miembro{
    @Autowired
    private I_Miembro i_Miembro;
    
    @Override
    public void registrar(Miembro miembro) throws Exception {
         try {
            i_Miembro.registrar(miembro);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void actulizar(Miembro miembro) throws Exception {
         try {
            i_Miembro.actualizar(miembro);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void elimiar(Miembro miembro) throws Exception {
         try {
            i_Miembro.eliminar(miembro);
        } catch (Exception e) {
            throw e;
        }
    }
    
}
