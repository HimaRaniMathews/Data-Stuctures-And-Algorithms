
public class Swap_Pair_byNode {
    Node head;
    Swap_Pair_byNode(){
        this.head=null;
    }
    public void insert(int val){
        Node newNode = new Node(val);
        newNode.next=head;
        head=newNode;
//        System.out.println(head.data);
    }
    public Node swap(){
        Node t=head;
        Node newHead=head.next;
        while(t!=null && t.next!=null){
            Node temp=t;
            t=t.next;
            temp.next=t.next;
            t.next=temp;
            t=temp.next;
            if (t != null && t.next != null) temp.next = t.next;
        }
        return newHead;
    }
    public void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Swap_Pair_byNode s=new Swap_Pair_byNode();
        for(int i=5;i>0;i--){
            s.insert(i);
        }
        Node m=s.swap();
        System.out.println("\nAfter Swapping");
        s.display(m);
    }
}
