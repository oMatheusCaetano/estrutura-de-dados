package algoritmosOrdenacao;

import utils.Utilities;

public class MergeSort {
  public static void main(String[] args) {
    int[] list = {5, 3, 2, 4, 7};
    Utilities.renderListOnConsole("Lista Desordenada:", list);
    sort(list, 0, list.length - 1);
    Utilities.renderListOnConsole("Lista Ordenada:   ", list);
  }

  public static void sort(int[] list, int start, int end) {
    if (start >= end) return;
    int middle = (start + end) / 2;
    sort(list, start, middle);
    sort(list, middle + 1, end);
    mix(list, start, middle, end);
  }

  public static void mix(int[] list, int start, int middle, int end) {
    int[] aux = new int[list.length];

    for (int i = start; i <= end; i++) {
      aux[i] = list[i];
    }

    int left = start;
    int right = middle + 1;

    for (int i = start; i <= end; i++) {
      if (left > middle) list[i] = aux[right++];
      else if (right > end) list[i] = aux[left++];
      else if (aux[left] < aux[right]) list[i] = aux[left++];
      else list[i] = aux[right++];
    }
  }
}
