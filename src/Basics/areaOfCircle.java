package Basics;

public class areaOfCircle {

        static int areaCircle(double r){
            double pi = 3.14;

            return (int) (pi * r * r);
        };
    public static void main(String[] args) {
        int area =  areaCircle(6.9);
        System.out.println(area);
    }
}
