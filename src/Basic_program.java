import java.util.Scanner;
public class Basic_program {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a total number of array :");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter a value : ");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }

    }
}
