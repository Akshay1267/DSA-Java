import java.util.*;

public class find {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {78,85,25,63,14,78};
        System.out.println("Enter the number to be find: ");
        int x = sc.nextInt();

        for (int i=0;i<arr.length;i++) {
            if(arr[i] == x) {
                System.out.println("Element found at index: " + i);
                
            } else  {
                System.out.println("Element not found");
            }

        }
    }
}
