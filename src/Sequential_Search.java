import java.util.Scanner;

class  Sequential_Search
{
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    // Driver code
    public static void main(String args[])
    {    int n ,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements :");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("which element you want to search ");
        x=sc.nextInt();
        // Function call
        int result = search(arr, x);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index " + result);
    }
}