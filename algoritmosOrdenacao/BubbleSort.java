package algoritmosOrdenacao;

public class BubbleSort {
  public static void main(String[] args) {
    int[] list = {5, 3, 2, 4, 7};
    Utilities.showList("Lista Desordenada:", list);
    sort(list);
    Utilities.showList("Lista Ordenada:   ", list);
  }

  public static void sort(int[] list) {
    for (int i = 0; i < list.length; i++) {
      for (int j = 0; j < list.length - 1; j++) {
        if (list[j] > list[j + 1]) {
          int aux = list[j];
          list[j] = list[j + 1];
          list[j + 1] = aux;
        }
      }
    }
  }
}
