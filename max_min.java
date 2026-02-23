import java.util.*;

public class max_min {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int j=0;j<arr.length;j++) {
            if(arr[j] > max) {
                max = arr[j];
            }
        }
        System.out.println("The largest element in array is: "+ max);
        
        int min = Integer.MAX_VALUE;
        for(int x =0;x<arr.length;x++) {
            if(arr[x] < min) {
                min = arr[x];
            }
        }
        System.out.println("The smallest element in array is :" + min);
        sc.close();
    }
} 
