public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode("Główna");

        TreeNode subcategory1 = new TreeNode("sub1");
        TreeNode subcategory2 = new TreeNode("sub2");

        TreeNode subcategory3 = new TreeNode("sub3");
        TreeNode subcategory4 = new TreeNode("sub4");

        root.addChildNode(subcategory1);
        root.addChildNode(subcategory2);

        subcategory2.addChildNode(subcategory3);
        subcategory2.addChildNode(subcategory4);


        TreeItem treeItem0 = new TreeItem("Zerowy");
        TreeItem treeItem1 = new TreeItem("Pierwszy");
        TreeItem treeItem2 = new TreeItem("Drugi");
        TreeItem treeItem3 = new TreeItem("Trzeci");

        subcategory1.addItem(treeItem0);
        subcategory2.addItem(treeItem1);
        subcategory4.addItem(treeItem2);
        subcategory4.addItem(treeItem3);


        printTreeNode(subcategory2);

    }


    private static void printTreeNode(TreeNode node) {
        System.out.println("Node: " + node.getName());

        System.out.println("Items:");
        for(TreeItem item : node.getItems()) {
            System.out.println(" * " + item.getName());
        }

        for(TreeNode subNode : node.getChildren()) {
            printTreeNode(subNode);
        }
    }
}
