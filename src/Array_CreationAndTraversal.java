import java.util.Scanner;

public class Array_CreationAndTraversal {

    public static void main(String[] args) {
	// write your code here
        int[]  a = new int[50];
        Scanner arrayInput = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = arrayInput.nextInt();
        System.out.println("Enter the values in  an array");
        for(int i = 0; i < size; i++){
            a[i] = arrayInput.nextInt();
            //System.out.print("a["+i+"] : "+a[i]);
        }
        System.out.println("Elements in an array are :");
        for(int i = 0; i < size; i++)
        {
            System.out.println("a["+i+"] : " + a[i]);
        }

    }
}
