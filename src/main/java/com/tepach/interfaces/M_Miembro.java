package com.tepach.interfaces;

import com.tepach.beans.Miembro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Anthony Tepach
 */
@Repository
public class M_Miembro implements I_Miembro {

    @Autowired
    private DataSource dataSource;
    private Connection con = null;
    private String sql;
    private PreparedStatement ps;

    @Override
    public void registrar(Miembro miembro) throws Exception {
        sql = "Insert into tb_miembro values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            con = dataSource.getConnection();
            ps = con.prepareStatement(sql);
            int a=ps.executeUpdate();
            if (a==0) {
                JOptionPane.showMessageDialog(null, "No se ingreso ningún Registro","Error",JOptionPane.INFORMATION_MESSAGE);
            }
            ps.close();
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    @Override
    public void actualizar(Miembro miembro) throws Exception {

    }

    @Override
    public void eliminar(Miembro miembro) throws Exception {

    }

}
