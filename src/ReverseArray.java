import java.util.Scanner;

public class ReverseArray {
    public static void ReverseArr(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values of elements in an array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ReverseArr(arr);
        sc.close();
    }
}
