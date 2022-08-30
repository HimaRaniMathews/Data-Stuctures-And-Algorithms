 class Node{
    int value;
    Node next;

    public Node(int value){
        this.value = value;
        this.next = null;
    }

}

 public class Queue_Dynamic{
    private Node front, rear;

    public Queue_Dynamic(){
        this.front = this.rear = null;
    }

    public void enqueue(int value){
        Node new_node = new Node(value);
        if (this.rear == null){
            this.front = this.rear = new_node;
        } else {
            this.rear.next = new_node;
            this.rear = new_node;
        }
    }

    public Node dequeue(){
        Node element;
        if(this.front == null){
            element = null;
        } else {
            element = this.front;
            this.front = this.front.next;
            element.next = null;
        }

        if(this.front == null){
            this.rear = null;
        }

        return element;
    }

    public void printQueue(){
        Node node = this.front;
        if(node != null){
            while(node != null){
                System.out.println(node.value);
                node = node.next;
            }
        } else {
            System.out.println("Queue is empty ...");
        }
    }

}


class Main {
    public static void main(String[] args) {
        Queue_Dynamic queue = new Queue_Dynamic();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("The intial queue is following");
        queue.printQueue();
        System.out.println("The element which is dequeued: " + queue.dequeue().value);
        System.out.println("Now the queue is following");
        queue.printQueue();
    }
}
