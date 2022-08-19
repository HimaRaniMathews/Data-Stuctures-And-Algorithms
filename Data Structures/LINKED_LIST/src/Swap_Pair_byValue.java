class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}
public class Swap_Pair_byValue {
    Node head;
Swap_Pair_byValue(){
    this.head=null;
}
    public void insert(int val){
        Node newNode = new Node(val);
        newNode.next=head;
        head=newNode;
//        System.out.println(head.data);
    }
    public void swap(){
        int t;
        Node temp=head;
        while(temp!=null && temp.next!=null){
            t=temp.data;
            temp.data=temp.next.data;
            temp.next.data=t;
            temp=temp.next.next;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Swap_Pair_byValue s=new Swap_Pair_byValue();
        for(int i=5;i>0;i--){
            s.insert(i);
        }
        System.out.println("Before Swapping");
        s.display();
        s.swap();
        System.out.println("\nAfter Swapping");
        s.display();
    }
}
