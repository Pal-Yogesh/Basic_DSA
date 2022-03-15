import java.util.Scanner;

public class Circular_Operation {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head = null;
    Node tail = null;
    public void creation() {
        int data, n ,p,m;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter data : ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;
                new_node.next = head;

            } else {
                System.out.println("123");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        new_node.next=head;
                        head=new_node;
                        tail.next=head;
                        break;
                    case 2 :
                        tail.next=new_node;
                        tail=new_node;
                        new_node.next=head;

                        break;
                    case 3 :
                        System.out.println("enter position ");
                        p=sc.nextInt();
                        Node temp = head;
                        for (int i=0;i<(p-1);i++){
                            temp=temp.next;
                        }
                        new_node.next=temp.next;
                        temp.next=head;

                        break;

                }

            }
            System.out.println("do yu want to  more press 1 ");
            n = sc.nextInt();
        }
            while (n == 1) ;
    }

    public void traverser(){
        Node temp = head;
        if(head==null){
            System.out.println("LL not exist ");
        }
        else {
            do {
                System.out.println(temp.data);
                temp = temp.next;
            }
            while (temp!=head);
        }
    }

    public static void main(String[] args) {
        Circular_Operation obj = new Circular_Operation();
        obj.creation();
        obj.traverser();
    }
}
