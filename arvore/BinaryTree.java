public abstract class BinaryTree {
    private Node rootNode;
    private int height;
    private int balancingFactor;

    public BinaryTree(Node root) {
        this.setRootNode(root);
        this.setHeight(0);
        this.setBalancingFactor(0);
    }

    private String concatNodeValueToString(Node node, String string) {
        return string.length() == 0
            ? string + node.getValue()
            : string + ", " + node.getValue();
    }

    /*
    *--------------------------------------------------------------------------
    * Calculate tree height                                                   *
    *--------------------------------------------------------------------------
    */
    public int calculateHeight() {
        return this.calculateHeight(this.getRootNode());
    }

    private int calculateHeight(Node root) {
        if (root == null) return 0;
        int leftSideHeight = calculateHeight(root.getLeftNode()) + 1;
        int rightSideHeight = calculateHeight(root.getRightNode()) + 1;
        this.height = Math.max(leftSideHeight, rightSideHeight);
        return this.getHeight();
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
    * Getters                                                                 *
    *--------------------------------------------------------------------------
    */
    public Node getRootNode() { return this.rootNode; }

    public int getHeight() { return this.height; }

    public int getBalancingFactor() { return this.balancingFactor; }

    /*
    *--------------------------------------------------------------------------
    * Setters                                                                 *
    *--------------------------------------------------------------------------
    */
    public BinaryTree setRootNode(Node root) {
        this.rootNode = root;
        return this;
    }

    public BinaryTree setHeight(int height) {
        this.height = height;
        return this;
    }

    public BinaryTree setBalancingFactor(int balancingFactor) {
        this.balancingFactor = balancingFactor;
        return this;
    }
}
