import java.util.Scanner;

public class Doubly_LL {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
          this.data=data;
          this.next=null;
          this.prev=null;
        }
    }
    Node head = null;
    Node tail = null;

    public void creation(){
        int data,n,m,p;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter the data ");
            data = sc .nextInt();
            Node new_node =new Node(data);
            if(head==null){
                head= new_node;
                tail =new_node;
            }
            else {
                System.out.println("Insert an element - press 1 for begginning , press 2 for at the end , press 3 for specific position : ");
                m=sc.nextInt();
                switch (m){
                    case 1 :
                        head.prev =new_node;
                        new_node.next =head;
                        head = new_node;
                    break ;
                    case 2:
                        tail.next = new_node;
                        new_node.prev = tail;
                        tail = new_node;
                        break;
                    case 3:
                        Node temp = head;
                        Node ptr = temp.next;
                        System.out.println("enter index where you want to insert in a node ");
                        p=sc.nextInt();
                        for(int i= 0;i<(p-1);i++){
                            temp = ptr;
                            ptr =ptr.next;
                        }
                        new_node.prev = temp;
                        new_node.next = ptr;
                        temp.next =new_node;
                        ptr.prev = new_node;
                        break;
                }

            }
            System.out.println("want more item  Press 1 . ");
            n= sc.nextInt();
        }while (n==1);
    }
    public void delete(){
        int n,m,p;
        Scanner sc =new Scanner(System.in);
     do {
         if (head == null) {
             System.out.println("linked list not exist ");
         } else {
             System.out.println("delete an element - press 1 for begginning , press 2 for at the end , press 3 for specific position : ");
             m = sc.nextInt();
             switch (m) {
                 case 1:
                     Node tempo = head;
                     tempo =tempo.next;
                     head =tempo;
                     head.prev= null;
                     break;
                 case 2:
                     Node tem = tail;
                     tem =tem.prev;
                     tem.next=null;
                     tail=tem;
                     break;
                 case 3:
                     Node temp = head;
                     Node ptr = temp.next;
                     System.out.println("enter index where you want to delete a node");
                     p=sc.nextInt();
                     for(int i =0;i<(p-1);i++){
                         temp= ptr;
                         ptr = ptr.next;
                     }
                     temp.next = ptr.next;
                     ptr.prev.next = temp;
                     break;

             }
         }
         System.out.println("do you want to more item Press 1 .");
         n=sc.nextInt();
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
