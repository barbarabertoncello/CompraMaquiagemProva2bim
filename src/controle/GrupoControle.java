 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.GrupoBbd;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class GrupoControle extends AbstractTableModel{
    
        List lista = new ArrayList();

   public void setList(List lista) {
     this.lista = lista;
     this.fireTableDataChanged();
   }
   public GrupoBbd getBean(int linha) {
        return (GrupoBbd) lista.get(linha);
    } 
       public GrupoBbd getList(int i){
    return (GrupoBbd)lista.get(i);
    }
   public void addBean(GrupoBbd grupoBbd){
       lista.add(grupoBbd);
       this.fireTableDataChanged();
   }
       public void removeBean(int index){
    lista.remove(index);
    this.fireTableDataChanged();
    }
    
    
    public void updateBean(int index, GrupoBbd grupoBbd){
        lista.set(index, grupoBbd);
        this.fireTableDataChanged();    
    }
    @Override
    public int getRowCount() {

        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GrupoBbd grupoBbd = (GrupoBbd) lista.get(rowIndex);
        if (columnIndex == 0) {
            return grupoBbd.getIdGrupoBbd();
        }
        if (columnIndex == 1) {
            return grupoBbd.getNomeBbd();
        }
        if (columnIndex == 2) {
            return grupoBbd.getTipoBbd();
        }
        if (columnIndex == 3) {
            return grupoBbd.getCategoriaBbd();
        }
        if (columnIndex == 4) {
            return grupoBbd.getAtivoBbd();
        }
        return null;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Nome";
        }
        if (columnIndex == 2) {
            return "Tipo";
        }
        if (columnIndex == 3) {
            return "Categoria";
        }
        if (columnIndex == 4) {
            return "Ativo";
        }
        return "";
    }
}
