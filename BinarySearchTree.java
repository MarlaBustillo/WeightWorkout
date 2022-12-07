public class BinarySearchTree {
    class Node {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    Node root;

    BinarySearchTree() { root = null; }

    BinarySearchTree(int value) { root = new Node(value); }

    void insert(String key) { root = insertRec(root, Integer.parseInt(key)); }

    Node insertRec(Node root, int key)
    {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        else if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);


        return root;
    }


    void inorder() { inorderRec(root); }


    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();


        System.out.println("Here are the most common targets in losing fat: ");
        tree.insert("Under Arm Fat");
        tree.insert("Lower Belly Fat");
        tree.insert("Back Fat");


        tree.inorder();
    }
}

