package utils;

import javax.swing.JOptionPane;

public class Utilities {
  public static void renderListOnConsole(String label, int[] list) {
    System.out.print(label + " [");
    for (int i = 0; i < list.length; i++) {
      System.out.print(i == list.length - 1 ? list[i] : list[i] + ",");
    }
    System.out.println("]");
  }

  public static int readIntWithPopUp(String message) {
    return Math.abs(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de decimal a ser calculado")));
  }

  public static String readStringWithPopUp(String message) {
    return JOptionPane.showInputDialog(null, "Digite o número de decimal a ser calculado");
  }

  public static void showPopUpMessage(String message) {
    JOptionPane.showMessageDialog(null, message);
  }

  public static int showConfirmationPopUp(String message) {
    return JOptionPane.showConfirmDialog(null, message, "", 1);
  }
}
