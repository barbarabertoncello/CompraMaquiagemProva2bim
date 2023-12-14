/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.CompraBbd;
import bean.CompraBbd;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class CompraControle extends AbstractTableModel{
    
        List lista = new ArrayList();

   public void setList(List lista) {
     this.lista = lista;
     this.fireTableDataChanged();
   }
   public CompraBbd getBean(int linha) {
        return (CompraBbd) lista.get(linha);
    } 
       public CompraBbd getList(int i){
    return (CompraBbd)lista.get(i);
    }
   public void addBean(CompraBbd compraBbd){
       lista.add(compraBbd);
       this.fireTableDataChanged();
   }
       public void removeBean(int index){
    lista.remove(index);
    this.fireTableDataChanged();
    }
    
    
    public void updateBean(int index, CompraBbd compraBbd){
        lista.set(index, compraBbd);
        this.fireTableDataChanged();    
    }
    @Override
    public int getRowCount() {

        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CompraBbd CompraBbd = (CompraBbd) lista.get(rowIndex);
        if (columnIndex == 0) {
            return CompraBbd.getIdcompraBbd();
        }
        if (columnIndex == 1) {
            return CompraBbd.getDataCompraBbd();
        }
        if (columnIndex == 2) {
            return CompraBbd.getFornecedorBbd();
        }
        if (columnIndex == 3) {
            return CompraBbd.getTotalBbd();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Data";
        }
        if (columnIndex == 2) {
            return "Fornecedor";
        }
        if (columnIndex == 3) {
            return "Total";
        }
        return "";
    }
}
