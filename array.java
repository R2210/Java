import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter length of array:");
        int n=scan.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("the array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
