public class Main {
  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree(new Node(6));

    tree.insert(new Node(1));
    tree.insert(new Node(7));
    tree.insert(new Node(8));

    System.out.print(tree);
  }
}
