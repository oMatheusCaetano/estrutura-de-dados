//* Impressão de um número natural em base binária

package listaExerciciosRecursividade;

import utils.Utilities;

public class Exercicio01 {

  public static void main(String[] args) {
    int decimal = Utilities.readIntWithPopUp("Digite o número de decimal a ser calculado");
    String binary = decimalToBinary(decimal);
    Utilities.showPopUpMessage("O resultado é: " + binary);
  }

  public static String decimalToBinary(int decimal) {
    return decimal <= 1 ? "1" : decimalToBinary(decimal / 2) + Integer.toString(decimal % 2);
  }
}