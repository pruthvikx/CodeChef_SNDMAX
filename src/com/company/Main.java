package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for (int i = 0;i < testCase;i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();
            int secMax;
            if ((A > B || A > C) && (A < B || A < C)){
                secMax = A;
            }else if ((B > A || B > C) && (B < A || B < C)){
                secMax = B;
            }else {
                secMax = C;
            }
            System.out.println(secMax);
        }
    }
}
