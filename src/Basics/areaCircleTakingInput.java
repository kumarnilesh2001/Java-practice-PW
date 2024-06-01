package Basics;

import java.util.Scanner;

public class areaCircleTakingInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Enter radius : ");
        double r = sc.nextDouble();
        double area = pi * r * r;

        System.out.println("Area of the circle : " + area);
    }
}
