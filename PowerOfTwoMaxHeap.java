import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PowerOfTwoMaxHeap {
    private int childDegree;  //child_degree
    private List<Integer>heap;

    // Constructor
    public PowerOfTwoMaxHeap(int childDegree){
        this.heap = new ArrayList<>();
        this.childDegree = childDegree;
    }

    public int parent(int i){
        return (int)(( i - 1 )/2);
    }
    public int leftChild(int i){
    return (2*i +1);
    }
    public int rightChild(int i){
    return (2*i +2);
    }

    public void intert(int item){
        heap.add(item);
        heapifyUp();
    }

    // pop max item
    public int popMax(){
        if(heap.isEmpty()){
            throw new IllegalStateException("Heap is empty");
        }

        // int lastValue = heap.remove(heap.size() - 1);
        int maxValue = heap.get(0);
        int lastValue = heap.remove(heap.size() - 1);
        if(!heap.isEmpty()){
            heap.set(0, lastValue);  // set the last value to the root
            heapifyDown();
        }
        return maxValue;
    }

    //building heap
    public void heapifyUp(){
        d
    }
    public void heapifyDown(){
        s
    }
}