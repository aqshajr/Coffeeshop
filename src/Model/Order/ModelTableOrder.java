/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Order;

import javax.swing.table.AbstractTableModel;

public class ModelTableOrder extends AbstractTableModel {

    java.util.List<ModelOrder> order;
    String kolom[] = {"ID", "Nama", "Menu", "Total Harga", "Size", "Hot/Ice", "Sweetness", "Topping", "dairy", "note"};

    public ModelTableOrder(java.util.List<ModelOrder> order) {
        this.order = order;
    }

    @Override
    public int getRowCount() {
        return order.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return order.get(rowIndex).getId();
            case 1:
                return order.get(rowIndex).getNama();
            case 2:
                return order.get(rowIndex).getMenu();
            case 3:
                return order.get(rowIndex).getTtlharga();
            case 4:
                return order.get(rowIndex).getSize();
            case 5:
                return order.get(rowIndex).getHot_ice();
            case 6:
                return order.get(rowIndex).getSweetness();
            case 7:
                return order.get(rowIndex).getTopping();
            case 8:
                return order.get(rowIndex).getDairy();
            case 9:
                return order.get(rowIndex).getNote();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return kolom[columnIndex];
    }
}
