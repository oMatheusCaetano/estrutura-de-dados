package algoritmosOrdenacao;

public class Utilities {
  public static void showList(String label, int[] list) {
    System.out.print(label + " [");
    for (int i = 0; i < list.length; i++) {
      System.out.print(i == list.length - 1 ? list[i] : list[i] + ",");
    }
    System.out.println("]");
  }
}
