package com.example.project;

public class Tester {
    public static void main(String[] args){
    Triangle myTriangle = new Triangle(0,0,5,0,5,5);
    System.out.println("area of my triangle is :" + myTriangle.area());
    System.out.println("Expected area: 12.5");
        System.out.println("perimeter of my triangle is :" + myTriangle.perimeter());
        System.out.println("Expected perimeter: 17.07");
    System.out.println("I am moving my triangle to the right 3, and up 3 units. The new x,y points are: ");
    myTriangle.translateX(3);
    myTriangle.translateY(4);
    System.out.println( myTriangle.getx0()  + "," + myTriangle.gety0());
    System.out.println( myTriangle.getx1()  + "," + myTriangle.gety1());
    System.out.println( myTriangle.getx2()  + "," + myTriangle.gety2());
    System.out.println("I am trying to find the length between all the points on my triangle.");
    System.out.println("Between the first point and the second point, the side length is: " + myTriangle.length(0, 1));
    System.out.println("Between the second point and the third point, the side length is: " + myTriangle.length(1, 2));
    System.out.println("Between the first point and the third point, the side length is: " + myTriangle.length(2, 0));
}}
