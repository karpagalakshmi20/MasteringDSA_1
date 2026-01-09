import java.util.Scanner;

public class ReverseArrayAndPalindromeCheck{
    public static void ReverseArr(int[] arr){
        int[] newarr = new int[arr.length];
        int newind = arr.length - 1, oldind = 0;
        while(newind>=0){
            newarr[newind--] = arr[oldind++];
        }
        printarr(newarr);
    }

    public static void printarr(int[] newarr){
        System.out.println("The reverse of the array is as follows:");
        System.out.print("[ ");
        for(int i=0; i<newarr.length; i++){
            System.out.print(newarr[i] + " ");
        }
        System.out.println("]");
    }
    public static void PalindromeCheck(int[] arr){
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        Boolean flag = true;
        for (int i=0; i<=arr.length/2; i++){
            if(arr[firstIndex] == arr[lastIndex]){
                firstIndex++;
                lastIndex--;
            }
            else{
                flag = false;
            }
        }
        if(flag == true){
            System.out.println("The array is a palindrome");
        }
        else{
            System.out.println("The array is not a palindrome");
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
        int firstElement = arr[0];
        int lastElement = arr[arr.length - 1];
        ReverseArr(arr);
        PalindromeCheck(arr);
        sc.close();
    }
}
