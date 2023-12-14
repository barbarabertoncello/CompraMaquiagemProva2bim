/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDlgFornecedorNovo;

import bean.FornecedorBbd;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class FornecedorControle extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public FornecedorBbd getBean(int linha) {
        return (FornecedorBbd) lista.get(linha);
    }

    @Override
    public int getRowCount() {

        return lista.size();
    }

    public void addList(FornecedorBbd fornecedorBbd) {
        lista.add(fornecedorBbd);
    }

    public void removeList(int i) {
        lista.remove(i);
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
        return null;
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
            return "ativo";
        }
        if (columnIndex == 7) {
            return "email";
        }
        if (columnIndex == 8) {
            return "instagram";
        }
        if (columnIndex == 9) {
            return "telefone Fixo";
        }
        if (columnIndex == 10) {
            return "celular";
        }
        if (columnIndex == 11) {
            return "site";
        }
        if (columnIndex == 12) {
            return "cnpj";
        }
        if (columnIndex == 13) {
            return "facebook";
        }
        if (columnIndex == 14) {
            return "nome fantasia";
        }
        return "";
    }

}
