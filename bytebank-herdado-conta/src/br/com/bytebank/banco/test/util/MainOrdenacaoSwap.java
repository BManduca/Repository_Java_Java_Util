package br.com.bytebank.banco.test.util;

import java.util.Collections;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class MainOrdenacaoSwap {

       public static void main(String args[]) {
             LinkedList<Integer> lista =
             new LinkedList<Integer>();
             lista.add(new Integer(10));
             lista.add(new Integer(20));
             lista.add(new Integer(5));
             lista.add(new Integer(3));
             lista.add(new Integer(10));
             lista.add(new Integer(-5));
             lista.add(new Integer(6));
             lista.add(new Integer(8));
             lista.add(new Integer(-2));
             lista.add(new Integer(4));
             lista.add(new Integer(12));



             int pos1 = Integer.parseInt(JOptionPane
             .showInputDialog("Digite a primeira posição:"));
             int pos2 = Integer.parseInt(JOptionPane
             .showInputDialog("Digite a segunda posição:"));

             Collections.swap(lista, pos1, pos2);

             for (Integer i : lista) {
                    System.out.println(i);
             }

       }
}
