/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author u04863235100
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... vetComp) {
        for (int i = 0; i < vetComp.length; i++) {
            vetComp[i].setEnabled(valor);
        }
    }

    public static void limparCampos(JComponent... vetComp) {
        for (int i = 0; i < vetComp.length; i++) {

            if (vetComp[i] instanceof JTextField) {
                JTextField comp = (JTextField) vetComp[i];
                comp.setText("");
            }
            if (vetComp[i] instanceof JComboBox) {
                JComboBox comp = (JComboBox) vetComp[i];
                comp.setSelectedIndex(-1);
            }
            if (vetComp[i] instanceof JCheckBox) {
                JCheckBox comp = (JCheckBox) vetComp[i];
                comp.setSelected(false);
            }
            if (vetComp[i] instanceof JPasswordField) {
                JPasswordField comp = (JPasswordField) vetComp[i];
                comp.setText("");
            }
            if (vetComp[i] instanceof JTextPane) {
                JTextPane comp = (JTextPane) vetComp[i];
                comp.setText("");
            }
        }
    }

    public static boolean perguntar(String mensagem){
         return JOptionPane.showConfirmDialog(null, mensagem, "Pergunta", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }
     
     public static boolean perguntarCompra (String mensagem){
         return JOptionPane.showConfirmDialog(null, mensagem, "Pergunta", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }
     
     public static boolean perguntarExcluirTabela(String mensagem){
         return JOptionPane.showConfirmDialog(null, mensagem, "Pergunta", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }
     public static void mensagem(String mensagem){
         JOptionPane.showMessageDialog(null, mensagem);
     }
     
    public static int strInt(String valor) {
        return Integer.valueOf(valor); //integer espera uma string e retorna um int || pega o cad string q passou como parametro
    }

    public static String intStr(int valor) {
        return String.valueOf(valor); //pegou o int e mudou para string
    }

    public static double strDouble(String cad) {
        return Double.valueOf(cad);
    }

    public static String doubleStr(double num) {
         return String.valueOf(num);
    }

    public static Date strDate(String data) {
        try {
             SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy");
             return formato.parse(data);
         } catch (ParseException ex){
             System.out.println("Erro na conversao da data.");
         }
         return null;
    }

    public static String dateStr(Date data) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
         return formato.format(data);
    }

   
}
