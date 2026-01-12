import java.util.Scanner;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static void findIntersectionOfArrays(int[] arr1, int[] arr2){
        HashSet<Integer> uniqueeleset = new HashSet<>();
        for(int num : arr1){
            uniqueeleset.add(num);
        }
        HashSet<Integer> intersectionset = new HashSet<>();
        for(int num : arr2){
            if(uniqueeleset.contains(num)){
                intersectionset.add(num);
            }
        }
        System.out.println("The intersection of two arrays is as follows:");
        System.out.print("[ ");
        for(int num : intersectionset){
            System.out.print(num + " ");
        }
        System.out.print("]");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array 1:");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter the values of elements for array 1:");
        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the number of elements in array 2:");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter the values of elements for array 2:");
        for(int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        findIntersectionOfArrays(arr1, arr2);

        sc.close();
    }

}



/*
public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in the first array:");
        int n1=sc.nextInt();
        HashSet<Integer> set1=new HashSet<>();
        System.out.println("Enter the elements of the first array:");
        for(int i=0;i<n1;++i){
            set1.add(sc.nextInt());
        }
        System.out.println("Enter the elements in the second array:");
        int n2=sc.nextInt();
        HashSet<Integer> set2=new HashSet<>();
        System.out.println("Enter the elements of the second array:");
        for(int i=0;i<n2;++i){
            set2.add(sc.nextInt());
        }
        List<Integer> intersectionList=new ArrayList<>();
        for(int ele : set2){
            if(set1.contains(ele)){
                intersectionList.add(ele);
            }
        }
        System.out.println("Intersection of both the arrays:");
        System.out.println(intersectionList);
    }
*/
