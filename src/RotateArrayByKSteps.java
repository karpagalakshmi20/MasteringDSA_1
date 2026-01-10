import java.util.Scanner;

public class RotateArrayByKSteps {
    public static void rotatearraytoleft(int[] arr){
        System.out.println("Enter the number of steps to be rotated towards left");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] leftrotatedarr = new int[arr.length];
        int newind1 = 0;

        for(int i=0; i<arr.length; i++){
            newind1 = (i - k + arr.length) % arr.length;
            leftrotatedarr[newind1] = arr[i];
        }
        System.out.println("The left rotated array by " + k + " steps is:");
        printarr(leftrotatedarr);
    }

    public static void rotatearraytoright(int[] arr){
        System.out.println("Enter the number of steps to be rotated towards right");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] rightrotatearr = new int[arr.length];
        int newind2 = 0;

        for(int i=0; i<arr.length; i++){
            newind2 = (i+l) % arr.length;
            rightrotatearr[newind2] = arr[i];
        }
        System.out.println("The right rotated array by " + l + " steps is:");
        printarr(rightrotatearr);
    }

    public static void printarr(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
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

        rotatearraytoleft(arr);
        rotatearraytoright(arr);

        sc.close();
    }
}
/*
ip : 2 3 4 5 6 7

op1: 6 7 2 3 4 5 --> right rotation

op2: 4 5 6 7 2 3 --> left rotation
 */