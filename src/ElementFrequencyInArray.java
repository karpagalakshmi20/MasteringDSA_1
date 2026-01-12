import java.util.Scanner;
import java.util.HashMap;

public class ElementFrequencyInArray{

    public static void findElementFrequency(int[] arr){
        HashMap<Integer, Integer> numfreq = new HashMap<>();
        for(int num : arr){
            numfreq.put(num, numfreq.getOrDefault(num,0)+1);
        }

        System.out.println("The frequency of elements in the array are as follows:");
        for(Integer val : numfreq.keySet()){
            System.out.println(val + " occurs " + numfreq.get(val) + " time(s).");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values of elements in the array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        findElementFrequency(arr);

        sc.close();
    }
}


/*
public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        System.out.println("Enter the array elements:");
        int [] arr= new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<n;++i){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }
        System.out.println("Frequency:");
        System.out.println(freq);

    }
*/
