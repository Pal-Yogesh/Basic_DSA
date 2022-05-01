import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        int n,i,j,a[],temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many element  you want ");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("enter elements");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=1;i<=n-1;i++){
            temp=a[i];
            j=i-1;
            while(temp<a[j] && j>-1){
                a[j+1] = a[j];
                j= j-1;
            }
            a[j+1] = temp;
        }
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
//import java.util.Scanner;
//
//public class Insertion_Sort {
//    public static void main(String[] args) {
//        int n,j,a[],temp;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size");
//        n = sc.nextInt();
//        a = new int[n];
//        System.out.println("Enter values");
//        for (int i = 0; i < a.length; i++) {
//            a[i] = sc.nextInt();
//        }
//        System.out.println("Before Sorting");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]+" ");
//        }
//        for (int i = 1; i <=n-1 ; i++) {
//            temp = a[i];
//            j = i-1;
//            while (temp<a[1] && j>-1)
//            {
//                a[j+1] = a[j];
//                j= j-1;
//            }
//            a[j+1] = temp;
//        }
//        System.out.println("\nAfter Sorting");
//        for (int i = 0; i < n; i++) {
//            System.out.print(a[i]+" ");
//        }
//    }
//}