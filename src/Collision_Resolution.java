import java.util.Scanner;

public class Collision_Resolution {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=next;
        }
    }
    Node head = null;
    public void creation(){
        int data,n,m,p;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter values :");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                System.out.println("enter 1 if insert in beginning :  enter 2 if insert in end : enter 3 if insert in particular index :");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;
                    case 2:
                        Node temp1 = head;
                        while (temp1.next != null) {
                            temp1=temp1.next;
                        }
                        temp1.next=new_node;
                        break;
                    case 3:
                        System.out.println("enter the position of node to be inserted : ");
                        p = sc.nextInt();
                        Node temp2 = head;
                        for (int i = 0; i < (p - 1); i++) {
                            temp2=temp2.next;
                        }
                        new_node.next=temp2.next;
                        temp2.next=new_node;
                        break;
                }
            }
            System.out.println("do you want to add more values  in a  LL . Please enter 1 ");
            n=sc.nextInt();
        }
        while (n==1);
    }
    public void delete(){
        int  n, m ,p ;
        Scanner sc = new Scanner(System.in);
        do {
            if (head == null) {
                System.out.println("linked list is empty ");
            } else {
                System.out.println("press 1 for delete at beginning , press 2 for delete at end, press 3 for delete in a particular index");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        Node temp =head;
                        temp=temp.next;
                        head=temp;
                        break;
                    case 2 :
                        Node temp2 =head;
                        Node ptr =temp2.next;
                        while (ptr.next!=null){
                            temp2=ptr;
                            ptr=ptr.next;
                        }
                        temp2.next=null;
                        break;
                    case 3:
                        System.out.println("enter a index where you want to delete a node ");
                        p=sc.nextInt();
                        Node temp3 =head;
                        Node ptr1 =temp3.next;
                        for (int i=0;i<(p-1);i++){
                            temp3=ptr1;
                            ptr1=ptr1.next;
                        }
                        temp3.next=ptr1.next;
                        break;
                }
            }
            System.out.println("do you want add more , Press 1 ");
            n=sc.nextInt();
        }
        while (n==1);
    }
    public void traverser(){
        Node temp = head;
        if(head==null){
            System.out.println("linked list doesn't exist ");
        }
        else {
            while (temp != null) {
                System.out.println(temp.data + "  ");
                temp = temp.next;
            }
        }
    }
    public void Sorting(){
        Scanner sc =new Scanner(System.in);
        int i,j,c  =0;
        if(head!=null){
            Node temp = head;
            while (temp!=null){
                temp = temp.next;
                c++;
            }
        }
        System.out.println("number of nodes " +c);

        for(i=0;i<c;i++){
            for(j=0;j<c-i-1;j++){
                Node temp = head;
                Node temp1 = temp.next;
                int d;
                if(temp.data>temp1.data){
                    d=temp.data;
                    temp1.data=temp.data;
                    temp.data=d;
                }
                temp=temp1;
                temp1=temp1.next;
                }
            }
        System.out.println("Sorted array is ");

        Node temp2 = head;
        while (temp2!=null){
            System.out.println(temp2.data +" ");
            temp2 = temp2.next;
        }
        }

    public static void main(String[] args) {
        Collision_Resolution obj = new Collision_Resolution();
        obj.creation();

        obj.delete();
        obj.traverser();
        obj.Sorting();
    }
}