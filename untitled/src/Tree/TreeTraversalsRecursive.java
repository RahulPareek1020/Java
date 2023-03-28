package Tree;

public class TreeTraversalsRecursive {
    public static void main(String[] args) {
        //Create Tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("InOrderTraversal");
        InOrderTraversal(root);
        System.out.println("\nInorder done");
        System.out.println("preOrderTraversal");
        preOrderTraversal(root);
        System.out.println("\npreOrder done");
        System.out.println("postOrderTraversal");
        postOrderTraversal(root);
        System.out.println("\npostOrder done");
    }

    static void InOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }

        InOrderTraversal(root.left);
        System.out.print(root.val + " ");
        InOrderTraversal(root.right);
    }

    static void preOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }

        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    static void postOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }
}
