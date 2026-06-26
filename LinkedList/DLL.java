package LinkedList;

import java.sql.SQLOutput;

public class DLL {

    private Node head;



//    private Node tail;

    int size;

    public DLL() {
        this.size = 0;
    }


    public void insertFront(int value){

        Node node=new Node(value);
        node.next=head;
        node.prev=null;

        if(head!=null){
            head.prev=node;

        }
        head=node;
        size++;
    }


   public void insertLast(int val){

        Node node=new Node(val);
        Node temp=head;

        if(head==null){
            node.prev=null;
            head=node;
            return;
        }


        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
        node.next=null;
size++;
    }


    public void insert(int after,int val){
            Node p=find(after);
            if(p==null){
                System.out.println("doesnt exist");return;

            }

            Node node=new Node(val);
            node.next=p.next;
            p.next=node;
            node.prev=p;
            if(node.next!=null) {
                node.next.prev = node;
            }
            size++;
    }



    //Find by value
    public Node find(int value){
         Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }


    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    //deletion

    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        head.prev=null;
        if(head==null){
            return -1;
        }
        size--;
        return val;
    }

    public int deleteLast(){
       Node secondLast=get(size-2);
        int val=secondLast.next.value;
        secondLast.next=null;
        return val;

    }

    //need to implement delete middle










    public void display(){
        Node node=head;
        Node last=null;
        while(node!=null){
            System.out.print(node.value+ " -> ");
            last=node;
            node=node.next;

        }
    System.out.println("END");


    System.out.println("Print in rev");
        while(last!=null){
            System.out.print(last.value+ " -> ");
            last=last.prev;
        }
    System.out.print("START");
}





    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
