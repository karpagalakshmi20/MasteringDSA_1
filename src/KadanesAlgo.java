import java.util.Scanner;

public class KadanesAlgo {

    public static void tofindmaxsubarraysum(int[] arr){
        int maxsofar = Integer.MIN_VALUE;
        int maxlastseen = 0;
        int[] maxsubarr = new int[arr.length];
        int ind = 0;

        for(int num : arr){
            maxlastseen = maxlastseen + num;
            if(maxlastseen > maxsofar){
                maxsofar = maxlastseen;
            }
            if(maxlastseen < 0){
                maxlastseen = 0;
            }
            else{
                maxsubarr[ind++] = num;
            }
        }
        System.out.println("The maximum subarray sum is:" + maxsofar);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in an array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the values of the elements in an array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        tofindmaxsubarraysum(arr);

        sc.close();
    }
}
/*
To find the maximum subarray sum in v1

My innovation - to find the minimum subarray sum in v2
 */