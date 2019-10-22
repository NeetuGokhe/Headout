package com.headout.demo;

public class CircularQueueInsertDelete {
    Integer[] arr=new Integer[5];
    Integer front =-1;
    Integer rear =-1;

    Integer Enqueue(int n){
        if(front == arr.length-1){
            return front;
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == null) {
                arr[i] = n;
                return arr[++rear];
            }else{
                arr[(arr.length-rear)%front]=n;
                return arr[++rear];
            }
        }
        return front;
    }
    Integer Dequeue(){
        if(front == -1){
            return -1;
        }else{
            if(front<=arr.length)
            return arr[++front];
        }
        return -1;
    }
    int getTop(){
        if(front != -1) {
            return arr[front];
        }
        return -1;
    }

    public static void main(String args[]){
    CircularQueueInsertDelete q = new CircularQueueInsertDelete();
        System.out.println("Enqueue : "+q.Enqueue(2));
        System.out.println("Enqueue : "+q.Enqueue(4));
        System.out.println("Enqueue : "+q.Enqueue(8));
        System.out.println("Enqueue : "+q.Enqueue(10));
        System.out.println("Enqueue : "+q.Enqueue(12));
        System.out.println("Dequeue : "+q.Dequeue());
        System.out.println("Dequeue : "+q.Dequeue());
        System.out.println("Current Element : "+q.getTop());
        System.out.println("Dequeue : "+q.Dequeue());
        System.out.println("Dequeue : "+q.Dequeue());

        System.out.println("Current Element : "+q.getTop());
}
}