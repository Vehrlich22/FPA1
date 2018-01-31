/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpa1;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vehrlich22
 */
public class MappingTableModel extends DefaultTableModel {
    
    public MappingTableModel() {
        super(new Object [][] {
                {"#", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Key", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
            });
    }
            
    boolean[] canEdit = new boolean [] {
        false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
    };
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (rowIndex == 0) {
            return false;
        }
        return canEdit [columnIndex];
    }
    
}
