//* Verifique se uma palavra é palíndromo

package listaExerciciosRecursividade;

import javax.swing.JOptionPane;

public class Exercicio04 {
  public static void main(String[] args) {
    String word = JOptionPane.showInputDialog(null, "Digite a palavra a ser verificada.");
    Boolean result = call(word);
    JOptionPane.showMessageDialog(null, result ? "Esta palavra é um palíndromo" : "Esta palavra não é um palíndromo");
  }

  public static Boolean call(String word) {
    if (word.length() == 1) return true;
    
    String firstLetter = String.valueOf(word.charAt(0));
    String lastLetter = String.valueOf(word.charAt(word.length() - 1));

    if (! firstLetter.equals(lastLetter)) return false;
    return call(word.substring(1, word.length() - 1));
  }
}
