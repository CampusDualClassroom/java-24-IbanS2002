package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String>cola= new LinkedList<>();
        cola.offer("Smith");
        cola.offer("Montessori");
        cola.offer("Peralta");
        cola.offer("House");
        return cola;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        String aux="";
       while(aux !=null){
           System.out.println(aux);
           aux = queue.poll();
       }
    }

    public static void main(String[] args) {
        Queue<String> myQueue = createQueue();
        printAndEmptyQueue(myQueue);
    }

}
