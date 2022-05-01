import java.util.Scanner;
public class MultiDimensional_I_O {
    public static void main(String[] args) {
        int i,j,m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows n :");
        n=sc.nextInt();
        System.out.println("enter the columns m:");
        m=sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter Values :");
        for(i=0;i<n;i++){

            for (j=0;j<m;j++){
             arr[i][j]= sc.nextInt();
            }
        }
        for (i=0;i<n;i++) {
            for (j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }

}
