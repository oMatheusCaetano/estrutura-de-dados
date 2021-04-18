public class BinaryTree {
  private Node root;

  public BinaryTree(Node root) {
    this.root = root;
  }

  public void insert(Node newNode) {
    this.insert(this.root, newNode);
  }

  private void insert(Node node, Node newNode) {
    if (newNode.getValue() < node.getValue()) {
      if (node.getLeft() == null) node.setLeft(newNode);
      else insert(node.getLeft(), newNode);
    } else {
      if (node.getRight() == null) node.setRight(newNode);
      else insert(node.getRight(), newNode);
    }
  }
}
