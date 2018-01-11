/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sthevan.latihanmvcjdbc.main;

import edu.sthevan.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.sthevan.latihanmvcjdbc.entity.Pelanggan;
import edu.sthevan.latihanmvcjdbc.error.PelangganException;
import edu.sthevan.latihanmvcjdbc.service.PelangganDao;
import edu.sthevan.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author 10116541-STHEVAN REYNALDO SIMAK LANDO - PBO12
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        PelangganDao dao =KingBarbershopDatabase.getPelangganDao();
        
        dao.deletePelanggan(1);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                    
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }
    
}
