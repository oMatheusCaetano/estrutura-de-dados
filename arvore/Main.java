public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(new Node(5));

        binaryTree.insert(new Node(10));
        binaryTree.insert(new Node(1));
        binaryTree.insert(new Node(4));
        binaryTree.insert(new Node(6));
        binaryTree.insert(new Node(3));
        binaryTree.insert(new Node(20));

        String preOrder = binaryTree.postOrderReading();
    }
}
