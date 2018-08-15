package com.tepach.interfaces;

import com.tepach.beans.Miembro;
import java.awt.HeadlessException;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
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
            ps.setString(1, null);
            ps.setString(2, miembro.getPersona().getNombre());
            ps.setString(3, miembro.getPersona().getApaterno());
            ps.setString(4, miembro.getPersona().getAmaterno());
            ps.setString(5, miembro.getPersona().getFnacimineto());
            ps.setInt(6, miembro.getPersona().getEdad());
            ps.setString(7, miembro.getPersona().getSexo());
            ps.setString(8, miembro.getPersona().getEdo_civil());
            ps.setString(9, miembro.getDireccion().getEstado());
            ps.setInt(10, Integer.parseInt(miembro.getContacto().getLada()));
            ps.setString(11, miembro.getContacto().getNum_casa());
            ps.setString(12, miembro.getContacto().getNum_movil());
            ps.setString(13, miembro.getContacto().getEmail());
            ps.setString(14, miembro.getDireccion().getCalle());
            ps.setString(15, miembro.getDireccion().getNum_calle());
            ps.setString(16, miembro.getDireccion().getMucipio());
            ps.setString(17, miembro.getDireccion().getPais());
            ps.setString(18, miembro.getPersona().getRango_edad());
            ps.setString(19, miembro.getMinisterio().getNombre());
            ps.setDate(20, (java.sql.Date) new Date(new Date().getDate())) ;
            ps.setString(21, miembro.getImage().getNom_imagen());
            int a = ps.executeUpdate();
            if (a == 0) {
                JOptionPane.showMessageDialog(null, "No se ingreso ningún Registro", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
            ps.close();
        } catch (HeadlessException | NumberFormatException | SQLException ex) {
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
