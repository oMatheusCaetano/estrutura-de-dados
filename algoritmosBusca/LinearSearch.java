package algoritmosBusca;

import utils.Utilities;

public class LinearSearch {

  public static void main(String[] args) {
    int[] list = {4, 5, 8, 11, 56, 88, 1, 6, 89, 0, 111, 81, 7, 9, 5,};

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
}
