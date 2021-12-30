import java.util.Scanner;
public class Insertion_1 {
    public static void main(String[] args) {
        int i,m,n,p;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array : ");
        n=sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n+1];
        System.out.println("Entering a user input value is : ");
        for (i = 0 ; i< n ; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a Index there you enter a value : ");
        m = sc.nextInt();
        System.out.println("enter a value that you insert : ");
        p = sc.nextInt();
        for (i=0;i<n+1;i++){
            if(i<m){
                b[i]=a[i];
            }
            else if (i==m){
                b[i]=p;
            }
            else{
                b[i]=a[i-1];
            }
        }
        System.out.println("final value is :");
        for(i=0;i<n+1;i++){
            System.out.println(b[i]);
        }
    }
}

