public class BinaryTree {
    private Node rootNode;

    public BinaryTree(Node root) {
        this.setRootNode(root);
    }

    private String concatNodeValueToString(Node node, String string) {
        return string.length() == 0
            ? string + node.getValue()
            : string + ", " + node.getValue();
    }

    /*
    *--------------------------------------------------------------------------
    * Insertion                                                               *
    *--------------------------------------------------------------------------
    */
    public BinaryTree insert(Node node) {
        return this.insert(this.getRootNode(), node);
    }

    private BinaryTree insert(Node root, Node nodeToInsert) {
        if (nodeToInsert.getValue() < root.getValue()) {
            if (root.getLeftNode() == null) {
                root.setLeftNode(nodeToInsert);
                return this;
            }

            return insert(root.getLeftNode(), nodeToInsert);
        }

        if (root.getRightNode() == null) {
            root.setRightNode(nodeToInsert);
            return this;
        }

        return insert(root.getRightNode(), nodeToInsert);
    }

    /*
    *--------------------------------------------------------------------------
    * In Order Reading                                                        *
    *--------------------------------------------------------------------------
    */
    public String inOrderReading() {
        return this.inOrderReading(this.getRootNode(), "");
    }

    private String inOrderReading(Node root, String result) {
        if (root == null) return result;
        result = inOrderReading(root.getLeftNode(), result);
        result = concatNodeValueToString(root, result);
        return inOrderReading(root.getRightNode(), result);
    }

    /*
    *--------------------------------------------------------------------------
    * Pre Order Reading                                                       *
    *--------------------------------------------------------------------------
    */
    public String preOrderReading() {
        return this.preOrderReading(this.getRootNode(), "");
    }

    private String preOrderReading(Node root, String result) {
        if (root == null) return result;
        result = concatNodeValueToString(root, result);
        result = preOrderReading(root.getLeftNode(), result);
        return preOrderReading(root.getRightNode(), result);
    }

    /*
    *--------------------------------------------------------------------------
    * Post Order Reading                                                      *
    *--------------------------------------------------------------------------
    */
    public String postOrderReading() {
        return this.postOrderReading(this.getRootNode(), "");
    }

    private String postOrderReading(Node root, String result) {
        if (root == null) return result;
        result = postOrderReading(root.getLeftNode(), result);
        result = postOrderReading(root.getRightNode(), result);
        return concatNodeValueToString(root, result);
    }

    /*
    *--------------------------------------------------------------------------
    * Getters and Setters                                                     *
    *--------------------------------------------------------------------------
    */
    public Node getRootNode() {
        return this.rootNode;
    }

    public BinaryTree setRootNode(Node root) {
        this.rootNode = root;
        return this;
    }
}
