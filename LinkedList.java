public class LinkedList {
    Node head;
    Node tail;
    int size;
    class Node{
        Node prev;
        int val;

        Node next;

        Node(int val){
            prev = null;
            this.val = val;
            next = null;
        }
    }
    public void insertAtEnd(int val){
        Node newNode = new Node(val);
        if(head==null){

            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }
    public void insetAtBeg(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }
    public void deleteAtEnd(){
        if(head==null){
            System.out.println("Invalid position!!");
            return;
        }
        if(head==tail){
            head = null;
            tail = null;
            size--;
            return;
        }
        tail.prev.next = tail.next;
        tail = tail.prev;
        size--;
    }
    public void deleteAtBeg(){
        if(head==null){
            System.out.println("Invalid position!!");
            return;
        }
        if(head==tail){
            head = null;
            tail = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }
    public void insertAtPos(int pos,int val){
        if(head==null){
            if(pos==0){
                 Node newNode = new Node(val);
                 head = newNode;
                 tail = head;
                 size++;
                 return;
            }
            System.out.println("invalid postion!!");
            return;
        }
        if(pos==0){
            Node newNode = new Node(val);
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }
        Node temp = head;
        for(int i=0;i<pos-1;i++){
            temp = temp.next;
            if(temp==null){
                System.out.println("Invalid position!!!");
                return;
            }
        }
        if(temp.next==null){
            insertAtEnd(val);
            return;
        }
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
        size++;
    }
    public void deleteAtPos(int x){
        if(head==null){
            System.out.println("invalid position!!!");
            return;
        }
        if(x==0){
            if(head==tail){
                head = null;
                tail = null;
                size--;
                return;
            }
            head = head.next;
            head.prev = null;
            size--;
            return;
        }
        Node temp = head;
        for(int i=0;i<x-1;i++){
            temp = temp.next;
            if(temp.next==null){
                System.out.println("Invalid position!!");
                return;
            }
        }
        if(temp.next.next==null){
            deleteAtEnd();
            return;
        }
        if(temp.next==null){
            System.out.println("invalid position!!");
            return;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
    }
    public int Size(){
        return size;
    }
    public String toString(){
        String str = "";
        Node p = head;
        str += "[";
        while(p.next!=null){
            str+=p.val+",";
            p=p.next;
        }
        str+=p.val+"]";
        return str;
    }
    public void reverseDisplay(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val);
            temp = temp.next;
        }
    }
}
