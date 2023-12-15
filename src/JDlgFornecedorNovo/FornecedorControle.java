/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDlgFornecedorNovo;

import bean.FornecedorBbd;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class FornecedorControle extends AbstractTableModel {

    List lista  ;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public FornecedorBbd getBean(int linha) {
        return (FornecedorBbd) lista.get(linha);
    }

    public void addList(FornecedorBbd fornecedorBbd) {
        lista.add(fornecedorBbd);
        this.fireTableDataChanged();
    }

    public void removeList(int i) {
        lista.remove(i);
        this.fireTableDataChanged();
    }
    public void recarregar(){
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 15;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FornecedorBbd FornecedorBbd = (FornecedorBbd) lista.get(rowIndex);
        if (columnIndex == 0) {
            return FornecedorBbd.getIdfornecedorBbd();
        }
        if (columnIndex == 1) {
            return FornecedorBbd.getNomeProprietarioBbd();
        }
        if (columnIndex == 2) {
            return FornecedorBbd.getSobrenomeBbd();
        }
        if (columnIndex == 3) {
            return FornecedorBbd.getCpfBbd();
        }
        if (columnIndex == 4) {
            return FornecedorBbd.getRgBbd();
        }
        if (columnIndex == 5) {
            return FornecedorBbd.getEnderecoBbd();
        }
        if (columnIndex == 6) {
            return FornecedorBbd.getAtivoBbd();
        }
        if (columnIndex == 7) {
            return FornecedorBbd.getEmailBbd();
        }
        if (columnIndex == 8) {
            return FornecedorBbd.getInstagramBbd();
        }
        if (columnIndex == 9) {
            return FornecedorBbd.getTelefoneFixoBbd();
        }
        if (columnIndex == 10) {
            return FornecedorBbd.getCelularBbd();
        }
        if (columnIndex == 11) {
            return FornecedorBbd.getSiteBbd();
        }
        if (columnIndex == 12) {
            return FornecedorBbd.getCnpjBbd();
        }
        if (columnIndex == 13) {
            return FornecedorBbd.getFacebookBbd();
        }
        if (columnIndex == 14) {
            return FornecedorBbd.getNomeFantasiaBbd();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "NOME";
        }
        if (columnIndex == 2) {
            return "SOBRENOME";
        }
        if (columnIndex == 3) {
            return "CPF";
        }
        if (columnIndex == 4) {
            return "RG";
        }
        if (columnIndex == 5) {
            return "Endereço";
        }
        if (columnIndex == 6) {
            return "Ativo";
        }
        if (columnIndex == 7) {
            return "Email";
        }
        if (columnIndex == 8) {
            return "Instagram";
        }
        if (columnIndex == 9) {
            return "Telefone Fixo";
        }
        if (columnIndex == 10) {
            return "Celular";
        }
        if (columnIndex == 11) {
            return "Site";
        }
        if (columnIndex == 12) {
            return "CNPJ";
        }
        if (columnIndex == 13) {
            return "Facebook";
        }
        if (columnIndex == 14) {
            return "Nome fantasia";
        }
        return "";
    }

}
