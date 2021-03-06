//* Receba um vetor de números reais com 5 elementos.
//* Escreva uma função recursiva que inverta ordem dos elementos presentes no vetor

package listaExerciciosRecursividade;

import utils.Utilities;
import java.util.ArrayList;

public class Exercicio07 {
  public static void main(String[] args) {
    int stop = 5;
    ArrayList<Integer> array = new ArrayList<Integer>();

    while (stop != 0) {
      array.add(Utilities.readIntWithPopUp("Digite um número. Faltam [" + stop + "]"));
      stop--;
    }

    ArrayList<Integer> result = call(array);
    Utilities.showPopUpMessage("O resultado é " + result);
  }

  public static ArrayList<Integer> call(ArrayList<Integer> array) {
    return new ArrayList<Integer>();
  }
}