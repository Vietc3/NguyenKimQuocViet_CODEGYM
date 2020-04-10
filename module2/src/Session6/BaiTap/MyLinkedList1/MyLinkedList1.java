package Session6.BaiTap.MyLinkedList1;

public class MyLinkedList1 {
    private Node head;
    private int numNodes;

    public MyLinkedList1(Object data) {
        head = new Node(data);
        numNodes++;
    }

    public MyLinkedList1() {
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void remove(int index) {
        Node temp = head;

        if (index == 1) {
            head = head.next;
        } else {
            for (int i = 0; i < index - 2; i++) {

                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        numNodes--;
    }

    public void IndexOf(int index) {
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        System.out.println("Giá trị tại " + index + " là " + temp.data);
    }

    public void remove(Object data) {
        Node temp = head;
        if (head.getData().equals(data)) {
            head = head.next;
        } else {
            while (!temp.next.getData().equals(data) && temp != null) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            numNodes--;
        }
    }

    public void contains(Object data) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData().equals(data)) {
                System.out.println("Có giá trị " + data + " trong mảng.");
                break;
            }
            temp = temp.next;
        }
    }


    public MyLinkedList1 clone() {

        MyLinkedList1 MyListClone = new MyLinkedList1();
        Node temp = head;
        MyListClone.addFirst(temp.data);
        temp = temp.next;
        while (temp != null) {
            MyListClone.addFirst(temp.data);
            temp = temp.next;
        }
        return MyListClone;
    }

    public void size() {
        System.out.println("Có " + numNodes + " phần tử trong mảng.");
    }

}
