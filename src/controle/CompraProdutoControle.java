/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.CompraProdutoBbd;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuario
 */
public class CompraProdutoControle extends AbstractTableModel {
    List lista = new ArrayList();
   
   public void setList(List lista) {
     this.lista = lista;
     this.fireTableDataChanged();
   }
   public CompraProdutoBbd getBean(int linha) {
        return (CompraProdutoBbd) lista.get(linha);
    } 
       public CompraProdutoBbd getList(int i){
    return (CompraProdutoBbd)lista.get(i);
    }
   public void addBean(CompraProdutoBbd compraProdutoBbd){
       lista.add(compraProdutoBbd);
       this.fireTableDataChanged();
   }
       public void removeBean(int index){
    lista.remove(index);
    this.fireTableDataChanged();
    }
    
    
    public void updateBean(int index, CompraProdutoBbd compraProduto){
        lista.set(index, compraProduto);
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
    public Object getValueAt(int row, int column) {
        CompraProdutoBbd compraProduto = (CompraProdutoBbd) lista.get(row);
        if (column == 0) {
           return compraProduto.getProdutoBbd();
        } 
        if (column == 1) {
           return compraProduto.getQuantidadeBbd();
        } 
        if (column == 2) {
           return compraProduto.getValorUnitarioBdd();
        } 
        if (column == 3) {
         // return compraProduto.getTotalBbd(); //ARRUMA ISSO
        } 
        return null;
   }
        @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Produto";
        }
        if (column == 1) {
            return "Quantidade";
        }
        if (column == 2) {
            return "Valor unitario";
        }
        if (column == 3) {
            return "Total";
        }
        return "";
    }
    
           
}


    