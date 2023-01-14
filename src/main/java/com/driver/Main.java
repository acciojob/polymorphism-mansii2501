package com.driver;

public class Main {

    public static void main(String[] args) {

        Product p = new Product();
        int ansValue = p.product(2,3);
        int secondAnsValue = p.product(2,3,4);
        double thirdAnsValue = p.product(2.2,3.3);
    }
    public static class Product{

        public int product(int x, int y) {
            return x*y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }
    }
}
