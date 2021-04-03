//* Verifique se uma palavra é palíndromo

package listaExerciciosRecursividade;

import utils.Utilities;

public class Exercicio04 {
  public static void main(String[] args) {
    String word = Utilities.readStringWithPopUp("Digite a palavra a ser verificada.");
    Boolean result = call(word);
    Utilities.showPopUpMessage(result ? "Esta palavra é um palíndromo" : "Esta palavra não é um palíndromo");
  }

  public static Boolean call(String word) {
    if (word.length() == 1) return true;
    
    String firstLetter = String.valueOf(word.charAt(0));
    String lastLetter = String.valueOf(word.charAt(word.length() - 1));

    if (! firstLetter.equals(lastLetter)) return false;
    return call(word.substring(1, word.length() - 1));
  }
}
