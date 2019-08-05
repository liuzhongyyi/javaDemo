package com.lzy.demo05;

import org.junit.Test;

public class Node {

    int num;

    String name;

    Node nodeNext;

    Node(int num, String name) {
        this.num = num;
        this.name = name;
    }

    Node() {

    }

    public static void main(String[] args) {
        Node node = new Node(1, "zs");
        LinkList linkList = new LinkList();
        linkList.add(node);
        linkList.print();
    }

    @Override
    public String toString() {
        return "Node{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }


}

class LinkList {
    private Node Mainnode = new Node(0, "");

    public void add(Node node) {
        Node temp = new Node();
        temp = Mainnode;
        while (true) {
            if (temp.nodeNext == null) {
                //temp.nodeNext = node;
                break;
            }
            temp = temp.nodeNext;
        }
        temp.nodeNext = node;

    }


    void print() {
        Node tempNode = new Node();
        tempNode = this.Mainnode;
        while (tempNode.nodeNext != null) {
            tempNode = tempNode.nodeNext;
            System.out.println(tempNode);
        }
    }


}
