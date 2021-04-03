package algoritmosOrdenacao;

import utils.Utilities;

public class ShellSort {
  public static void main(String[] args) {
    int[] list = {5, 3, 2, 4, 7};
    Utilities.renderListOnConsole("Lista Desordenada:", list);
    sort(list);
    Utilities.renderListOnConsole("Lista Ordenada:   ", list);
  }

  /**
  * Realiza a ordenação recursiva de uma lista em ordem crescente utilizando o
  * algoritmo Shell Sort.
  *
  * @param  list Lista que deve ser ordenada.
  */
  public static void sort(int[] list) {
    int h = list.length / 2;

    while (h > 0) {
      for (int i = h; i < list.length; i++) {
        int key = list[i];
        int j = i;

        while (j >= h && list[j - h] > key) {
          list[j] = list[j - h];
          j = j - h;
        }

        list[j] = key;
      }

      h = h / 2;
    }
  }
}
