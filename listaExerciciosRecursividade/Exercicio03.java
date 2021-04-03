//* A partir de um vetor de números inteiros, calcule a soma dos elementos do vetor

package listaExerciciosRecursividade;

import java.util.ArrayList;
import utils.Utilities;

public class Exercicio03 {
  public static void main(String[] args) {
    Boolean stop = false;
    ArrayList<Integer> array = new ArrayList<Integer>();

    while (! stop) {
      array.add(Utilities.readIntWithPopUp("Digite um número para adicionar ao cálculo."));
      stop = Utilities.showConfirmationPopUp("Deseja adicionar mais um número") == 1;
    }

    int result = call(array);
    Utilities.showPopUpMessage("O resultado é: " + result);
  }

  public static int call(ArrayList<Integer> array) {
    if (array.size() == 1) return array.get(0);
    int value = array.get(array.size() - 1);
    array.remove(array.size() - 1);
    return value + call(array);
  }
}
