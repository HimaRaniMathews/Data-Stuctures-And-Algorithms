import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int val) {
        this.data = val;
        this.next = null;
    }
}

public class Stack_Dynamic {

    Node top = null;

    public void push(int v) {
        Node newNode = new Node(v);
        newNode.next = top;
        top = newNode;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return;
        }
        System.out.println("Element to be deleted : " + top.data);
        top = top.next;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("No Elements Present to be deleted");
            return;
        }
        System.out.println("Element to be deleted : " + top.data);
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
if(isEmpty()){
    return;
}
Node temp=top;
while (temp!=null){
    System.out.println(temp.data);
    temp=temp.next;
}
    }

    public static void main(String[] args) {
        Stack_Dynamic stack = new Stack_Dynamic();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        stack.pop();
        stack.display();
        stack.peek();
        stack.display();
    }
}
