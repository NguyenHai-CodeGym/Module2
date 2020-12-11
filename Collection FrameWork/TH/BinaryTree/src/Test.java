public class Test {
    public static void main(String[] args) {
        TreeNode<Integer> treeNode = new TreeNode<>(60);
        treeNode.left = new TreeNode<>(55);
        treeNode.right = new TreeNode<>(100);

        System.out.println(treeNode.search(55));


    }
}
