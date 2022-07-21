public class BInary_Search_Tree {
    class Node{
        int val;
        Node left,right;
        public Node(int v){
            val=v;
            left=right=null;
        }
    }
    Node root;
    BInary_Search_Tree(){
        root=null;
    }
    public  void insert(int v){
        root=insertNode(root,v);
    }
    public Node insertNode(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }

        if(val<root.val){
            root.left=insertNode(root.left,val);
        } else if (val>root.val) {
            root.right=insertNode(root.right,val);
        }
        return root;
    }
    public void Inorder(){
        inorder(root);
    }
    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.val+ " ");
            inorder(root.right);
        }
    }
    public  void delete(int v){
        root=delete(root,v);
    }
    Node delete(Node root,int v){
        if(root==null){
            return root;
        }
        if(v<root.val){
            root.left=delete(root.left,v);
        } else if (v>root.val) {
            root.right=delete(root.right,v);
        }
        else{
            if(root.left==null && root.right==null){
                root=null;
            } else if (root.right!=null) {
                root.val=successor(root);
                root.right=delete(root.right,root.val);
            }else{
                root.val=predeccessor(root);
                root.left=delete(root.left,root.val);
            }
        }
        return root;
    }
 int successor(Node root){
        root=root.right;
        while (root.left!=null){
            root=root.left;
        }
        return root.val;
 }
    int predeccessor(Node root){
        root=root.left;
        while (root.right!=null){
            root=root.right;
        }
        return root.val;
    }
    public static void main(String[] args) {
        BInary_Search_Tree b=new BInary_Search_Tree();
        b.insert(5);
        b.insert(3);
        b.insert(2);
        b.insert(4);
        b.insert(7);
        b.insert(6);
        b.Inorder();
        b.delete(5);
        System.out.println();
        b.Inorder();
    }
}
