import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        int n ,i,a[],j,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements you want :");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("enter the elements :");
        for(i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Elements");
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
