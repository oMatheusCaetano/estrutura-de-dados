//* Impressão de um número natural em base binária

package listaExerciciosRecursividade;

import javax.swing.JOptionPane;

public class Exercicio01 {

  public static void main(String[] args) {
    int decimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de decimal a ser calculado"));
    String binary = decimalToBinary(decimal);
    JOptionPane.showMessageDialog(null, "O resultado é: " + binary);
  }

  public static String decimalToBinary(int decimal) {
    return decimal <= 1 ? "1" : decimalToBinary(decimal / 2) + Integer.toString(decimal % 2);
  }
}