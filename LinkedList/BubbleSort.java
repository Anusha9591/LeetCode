package LinkedList;

public class BubbleSort {

    private Node head;

    private Node tail;

    int size=0;
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    public Node get(int index){
        Node ListNode=head;
        for(int i=0;i<index;i++){
            ListNode=ListNode.next;
        }
        return ListNode;
    }

    public void bubbleSort(){
        bubbleSort(size-1,0);
    }
    private void bubbleSort(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            Node first=get(col);
            Node second=get(col+1);

            if(first.value>second.value) {
                //case 1
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }
               //case 2
                else if(second==tail){
                    Node prev=get(col-1);
                    prev.next=second;
                    tail=first;
                    first.next=null;
                    second.next=tail;

                }else{
                    Node prev=get(col-1);
                    prev.next=second;
                    first.next=second.next;
                     second.next=first;
                }
            }
            bubbleSort(row,col+1);

        }else {
            bubbleSort(row - 1, 0);
        }
    }



    public void insertFirst(int val){
      Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+ "->");
            temp=temp.next;
        }
        System.out.println("END");
    }

}
