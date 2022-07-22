import java.util.Scanner;

public class Heap {
    int maxsize;
    int size;
    int[] h;
    private static final int front=1;
    //Constructor
Heap(int n){
    maxsize=n;
    size=0;
    h=new int[n+1];
    h[0]=Integer.MIN_VALUE;

}
public int parent(int pos){
    return pos/2;
}
public void insert(int v){
    if(size>=maxsize){
        return;
    }
    h[++size]=v;
    int current=size;
    while(h[current]<h[parent(current)]){
        int temp=h[current];
        h[current]=h[parent(current)];
        h[parent(current)]=temp;
        current=parent(current);
    }
}
public void print(){
    for(int i=1;i<=size/2;i++){
        System.out.println("Parent : "+h[i]+" Leftchild : "+h[2*i]+" Rightchild : "+h[2*i+1]);
    }
}

    private int leftChild(int pos) { return (2 * pos); }


    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }


    private boolean isLeaf(int pos)
    {

        if (pos > (size / 2)) {
            return true;
        }

        return false;
    }


    private void swap(int fpos, int spos)
    {

        int tmp;
        tmp = h[fpos];

        h[fpos] = h[spos];
        h[spos] = tmp;
    }

    private void minHeapify(int pos)
    {
        if(!isLeaf(pos)){

          
            int swapPos = h[leftChild(pos)]<h[rightChild(pos)]?leftChild(pos):rightChild(pos);

            if(h[pos]>h[leftChild(pos)] || h[pos]> h[rightChild(pos)]){
                swap(pos,swapPos);
                minHeapify(swapPos);
            }

        }
    }
public void deleteMin(){
    int popped = h[front];
    h[front] = h[size--];
    minHeapify(front);


}
    public static void main(String[] args) {
        int n=15;
        Heap minHeap=new Heap(n);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);
        minHeap.insert(23);
        minHeap.print();
        System.out.println( );
        minHeap.deleteMin();
        minHeap.print();
    }
}
