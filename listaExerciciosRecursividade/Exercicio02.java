//* Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4)

package listaExerciciosRecursividade;

import javax.swing.JOptionPane;

public class Exercicio02 {
  
  public static void main(String[] args) {
    int firstNumber  = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número."));
    int secondNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número."));
    int result = call(firstNumber, secondNumber);
    JOptionPane.showMessageDialog(null, "O resultado é: " + result);
  }

  public static int call(int firstNumber, int secondNumber) {
    return firstNumber == 1 ? secondNumber : secondNumber + call(--firstNumber, secondNumber);
  }
}


