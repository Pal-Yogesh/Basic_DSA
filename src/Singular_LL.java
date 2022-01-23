import java.util.Scanner;
public class Singular_LL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
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
                Node temp2 = head;
                while (temp2.next != null) {
                    temp2=temp2.next;
                }
                temp2.next=new_node;

                break;
            case 3:
                System.out.println("enter the position of node to be inserted : ");
                p = sc.nextInt();
                Node temp1 = head;
                for (int i = 0; i < (p - 1); i++) {
                    temp1=temp1.next;
                }
                new_node.next=temp1.next;
                temp1.next=new_node;
                break;
        }
    }
    System.out.println("do you want to add more values  in a  LL . Please enter 1 ");
    n=sc.nextInt();
}
while (n==1);
}
public void traverser(){
    Node temp=head;
    if(head==null){
        System.out.println("linked list does not exist . ");
    }
    else{
        while (temp!=null){
            System.out.println(temp.data + "  ");
            temp=temp.next;
        }
    }
}
public static void main(String[] args) {
    Singular_LL obj = new Singular_LL();
    obj.creation();
    obj.traverser();
}
}