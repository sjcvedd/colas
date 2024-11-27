/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

class nodo{
    int dato;
    nodo sig;
    nodo(int num){
        this.dato = num;
    }
}

class queue{
    nodo front;
    nodo tail;
    boolean isEmpty(){
        return front == null;
    }
    void enqueue(int dato){
        if (this.isEmpty()){
            front = tail = new nodo(dato);
        }else{
            tail.sig = new nodo(dato);
            tail = tail.sig;
        }
    }
    nodo dequeue(){
        if (!isEmpty()){
            nodo temp = front;
            front = front.sig;
            temp.sig = null;
            if (isEmpty()){
                tail = null;
            }
            return temp;
        }else{
            System.out.println("La cola esta vacía");
        }
        return null;
    }
}


public class Colas {

    
    public static void main(String[] args) {
        queue c = new queue();
        c.enqueue(0);
        c.enqueue(1);
        c.enqueue(2);
        c.enqueue(3);
        c.enqueue(4);
        c.enqueue(5);
        c.enqueue(6);
        c.enqueue(7);
        c.enqueue(8);
        System.out.println("Sale: " + c.dequeue().dato);
        System.out.println("Sale: " + c.dequeue().dato);
        System.out.println("Sale: " + c.dequeue().dato);
        System.out.println("Sale: " + c.dequeue().dato);
    }
    
}