package tree;

public class Ttree {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int v) {
            this.value = v;
            left = right = null;
        }
    }

        public  void insert(Node n,int v){
            if(v<n.value){
                if(n.left!=null){
                    insert(n.left,v);
                }
                else{
                    n.left=new Node(v);
                }
            } else if (v>n.value) {
                if(n.right!=null){
                    insert(n.right,v);
                }
                else{
                    n.right=new Node(v);
                }

            }
        }
    static Node root= new Node(8);
        public void inorderTraversal(Node n){
            if(n==null){
                return;
            }
            inorderTraversal(n.left);
            System.out.print(n.value+" ");
            inorderTraversal(n.right);
        }

        public void PreTraversal(Node n){
            if(n==null){
                return;
            }
            System.out.print(n.value+" ");
            PreTraversal(n.left);
            PreTraversal(n.right);
        }
        public void PostTraversal(Node n){
            if(n==null) {
                return;
            }

                PostTraversal(n.left);
                PostTraversal(n.right);
                System.out.print(n.value + " ");

        }
void PostTraversal(){
    PostTraversal(root);
}
    void PreTraversal(){
        PreTraversal(root);
    }
    void inorderTraversal(){
        inorderTraversal(root);
    }
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }
    public static void main(String[] args) {
        Ttree t=new Ttree();

        t.insert(root,1);
        t.insert(root,3);
        t.insert(root,4);
        t.insert(root,10);

        t.insert(root,6);
        t.insert(root,7);
        t.insert(root,14);
        t.insert(root,9);
        System.out.println("Post Order");
        t.PostTraversal();
        System.out.println(" ");
        System.out.println("Pre Order");
        t.PreTraversal();
        System.out.println(" ");
        System.out.println("In Order");
        t.inorderTraversal();

    }


}

