package Session6.BaiTap.MyLinkedList1;

import Session6.Thuchanh.MyLinkedList.MyLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList1 ll = new MyLinkedList1(10);
        ll.addFirst("nam");
        ll.addFirst("Khanh");
        ll.addFirst("viet");
        ll.printList();
        ll.contains("viet");
        ll.IndexOf(1);
        ll.size();
    }

    }

