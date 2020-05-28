import java.util.Scanner;
//SortedArray where time Complexity will be Theta(n-p).
public class Array_InstertionAtSpecificLocation {
    public static void main(String[] args) {
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
        System.out.print("Enter the value you want to insert : ");
        int arrNewValue = arrayInput.nextInt();
        System.out.print("Enter the position where you want to insert in an array : ");

        int pos = arrayInput.nextInt();
        if(pos == 0 || pos > size+1)
        {
            System.out.println("You have an invalid position : Hence data can't be inserted");
        }
        else if(pos == size)
        {
            a[pos] = arrNewValue;
            size++;
        }
        else {
            for (int i = size - 1; i >= pos - 1; i--) {
                a[i + 1] = a[i];
            }
            a[pos - 1] = arrNewValue;
            size++;
        }
        for(int i = 0; i < size; i++)
        {
            System.out.println("a["+i+"] : " + a[i]);
        }
    }
}
