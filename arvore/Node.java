public class Node {
    private Node leftNode;
    private Node rightNode;
    private int value;

    public Node(int value) {
        this.setValue(value);
    }

    public Node getLeftNode() {
        return this.leftNode;
    }

    public Node getRightNode() {
        return this.rightNode;
    }

    public int getValue() {
        return this.value;
    }

    public Node setLeftNode(Node node) {
        this.leftNode = node;
        return this;
    }

    public Node setRightNode(Node node) {
        this.rightNode = node;
        return this;
    }

    public Node setValue(int value) {
        this.value = value;
        return this;
    }
}
