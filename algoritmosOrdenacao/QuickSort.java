package algoritmosOrdenacao;

import utils.Utilities;

public class QuickSort {
  public static void main(String[] args) {
    int[] list = {5, 3, 2, 4, 7};
    Utilities.renderListOnConsole("Lista Desordenada:", list);
    sort(list, 0, list.length - 1);
    Utilities.renderListOnConsole("Lista Ordenada:   ", list);
  }

  /**
  * Realiza a ordenação recursiva de uma lista em ordem crescente utilizando o
  * algoritmo Quick Sort.
  *
  * @param  list Lista que deve ser ordenada.
  */
  public static void sort(int[] list, int start, int end) {
    if (start >= end) return;
    int pivotIndex = separate(list, start, end);
    sort(list, start, pivotIndex - 1);
    sort(list, pivotIndex + 1, end);
  }

  public static int separate(int[] list, int start, int end) {
    int pivot = list[start];
    int left = start + 1;
    int right = end;

    while(left <= right) {
      if (list[left] <= pivot) left++;
      else if (list[right] > pivot) right--;
      else toggle(list, left, right);
    }

    list[start] = list[right];
    list[right] = pivot;
    return right;
  }

  public static void toggle(int[] list, int left, int right) {
    int aux = list[left];
    list[left] = list[right];
    list[right] = aux;
    left++;
    right--;
  }
}
