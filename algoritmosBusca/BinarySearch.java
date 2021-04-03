package algoritmosBusca;

import utils.Utilities;

public class BinarySearch {

  public static void main(String[] args) {
    int[] list = {4, 7, 8, 10, 14, 21, 22, 36, 62, 77, 81, 91, 100};

    int itemToSearch = Utilities.readIntWithPopUp("Informe o item a ser procurado na lista\n" + Utilities.getListAsString(list));
    int itemIndex = search(list, itemToSearch);
    Utilities.showPopUpMessage(
      itemIndex == -1 
        ? "O item " + itemToSearch + " não foi encontrado na lista"
        : "O item " + itemToSearch + " é o " + (itemIndex + 1) + "° item da lista"
    );
  }

  /**
  * Realiza a busca de um número inteiro em um array de números inteiros.
  * Utiliza o lógica de busca binária.
  *
  * @param  list         Lista na qual número deve ser procurado.
  * @param  itemToSearch Número que deve ser procurado dentro da lista.
  * @return              O index da lista onde o número foi encontrado 
  *                      ou -1 caso o número não seja encontrado na lista.
  */
  public static int search(int[] list, int itemToSearch) {
    int middle        = 0;
    int left          = 0;
    int right         = list.length - 1;
    Boolean itemFound = false;

    while (left <= right && !itemFound) {
      middle = (left + right) / 2;

      if (list[middle] == itemToSearch) itemFound = true;
      else if (list[middle] < itemToSearch) left = middle + 1;
      else right = middle - 1;
    }

    return itemFound ? middle : -1;
  }
}
