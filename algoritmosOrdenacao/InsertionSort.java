package algoritmosOrdenacao;

import utils.Utilities;

public class InsertionSort {
  public static void main(String[] args) {
    int[] list = {5, 3, 2, 4, 7};
    Utilities.renderListOnConsole("Lista Desordenada:", list);
    sort(list);
    Utilities.renderListOnConsole("Lista Ordenada:   ", list);
  }

  public static void sort(int[] list) {
    for (int i = 1; i < list.length; i++) {
      int key = list[i];
      int j = i - 1;

      while (j >= 0 && list[j] > key) {
        list[j + 1] = list[j];
        j--;
      }

      list[j + 1] = key;
    }
  }
}
