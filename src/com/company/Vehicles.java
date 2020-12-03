package com.company;

public class Vehicles {
    private vNode head;



    public Vehicles(){
        head = null;
    }

    public boolean isEmpty(){

        return head == null;

    }

    public void add(Vehicle v){


        if(isEmpty())
            head = new vNode(v, null);
        else{

            vNode temp = head;
            while(temp.getNext() != null)
                temp = temp.getNext();

            temp.setNext(new vNode(v, null));


        }
    }

    public void showAll(){
        if (head==null)
            System.out.println("There is nothing in the list");

        else{

            vNode temp = head;
            while(temp != null){

                System.out.println(temp.getValue());

                temp = temp.getNext();
            }
        }

    }

}
