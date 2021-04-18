public class BinaryTree {
  private Node root;

  public BinaryTree(Node root) {
    this.root = root;
  }

  /** PRE ORDER READING */
  public void readPreOrder() {
    this.readPreOrder(this.root);
  }

  private void readPreOrder(Node node) {
    if (node != null) {
      System.out.print(node.getValue() + " ");
      this.readPreOrder(node.getLeft());
      this.readPreOrder(node.getRight());
    }
  }

  /** IN ORDER READING */
  public void readInOrder() {
    this.readInOrder(this.root);
  }

  private void readInOrder(Node node) {
    if (node != null) {
      this.readInOrder(node.getLeft());
      System.out.print(node.getValue() + " ");
      this.readInOrder(node.getRight());
    }
  }

  /** POST ORDER READING */
  public void readPostOrder() {
    this.readPostOrder(this.root);
  }

  private void readPostOrder(Node node) {
    if (node != null) {
      this.readPostOrder(node.getLeft());
      this.readPostOrder(node.getRight());
      System.out.print(node.getValue() + " ");
    }
  }

  /** INSERTION */
  public void insert(Node newNode) {
    this.insert(this.root, newNode);
  }

  private void insert(Node node, Node newNode) {
    if (newNode.getValue() < node.getValue())
      this.insertLeft(node, newNode);
    else
      this.insertRight(node, newNode);
  }

  private void insertLeft(Node node, Node newNode) {
    if (node.getLeft() == null) node.setLeft(newNode);
    else insert(node.getLeft(), newNode);
  }

  private void insertRight(Node node, Node newNode) {
    if (node.getRight() == null) node.setRight(newNode);
    else insert(node.getRight(), newNode);
  }
}
