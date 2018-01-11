/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sthevan.latihanmvcjdbc.event;

import edu.sthevan.latihanmvcjdbc.entity.Pelanggan;
import edu.sthevan.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author 10116541-STHEVAN REYNALDO SIMAK LANDO - PBO12
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);

    
    
    
}
