package com.headout.demo;

public class QueueInsertDelete {
    Integer[] arr=new Integer[10];
    Integer arrIndex=-1;

    Integer Enqueue(int n){
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == null) {
                arr[i] = n;
                return arr[++arrIndex];
            }

        }
        return arrIndex;
    }
    Integer Dequeue(){
        if(arrIndex == -1){
            return -1;
        }else{
            return arr[arrIndex--];
        }
    }
    int getTop(){
        if(arrIndex!= -1) {
            return arr[arrIndex];
        }
        return -1;
    }

    public static void main(String args[]){
    QueueInsertDelete q = new QueueInsertDelete();
        System.out.println("Enqueue : "+q.Enqueue(2));
        System.out.println("Enqueue : "+q.Enqueue(4));
        System.out.println("Enqueue : "+q.Enqueue(8));
        System.out.println("Dequeue : "+q.Dequeue());
        System.out.println("Dequeue : "+q.Dequeue());
        System.out.println("Dequeue : "+q.Dequeue());
        System.out.println("Dequeue : "+q.Dequeue());
        System.out.println("Dequeue : "+q.Dequeue());
        System.out.println("Current Element : "+q.getTop());
}
}