public class Node {
  private Node right;
  private Node left;
  private int value;

  public Node(int value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }

  /** GETTERS & SETTERS */
  public Node getRight() { return this.right; }
  public Node getLeft() { return this.left; }
  public int getValue() { return this.value; }

  public Node setRight(Node right) {
    this.right = right;
    return this;
  }

  public Node setLeft(Node left) {
    this.left = left;
    return this;
  }

  public Node setValue(int value) {
    this.value = value;
    return this;
  }
}
