package Array_method.bai_tap.b2_add_element_arr;

import java.util.Scanner;

public class add_element_arr {
        public static void main(String[] args) {
                int n;
                int i;
                Scanner scanner = new Scanner(System.in);

                do {
                        System.out.println("Nhập vào số phần tử của mảng: ");
                        n = scanner.nextInt();
                } while (n <= 0);

                int A[] = new int[n];

                System.out.println("Nhập các phần tử cho mảng: ");
                for (i = 0; i < n; i++) {
                        System.out.print("Nhập phần tử thứ " + i + ": ");
                        A[i] = scanner.nextInt();
                }

                System.out.println("Nhập số nguyên k: ");
                int k = scanner.nextInt();
                System.out.println("Nhập số nguyên c: ");
                int c = scanner.nextInt();
                if(c<=1||c>=A.length-1){
                        System.out.println("không chèn được phần tử vào mảng");
                }else{
                        n=n+1;
                        for(i= A.length-1;i>c;i--){
                                A[i]=A[i-1];
                                A[c]=k;
                        }
                }
                System.out.println("mảng mới là: ");
                for (i = 0; i < n; i++) {
                        System.out.print(A[i] + "\t");
                }
        }
}