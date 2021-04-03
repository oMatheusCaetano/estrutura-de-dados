//* Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4)

package listaExerciciosRecursividade;

import utils.Utilities;

public class Exercicio02 {
  
  public static void main(String[] args) {
    int firstNumber  = Utilities.readIntWithPopUp("Digite o primeiro número.");
    int secondNumber = Utilities.readIntWithPopUp("Digite o segundo número.");
    int result       = call(firstNumber, secondNumber);
    Utilities.showPopUpMessage("O resultado é: " + result);
  }

  public static int call(int firstNumber, int secondNumber) {
    return firstNumber == 1 ? secondNumber : secondNumber + call(--firstNumber, secondNumber);
  }
}


