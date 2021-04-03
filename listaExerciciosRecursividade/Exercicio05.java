//* Receba um número inteiro positivo N e calcule o somatório dos números de 1 a N

package listaExerciciosRecursividade;

import utils.Utilities;

public class Exercicio05 {
  public static void main(String[] args) {
    int number = Utilities.readIntWithPopUp("Digite o número a ser calculado.");
    int result = call(number);
    Utilities.showPopUpMessage("O resultado é " + result);
  }

  public static int call(int number) {
    return number == 1 ? 1 : number + call(--number);
  }
}
