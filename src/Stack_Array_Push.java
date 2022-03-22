import java.util.Scanner;

public class Stack_Array_Push {
    int top = -1;
        int n = 100;
    int arr[] = new int[n];

    void push(Scanner sc) {
        if (top == (n - 1)) {
            System.out.println("Stack overflow condition!!!!!!!!!!!");
        } else {
            System.out.println("enter data : ");
            int i = sc.nextInt();
            top = top + i;
            arr[top] = i;
            System.out.println("item is inserted .");
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack is underflow!!!!!!!!!!!!");
        } else {
            top = top - 1;
            System.out.println("item deleted.");
        }
    }
    void display() {
        System.out.println("Items are : ");
        for (int j = top; j >= 0; j--) {
            System.out.println(arr[j]);
        }
    }
}
class Stack_arr {
     public static void main(String[] args) {
         int d,l;
         Scanner sc = new Scanner(System.in);
         Stack_Array_Push obj = new Stack_Array_Push();

         do{
         System.out.println("Press 1 for PUSH");
         System.out.println("Press 2 for POP");
         System.out.println("Press 3 for DISPLAY");
         System.out.println("ENTER YOUR CHOICE");

             d = sc.nextInt();
             switch (d) {
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
         System.out.println("Exit Successful ");
     }
 }
