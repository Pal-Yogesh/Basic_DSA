import java.util.Scanner;

public class Stack_LL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node top = null;
    void push(Scanner sc) {
        System.out.println("enter data :");
        int data= sc.nextInt();
        Node new_node = new Node(data);
        if (top == null) {
        top = new_node;
        }
        else
        {
            new_node.next  =top;
            top = new_node;
        }
    }
void pop(){
        if(top==null){
            System.out.println("Stack is empty.");
        }
        else {
            top = top.next;
        }
}
void display(){
     Node temp = top;
     while (temp!=null){
         System.out.println(temp.data);
         temp =temp.next;
     }
}
class Stack_arr {
        public static void main(String[] args) {
            int p;
            Scanner sc = new Scanner(System.in);
            Stack_Array_Push obj = new Stack_Array_Push();
            int l;
            do {
                System.out.println("Press 1 for PUSH");
                System.out.println("Press 2 for POP");
                System.out.println("Press 3 for DISPLAY");
                System.out.println("ENTER YOUR CHOICE");

                p = sc.nextInt();
                switch (p) {
                    case 1: {
                        obj.push(sc);
                        break;
                    }
                    case 2: {
                        obj.pop();
                        break;
                    }
                    case 3: {
                        obj.display();
                        break;
                    }
                }
                System.out.println("Enter 0 to go back to main menu .");
                System.out.println("Enter any key to exist .");
                l = sc.nextInt();

            } while (l == 0);
        }
    }
}

