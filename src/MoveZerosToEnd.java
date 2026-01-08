import java.util.*;

public class MoveZerosToEnd {

    public static void moveAllZerosToEnd(int[] arr){
        int newarrlen = arr.length;
        int[] newarr = new int[newarrlen];
        int firstIndex = 0, lastIndex = newarrlen-1;
        for (int j : arr) {
            if (j == 0) {
                newarr[lastIndex] = j;
                lastIndex--;
            } else {
                newarr[firstIndex] = j;
                firstIndex++;
            }
        }
        printArr(newarr);
    }

    public static void printArr(int[] newarr){
        int ind = 0, len = newarr.length;
        System.out.print("The new array is:");
        while(len > 0){
            System.out.print(newarr[ind] + " ");
            ind++;
            len--;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of an array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        moveAllZerosToEnd(arr);
        sc.close();
    }
}

/*
System.out.println("Enter the array elements:");
        int []arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        int []newarr= new int[n];
        Arrays.fill(newarr,0);
        int ind=0;
        for(int num : arr){
            if(num!=0){
                newarr[ind++]=num;
            }
        }
        System.out.println("Before:");
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("After:");
        for(int num : newarr){
            System.out.print(num+" ");
        }
 */
