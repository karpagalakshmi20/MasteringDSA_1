import java.util.Scanner;

public class MinSubarraySum {

    public static void minSubarraySum(int[] arr){
        int minsum = Integer.MAX_VALUE;
        int currmin = 0, start = 0, end = 0, begin = 0;

        for(int i=0; i<arr.length; i++){
            currmin += arr[i];
            if(currmin < minsum){
                minsum = currmin;
                begin = start;
                end = i;
            }
            if(currmin > 0){
                currmin = 0;
                start = i + 1;
            }
        }
        System.out.println("The minimum subarray sum is:" + minsum);
        System.out.println("The sub array with the minimum sum is:");
        for(int j=begin; j<=end; j++){
            System.out.print(arr[j] + " ");
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

        minSubarraySum(arr);

        sc.close();
    }
}
