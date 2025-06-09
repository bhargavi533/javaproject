package Bhargavi;
class TreeNode {
    String data;
    TreeNode left, right;

    TreeNode(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeExample {

    TreeNode root;

    
    void printRoot() {
        if (root != null)
            System.out.println("Root: " + root.data);
        else
            System.out.println("Tree is empty.");
    }

    
    void printChildren(TreeNode node) {
        if (node != null) {
            System.out.println("Node: " + node.data);
            System.out.println("Left Child: " + (node.left != null ? node.left.data : "null"));
            System.out.println("Right Child: " + (node.right != null ? node.right.data : "null"));
        }
    }

    
    void preOrder(TreeNode node) {
        if (node == null) return;
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    
    int countNodes(TreeNode node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    
    int countLeafNodes(TreeNode node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

    
    void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }

    
    TreeNode mirror(TreeNode node) {
        if (node == null) return null;
        TreeNode temp = node.left;
        node.left = mirror(node.right);
        node.right = mirror(temp);
        return node;
    }

    
    void printPaths(TreeNode node, String path) {
        if (node == null) return;
        path += node.data + " ";
        if (node.left == null && node.right == null) {
            System.out.println("Path: " + path);
        } else {
            printPaths(node.left, path);
            printPaths(node.right, path);
        }
    }

    
    boolean isEmpty() {
        return root == null;
    }

    public static void main(String[] args) {
        BinaryTreeExample tree = new BinaryTreeExample();

        
        tree.root = new TreeNode("Mom");
        tree.root.left = new TreeNode("Dad");
        tree.root.right = new TreeNode("You");

       
        tree.printRoot();
        tree.printChildren(tree.root);
        System.out.println("\nTop to Bottom (Pre-order):");
        tree.preOrder(tree.root);

        System.out.println("\nTotal Nodes: " + tree.countNodes(tree.root));
        System.out.println("Leaf Nodes: " + tree.countLeafNodes(tree.root));

        System.out.println("\nIn-order Traversal:");
        tree.inOrder(tree.root);

        System.out.println("\nMirrored Tree In-order:");
        tree.mirror(tree.root);
        tree.inOrder(tree.root);

        System.out.println("\nAll Paths from Top to Leaves:");
        tree.printPaths(tree.root, "");

        System.out.println("\nIs Tree Empty? " + tree.isEmpty());
    }
}
