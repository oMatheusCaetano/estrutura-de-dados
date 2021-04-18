package algoritmosOrdenacao;

import utils.Utilities;

public class ShellSort {
  public static void main(String[] args) {
    int[] list = {6, 9, 2, 8, 3, 4, 1, 0, 5};
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
          hasRepeated(list, h);
          j = j - h;
        }

        list[j] = key;
        hasRepeated(list, h);
      }

      h = h / 2;
    }
  }

  public static void hasRepeated(int[] list, int h) {
    Boolean r = false;

    for (int i = 0; i < list.length; i++) {
      for (int j = i + 1 ; j < list.length; j++) {
           if (list[i] == list[j]) {
            r = true;
           }
      }
    }

    if (!r) {
      Utilities.renderListOnConsole("H = " + h, list);
    }
  }
}
