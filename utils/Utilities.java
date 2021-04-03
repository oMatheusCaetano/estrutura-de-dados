package utils;

import javax.swing.JOptionPane;

public class Utilities {

  /**
  * Cria a representação de uma lista como String. Ex: [1, 2, 3].
  *
  * @param  list Lista que deve ser representada em String.
  * @return      representação da lista como String.
  */
  public static String getListAsString(int[] list) {
    String listAsString = "[";
    for (int i = 0; i < list.length; i++) {
      listAsString += i == list.length - 1 ? list[i] : list[i] + ", ";
    }
    listAsString += "]";
    return listAsString;
  }

  /**
  * Renderiza uma lista no console. Ex: [1, 2, 3].
  *
  * @param list Lista que deve ser renderizada.
  */
  public static void renderListOnConsole(String label, int[] list) {
    System.out.println(label + " " + getListAsString(list));
  }

  /**
  * Renderiza um pop up com um input para a insersão de um número inteiro.
  *
  * @param  message Mensagem que deve ser renderizada acima do input.
  * @return         Número inserido no input.
  */
  public static int readIntWithPopUp(String message) {
    Boolean done = false;
    int value = -1;

    do {
      try {
        value = Math.abs(Integer.parseInt(JOptionPane.showInputDialog(null, message)));
        done = true;
      } catch (NumberFormatException e) {
        showPopUpMessage("Por favor, digite um número inteiro.");
      }
    } while (! done);

    return value;
  }

  /**
  * Renderiza um pop up com um input para a insersão de uma String.
  *
  * @param  message Mensagem que deve ser renderizada acima do input.
  * @return         String inserida no input.
  */
  public static String readStringWithPopUp(String message) {
    return JOptionPane.showInputDialog(null, message);
  }

  /**
  * Renderiza um pop up com uma mensagem.
  *
  * @param  message Mensagem que deve ser renderizada no pop up.
  */
  public static void showPopUpMessage(String message) {
    JOptionPane.showMessageDialog(null, message);
  }

  /**
  * Renderiza um pop up para confirmação.
  *
  * @param  message Mensagem que deve ser renderizada no pop up.
  * @return         1 Caso a confirmação seja verdadeira e 0 caso contrário.
  */
  public static int showConfirmationPopUp(String message) {
    return JOptionPane.showConfirmDialog(null, message, "", 1);
  }
}
