import java.util.Scanner;
public class Delete_Array {
    public static void main(String[] args) {
        int i, n, m, p;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a total size of array :");
        n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n - 1];
        System.out.println("enter user value :");
        for (i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter a index that you want to delete :");
        m = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (i < m) {
                b[i] = a[i];
            } else if (i == m) {
                continue;
            } else
                b[i-1]=a[i];
        }
        for (i=0;i<n-1;i++){
            System.out.println(b[i]);
        }
    }
}