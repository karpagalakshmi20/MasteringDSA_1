import java.util.HashSet;
import java.util.Scanner;

public class DuplicatesInArray {

    public static void findduplicatesinarr(int[] arr){
        HashSet<Integer> newset = new HashSet<>();
        HashSet<Integer> duplicateset = new HashSet<>();

        for(int ele : arr){
            if(newset.contains(ele)){
                duplicateset.add(ele);
            }
            else{
                newset.add(ele);
            }
        }
        printduplicates(duplicateset);
    }

    public static void printduplicates(HashSet<Integer> duplicateset){
        if(duplicateset.isEmpty()){
            System.out.println("There are no duplicates found in the array");
        }
        else{
            System.out.println("The duplicate elements are:");
            for(int num : duplicateset){
                System.out.print(num + " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in an array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the values of elements in the array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        findduplicatesinarr(arr);

        sc.close();
    }
}


/*
ip 2 3 4 5 6 3 2 3

op 2 3
 */