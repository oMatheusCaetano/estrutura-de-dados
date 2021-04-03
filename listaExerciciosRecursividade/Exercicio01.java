//* Impressão de um número natural em base binária

package listaExerciciosRecursividade;

import utils.Utilities;

public class Exercicio01 {

  public static void main(String[] args) {
    int decimal = Utilities.readIntWithPopUp("Digite o número de decimal a ser calculado");
    String binary = call(decimal);
    Utilities.showPopUpMessage("O resultado é: " + binary);
  }

  /**
  * Retorna uma representação[String] de um número decimal convertido para binário.
  *
  * @param  decimal Número decimal que deve ser convertido para binário.
  * @return         Representação do número decimal em binário.
  */
  public static String call(int decimal) {
    return decimal <= 1 ? "1" : call(decimal / 2) + Integer.toString(decimal % 2);
  }
}