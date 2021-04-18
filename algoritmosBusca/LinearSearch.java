package algoritmosBusca;

import utils.Utilities;

public class LinearSearch {

  public static void main(String[] args) {
    int[] list = {5, 4, 8, 3, 1, 2, 0};

    // int itemToSearch = Utilities.readIntWithPopUp("Informe o item a ser procurado na lista\n" + Utilities.getListAsString(list));
    int itemIndex = redu(list, 0, true);
    Utilities.showPopUpMessage(
      itemIndex + ""
    );
    // Utilities.showPopUpMessage(
    //   itemIndex == -1 
    //     ? "O item " + itemToSearch + " não foi encontrado na lista"
    //     : "O item " + itemToSearch + " é o " + (itemIndex + 1) + "° item da lista"
    // );
  }

  /**
  * Realiza a busca de um número inteiro em um array de números inteiros.
  * Utiliza o lógica de busca sequencial.
  *
  * @param  list         Lista na qual número deve ser procurado.
  * @param  itemToSearch Número que deve ser procurado dentro da lista.
  * @return              O index da lista onde o número foi encontrado 
  *                      ou -1 caso o número não seja encontrado na lista.
  */
  public static int search(int[] list, int itemToSearch) {
    for (int i = 0; i < list.length; i++) {
      if (list[i] == itemToSearch) return i;
    }
    return -1;
  }

  public static int sentinelSearch(int array[], int value) {
    int aux[] = new int[array.length + 1];
    int operacao = 0;

    for(int index = 0; index < array.length; index++) {
        aux[index] = array[index];
    }
    aux[aux.length - 1] = value;

    int index = 0;
    boolean find = false;
    while((find == false) && index < aux.length) {
        if(aux[index] == value) {
            find = true;
            continue;
        }
        index++;
    }

    return index;
  }

  public static int recursiveSentinelSearch(int array[], int value) {
    int aux[] = new int[array.length + 1];

    for(int index = 0; index < array.length; index++) {
        aux[index] = array[index];
    }

    aux[aux.length - 1] = value;

    for (int i = 0; i < array.length; i++) {
      if (array[i] == value) return i;
    }

    return aux[aux.length - 1];
  }

  public static int redu(int array[], int index, Boolean maior) {
    if (maior) {
      if (array.length - 1 == index) {
        return index;
      }
      int aux = redu(array, index + 1, maior);
      // Utilities.showPopUpMessage(array[index] > aux ? index + "" : aux + "");
      return array[index] < aux ? index : aux;
    } else {
      if (array.length - 1 == index) {
        return index;
      }
      int aux = redu(array, index + 1, maior);
      return array[index] > aux ? index : aux;
    }

  }

}
