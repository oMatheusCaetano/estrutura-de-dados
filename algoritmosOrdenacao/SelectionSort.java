package algoritmosOrdenacao;

import utils.Utilities;

public class SelectionSort {
  public static void main(String[] args) {
    int[] list = {5, 3, 2, 4, 7};
    Utilities.renderListOnConsole("Lista Desordenada:", list);
    sort(list);
    Utilities.renderListOnConsole("Lista Ordenada:   ", list);
  }

  /**
  * Realiza a ordenação recursiva de uma lista em ordem crescente utilizando o
  * algoritmo Selection Sort.
  *
  * @param  list Lista que deve ser ordenada.
  */
  public static void sort(int[] list) {
    for (int i = 0; i < list.length; i++) {
      int min = i;

      for (int j = i + 1; j < list.length; j++) {
        if (list[j] < list[min]) min = j;
      }

      int aux = list[i];
      list[i] = list[min];
      list[min] = aux;
    }
  }
}
