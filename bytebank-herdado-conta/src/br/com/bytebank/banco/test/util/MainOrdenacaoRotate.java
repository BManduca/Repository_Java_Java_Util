package br.com.bytebank.banco.test.util;

import java.util.Collections;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class MainOrdenacaoRotate {

   public static void main(String args[]) {
     LinkedList<Integer> lista = new LinkedList<Integer>();
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



     int valor = Integer.parseInt(JOptionPane
     .showInputDialog("Digite o número de descolamento da lista:"));
     Collections.rotate(lista, valor);
     for (Integer i : lista) {
            System.out.println(i);
     }

   }
}
