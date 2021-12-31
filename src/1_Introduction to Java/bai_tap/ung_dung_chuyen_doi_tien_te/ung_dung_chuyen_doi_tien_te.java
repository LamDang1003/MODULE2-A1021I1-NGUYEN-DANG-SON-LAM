package com.company;

import java.util.Scanner;

public class ung_dung_chuyen_doi_tien_te {

    public static void main(String[] args) {
	double VND = 23000;
    double USD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any money (USD): ");
        USD = scanner.nextDouble();
        double toVND = USD*23000;
        System.out.println(toVND + "VND");
    }
}
