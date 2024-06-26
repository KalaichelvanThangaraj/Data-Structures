//class to create nodes
class Node{
    int Key;
    Node left,right;
    public Node(int item){
        Key=item;
        left=right=null;
    }
}
class BinaryTree{
    Node root;
    //Traverse tree
    public void TraverseTree(Node node){
        if(node!=null){
            TraverseTree(node.left);
            System.out.print(" "+ node.Key);
            TraverseTree(node.right);
        }
    }
    public static void main(String[] args) {
        //create an object of Binary Tree
        BinaryTree Tree =new BinaryTree();

        //create nodes of the tree

        Tree.root = new Node(1);
        Tree.root.left = new Node(2);
        Tree.root.right = new Node(3);
        Tree.root.left.left = new Node(4);

        System.out.print("\nBinary Tree :");
        Tree.TraverseTree(Tree.root);
    }

}



 /*output

Binary Tree : 4 2 1 3*/