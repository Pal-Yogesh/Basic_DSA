//  INSERTION AT BEGINNING IN A NODE  IN A CIRCULAR LINKED LIST

import java.util.Scanner;

public class Circular_LL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }
    Node head = null;
    Node tail = null;
    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter values ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
             head =new_node;
             tail =new_node;
             new_node.next=head;
            }
            else{
                System.out.println("insert at begin:");
                new_node.next=head;
                head=new_node;
                tail.next=head;
            }
            System.out.println("do you want to add more . press 1 ");
            n=sc.nextInt();
        }while(n==1);
    }
    public void traverser(){
        Node temp = head;
        if(head==null){
            System.out.println("linked link does not exist ");
        }
        else {
            do {
                    System.out.println(temp.data+ " ");
                temp = temp.next;
            }
            while (temp!=head);
        }
    }

    public static void main(String[] args) {
        Circular_LL obj = new Circular_LL();
        obj.creation();
        obj.traverser();
    }
}