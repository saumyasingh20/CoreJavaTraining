package june8;

import java.util.ArrayList;

public class Priority_Queue<T> {
    ArrayList<Element<T>> heap;

    public Priority_Queue() {
         heap = new ArrayList<>();
    }

    public void enqueue(T value, int priority){
        Element<T> ele = new Element<>(value, priority);
        heap.add(ele);
        int childIndex = heap.size()-1;
        int parentIndex = (childIndex-1)/2;

        while (childIndex>0){
            if (heap.get(childIndex).priority < heap.get(parentIndex).priority){
                Element<T> temp = heap.get(childIndex);
                heap.set(childIndex,heap.get(parentIndex));
                heap.set(parentIndex,temp);
            }else {
                return;
            }
        }
    }
    public T dequeue() throws EmptyPQException {
        if (isEmpty())
            throw new EmptyPQException("Queue Underflow - Can not dequeue from Priority Queue!");
        Element<T> removed= heap.get(0);
        T ans = removed.value;

        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        int parentIndex=0;
        int leftChildIndex= 2*parentIndex+1;
        int rightChildIndex= 2*parentIndex +2;

        while(leftChildIndex<heap.size()){
            int minIndex= parentIndex;

            if(heap.get(leftChildIndex).priority < heap.get(minIndex).priority){
                minIndex= leftChildIndex;
            }
            if(rightChildIndex<heap.size() && (heap.get(rightChildIndex).priority < heap.get(minIndex).priority)){
                minIndex= rightChildIndex;
            }
            Element<T> temp= heap.get(minIndex);
            heap.set(minIndex, heap.get(parentIndex));
            heap.set(parentIndex, temp);
            parentIndex= minIndex;
            leftChildIndex= 2*parentIndex+1;
            rightChildIndex= 2*parentIndex +2;
        }
        return ans;


    }
    public T getMinimum() throws EmptyPQException {
        if (isEmpty())
            throw new EmptyPQException("Empty Priority Queue!!");

        return heap.get(0).value;
    }
    public int size(){
        return heap.size();
    }
    public void display() throws EmptyPQException {
        for (Element e: heap){
            System.out.println("Value - "+ e.value + " Priority - "+ e.priority);
        }
    }
    public boolean search(T elem){
        for (Element e: heap){
            if(e.value.equals(elem))
                return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(heap.size()==0)
            return true;
        return false;
    }

}
