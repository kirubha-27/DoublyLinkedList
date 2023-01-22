public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insetAtBeg(3);
        list.insetAtBeg(4);
        list.insetAtBeg(5);
        list.insetAtBeg(6);
        list.insertAtEnd(8);
        //list.deleteAtPos(5);
        list.insertAtPos(5,0);
        //list.deleteAtEnd();

        list.reverseDisplay();


    }
}
