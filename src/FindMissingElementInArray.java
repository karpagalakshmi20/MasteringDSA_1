import java.util.Scanner;
public class FindMissingElementInArray {

    public static int approachnumone(int[] arr){
        int n = arr.length + 1, sum = 0;
        int totalsum = n * (n+1)/2;
        for(int num : arr){
            sum += num;
        }
        // System.out.println("Answer1" + (totalsum - sum));
        return totalsum - sum;

    }

    public static int approachnumtwo(int[] arr){
        int n = arr.length + 1;
        int totalxor = 0, arrxor = 0;
        for(int i=1; i<=n; i++){
            totalxor ^= i;
        }

        for(int num : arr){
            arrxor ^= num;
        }
        // System.out.println("Answer2" + (totalxor ^ arrxor));
        return totalxor ^ arrxor;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in an array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the values of elements in the array:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int missingnumber1 = approachnumone(arr);
        System.out.println("The missing number in the array by approach 1 is: " + missingnumber1);
        int missingnumber2 = approachnumtwo(arr);
        System.out.println("The missing number in the array by approach 2 is: " + missingnumber2);
    }


}

