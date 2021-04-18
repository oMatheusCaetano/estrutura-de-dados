package algoritmosOrdenacao;

import utils.Utilities;

public class BubbleSort {
  public static void main(String[] args) {
    int[] list = {6, 9, 2, 8, 3, 4, 1, 0, 5};
    Utilities.renderListOnConsole("Lista Desordenada:", list);
    sort(list);
    Utilities.renderListOnConsole("Lista Ordenada:   ", list);
  }

  /**
  * Realiza a ordenação de uma lista em ordem crescente utilizando o
  * algoritmo Bubble Sort.
  *
  * @param  list Lista que deve ser ordenada.
  */
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
