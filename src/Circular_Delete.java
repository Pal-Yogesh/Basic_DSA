import java.util.Scanner;

public class Circular_Delete {
    static class  Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = next;
        }
    }
    Node head = null;
    Node tail =null;

    public void creation(){
        int data,n,p,m;
        Scanner sc =new Scanner(System.in);
        do{
            data=sc.nextInt();
            Node new_node = new Node(data);
            System.out.println("enter the data in an linked list :" );

            if(head==null){
               head = new_node;
               tail = new_node;
            }
            System.out.println("insert an element - press 1 for begginning , press 2 for at the end , press 3 for specific position ");
            m= sc.nextInt();
            switch (m){
                 case 1:
                    new_node.next = head;
                    head = new_node;
                    tail.next =head;
                 break ;
                 case 2:
                     tail.next=new_node;
                     tail=new_node;
                     new_node.next=head;
                     break;
                case 3 :
                    System.out.println("enter an index where you want to enter an value :");
                    p = sc.nextInt();
                    Node temp2  = head;

                    for (int i = 0; i < (p-1); i++) {
                       temp2 = temp2.next;
                    }
                    new_node.next = temp2.next;
                    temp2.next = new_node;
                    break;
            }
            n=sc.nextInt();
        }while (n==1);
    }
    public void delete()
    {   int n,m,p;
        Scanner sc = new Scanner(System.in);
        do{
            if(head==null){
                System.out.println("Linked List is Empty");
            }
            else{
                System.out.println("delete an element - press 1 for begginning , press 2 for at the end , press 3 for specific position :");
                m=sc.nextInt();
                switch (m){
                    case 1:
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
                        break;
                    case 2:
                        Node temp2 = head;
                        Node ptr = temp2.next;
                        while (ptr.next!=head){
                            temp2= ptr;
                            ptr = ptr.next;
                        }
                        temp2.next = head;
                        tail = temp2;
                        break;
                    case 3:
                        Node temp3 = head;
                        Node ptr2 = temp3.next;
                        p=sc.nextInt();
                        for(int i =0;i<(p-1);i++){
                            temp3= ptr2;
                            ptr2 = ptr2.next;
                        }
                        temp3.next = ptr2.next;
                        break;
                }
            }n= sc.nextInt();
        }while (n==1);
    }
    public void traverser() {
        Node temp = head;
        if (head == null) {
            System.out.println("linked list does not exist .");
        }
        else {
            do {
                System.out.println(temp.data);
                temp = temp.next;
            }
            while (temp != head);
        }
    }
    public static void main(String[] args) {
        Circular_Delete obj = new Circular_Delete();
        obj.creation();
        obj.traverser();
    }
}
