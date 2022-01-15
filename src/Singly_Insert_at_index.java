// INSERTION AT a given position IN A GIVEN  NODE

import java.util.Scanner;
class Singly_Insert_at_Index {
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
        int data,n,p;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter data:");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if(head==null){
                head=new_node;
            }
            else{
                System.out.println("enter the position of node to be inserted : ");
                p = sc.nextInt();
                Node temp = head;
                for (int i = 0; i < (p - 1); i--) {
                    temp=temp.next;
                }
                new_node.next=temp.next;
                temp.next=new_node;

            }
            System.out.println("Do u want to add more data.IF YES enter 1 ");
            n=sc.nextInt();
        }
        while (n==1);
    }
    public void traverser(){
        Node temp = head;
        if(head==null){
            System.out.println("LL does not exist");
        }
        else{
            while (temp!=null){
                System.out.println(temp.data + "  ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Singly_Insert_at_Index obj = new Singly_Insert_at_Index();
        obj.creation();
        obj.traverser();
    }
}