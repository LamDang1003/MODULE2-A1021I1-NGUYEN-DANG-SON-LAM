package array_method.thuc_hanh.b1_reverse_array;

import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter a size: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20) {
                System.out.println("Size does not exceed 20");

            }
        }while(size>20);
        array = new int[size];
        int i = 0;
        while (i<array.length){
            System.out.println("enter element"+ (i+1)+": ");
            array[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j=0; j<array.length;j++){
            System.out.print(array[j]+" ");

        }
        for (int j= 0;j< array.length/2;j++){
            int temp = array[j];
            array[j]= array[size-1-j];
            array[size-1-j]=temp;
        }
        System.out.println();
        System.out.print("Reverse array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "  ");
        }

    }
}