import java.util.Scanner;

public class Doubly_Insertion_LL {
    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
        }
    }
    Node head = null;
    Node tail = null;

    public void creation(){
        int data,n,m,p;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("enter the values : ");
            data = sc.nextInt();
            Node new_node = new Node(data);

            if(head==null){
                head = new_node;
                tail = new_node;
            }
            else{

                System.out.println("enter 1 2 3 ");
                m= sc.nextInt();
                switch (m){
                    case 1 :
                        head.prev=new_node;
                        new_node.next=head;
                        head = new_node;
                        break;
                    case 2 :
                        tail.next =new_node;
                        new_node.prev = tail;
                        tail = new_node;
                        break;
                    case 3:
                        Node temp = head;
                        Node ptr = temp.next;
                        p=sc.nextInt();
                        for(int i=0;i<(p-1);i++){
                            temp = ptr;
                            ptr = ptr.next;
                        }
                        new_node.prev =temp ;
                        new_node.next =ptr ;
                        temp.next =new_node;
                        ptr.prev = new_node;

                        break;
                }
            }
            System.out.println("do you want to more value in a present node  enter 1");
            n= sc.nextInt();
        }
        while (n==1);
    }
    public void traverser(){
        Node temp = head;

        if(head==null){
            System.out.println("linked list does not exist . ");
        }
        else{
            while (temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Doubly_Insertion_LL obj = new Doubly_Insertion_LL();
        obj.creation();
        obj.traverser();
    }
}