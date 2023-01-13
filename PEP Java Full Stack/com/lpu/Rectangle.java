package com.lpu;

class Rectangle {
    double length;
    double breadth;

    Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    Rectangle(double a, double b) {
        this.length = a;
        this.breadth = b;

    }

    double getPerimeter() {

        return 2 * (length + breadth);

    }

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2, 4);
        double peri;
        peri = rc.getPerimeter();
        System.out.println(peri);

    }
}
