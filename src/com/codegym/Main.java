package com.codegym;

public class Main {

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(2.5f, 3.5f);
        System.out.println(point2D);

        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(2.9f,3.5f,6.8f);
        System.out.println(point3D);
        point3D = new Point3D(2.9f);
        System.out.println(point3D);
    }
}
