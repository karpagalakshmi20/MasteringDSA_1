import java.util.Scanner;
import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void mergearrays(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] arr3 = new int[arr1.length + arr2.length];
        int i=0, j=0, k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                arr3[k++] = arr1[i++];
            }
            else{
                arr3[k++] = arr2[j++];
            }
        }
        while(i<arr1.length){
            arr3[k++] = arr1[i++];
        }
        while(j<arr2.length){
            arr3[k++] = arr2[j++];
        }
        System.out.println("The result of two sorted arrays merged into one array is as follows:");
        for(int num : arr3){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter the number of elements in array 1:");
        n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the values of elements in the array1:");
        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the number of elements in array 2:");
        n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the values of elements in the array2:");
        for(int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        mergearrays(arr1, arr2);

        sc.close();


    }

}

/*
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array:");
        int n1=sc.nextInt();
        List<Integer> arr1=new ArrayList<>();
        System.out.println("Enter the elements of the first array:");
        for(int i=0;i<n1;++i){
            arr1.add(sc.nextInt());
        }
        System.out.println("Enter the number of elements in the second array:");
        int n2=sc.nextInt();
        List<Integer> arr2=new ArrayList<>();
        System.out.println("Enter the elements of the second array:");
        for(int i=0;i<n2;++i){
            arr2.add(sc.nextInt());
        }
        Collections.sort(arr1);
        System.out.println("Array 1:");
        System.out.println(arr1);
        Collections.sort(arr2);
        System.out.println("Array 2:");
        System.out.println(arr2);
        List<Integer> mergedArray= new ArrayList<>();
        int i=0,j=0;
        int m=arr1.size();
        int n=arr2.size();
        while(i<m&&j<n){
            int val1=arr1.get(i);
            int val2=arr2.get(j);
            if(val1<val2){
                mergedArray.add(val1);
                ++i;
            }
            else{
                mergedArray.add(val2);
                ++j;
            }
        }
        while(i<m){
            mergedArray.add(arr1.get(i));
            ++i;
        }
        while(j<n){
            mergedArray.add(arr2.get(j));
            ++j;
        }
        System.out.println("Merged Array:");
        System.out.println(mergedArray);
    }
*/
