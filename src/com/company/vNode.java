package com.company;

public class vNode {
    public Vehicle value;
    public vNode next;

    public vNode(Vehicle value, vNode next) {

        this.value = value;
        this.next = next;


    }

    public vNode getNext() {
        return next;
    }

    public Vehicle getValue() {

        return value;
    }

    public void setNext(vNode next) {
        this.next = next;
    }

}