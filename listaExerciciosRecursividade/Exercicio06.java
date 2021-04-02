//* Receba dois inteiros positivos k e n e calcule k^n.
//* Utilize apenas multiplicações. O programa principal deve solicitar 
//* ao usuário os valores de k e n e imprimir o resultado da chamada da função

package listaExerciciosRecursividade;

import javax.swing.JOptionPane;

public class Exercicio06 {
  public static void main(String[] args) {
    int k = Math.abs(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de K.")));
    int n = Math.abs(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de N.")));
    int result = call(k, n);
    JOptionPane.showMessageDialog(null, "O resultado é " + result);
  }

  public static int call(int k, int n) {
    return n == 1 ? k : k * call(k, --n);
  }
}
