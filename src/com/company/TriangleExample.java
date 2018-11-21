package com.company;

import java.util.Scanner;

public class TriangleExample {
    public void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if(a >= 0 && b >= 0 && c >= 0){
            if(a+b < c && a+c < b && b+c < a){
                throw new IllegalTriangleException("Error: tổng 2 cạnh < 1 cạnh còn lại!");
            }else{
                System.out.println("Nhập đúng");
            }
        }else{
            throw new IllegalTriangleException("Error: 1 cạnh âm!");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập c: ");
        int c = scanner.nextInt();
        TriangleExample triangleExample = new TriangleExample();
        try {
            triangleExample.checkTriangle(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.errorMessage);
        }
    }
}
