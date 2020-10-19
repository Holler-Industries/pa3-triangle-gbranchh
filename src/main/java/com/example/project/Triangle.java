package com.example.project;
import java.lang.Math; //importing math

public class Triangle{ //constructing a triangle class
     private double a0; //creating instance variables
     private double b0; //creating instance variables
     private double a1; //creating instance variables
     private double b1; //creating instance variables
     private double a2; //creating instance variables
     private double b2; //creating instance variables

     public Triangle(){ // creating when triangle is given no parameters
         a0=0; //assigning  instance variables to 0
         b0=0; //assigning  instance variables to 0
         a1=0; //assigning  instance variables to 0
         b1=0; //assigning  instance variables to 0
         a2=0; //assigning  instance variables to 0
         b2=0; //assigning  instance variables to 0
    }

     public Triangle(double x0, double y0, double x1, double y1, double x2, double y2) { //creating when triangle has parameters
         a0=x0; //assigning parameters to instance variables
         b0=y0; //assigning parameters to instance variables
         a1=x1; //assigning parameters to instance variables
         b1=y1; //assigning parameters to instance variables
         a2=x2; //assigning parameters to instance variables
         b2=y2; //assigning parameters to instance variables
     }

     public double perimeter(){ //constructing a method called perimeter
        double edge1 = Math.sqrt(((a1-a0)*(a1-a0)) + ((b1-b0)*(b1-b0))); //~math~ to get the edge lengths
        double edge2 = Math.sqrt(((a2-a1)*(a2-a1)) + ((b2-b1)*(b2-b1))); //~math~ to get the edge lengths
        double edge3 = Math.sqrt(((a0-a2)*(a0-a2)) + ((b0-b2)*(b0-b2))); //~math~ to get the edge lengths
     return edge1 + edge2 + edge3; //returns the perimeter
     }

     public double area(){ //constructing a method called area
    //A=sqrt(s(s-a)(s-b)(s-c)
         double edge1 = Math.sqrt(((a1-a0)*(a1-a0)) + ((b1-b0)*(b1-b0))); //~math~ to get the edge lengths
         double edge2 = Math.sqrt(((a2-a1)*(a2-a1)) + ((b2-b1)*(b2-b1))); //~math~ to get the edge lengths
         double edge3 = Math.sqrt(((a0-a2)*(a0-a2)) + ((b0-b2)*(b0-b2))); //~math~ to get the edge lengths
         double s = 0.5 *(edge1 + edge2 + edge3); //~math~ to get the s value, a number needed to find area
         double A = Math.sqrt(s*(s-edge1)*(s-edge2)*(s-edge3)); //assigning A to be the area and more ~math~
         return A; //returns the area
     }

     public void translateX(double translatorX){ //creates a method which takes parameter of what value you want to translate x-values by
         a0 = a0 + translatorX; //assigns x-values new values based on parameter for the translation
         a1 = a1 + translatorX; //assigns x-values new values based on parameter for the translation
         a2 = a2 + translatorX; //assigns x-values new values based on parameter for the translation
     }

    public void translateY(double translatorY){ //creates a method which takes parameter of what value you want to translatey-values by
        b0 = b0 + translatorY; //assigns y-values new values based on parameter for the translation
        b1 = b1 + translatorY; //assigns y-values new values based on parameter for the translation
        b2 = b2 + translatorY; //assigns y-values new values based on parameter for the translation
    }


    public double length(double a, double b){ //constructing the class length, and assigning it parameters a and b
        double E = 0; //declaring a variable E, which is the side length and assigning it to zero
        if(a== 0) { //if statement for when using the point a0,b0
             if (b == 1) { //if statement for when you are using the point a0,b0, and a1,b1
                 E = Math.sqrt(((a1 - a0) * (a1 - a0)) + ((b1 - b0) * (b1 - b0))); //~math~, and assigning variable E
             }
             else { //if statement for when you are using the point a0,b0, and a2,b2
                 E = Math.sqrt(((a2 - a0) * (a2 - a0)) + ((b2 - b0) * (b2 - b0))); //~math~, and assigning variable E
             }
         }
        if(a== 1){ //if statement for when using the point a1,b1
             if(b==0){ //if statement for when you are using the point a1,b1, and a0,b0
                 E = Math.sqrt(((a0-a1)*(a0-a1)) + ((b0-b1)*(b0-b1))); //~math~, and assigning variable E
             }
             else { //if statement for when you are using the point a1,b1, and a2,b2
                 E = Math.sqrt(((a2 - a1) * (a2 - a1)) + ((b2 - b1) * (b2 - b1))); //~math~, and assigning variable E
             }
         }
        if(a==2){ //if statement for when using the point a2,b2
             if(b==0){ //if statement for when you are using the point a2,b2, and a0,b0
                 E = Math.sqrt(((a0-a2)*(a0-a2)) + ((b0-b2)*(b0-b2))); //~math~, and assigning variable E
             }
             else{ //if statement for when you are using the point a2,b2, and a1,b1
                 E = Math.sqrt(((a1-a2)*(a1-a2)) + ((b1-b2)*(b1-b2))); //~math~, and assigning variable E
             }
         }
        return  E; //return statement for the side length
    }
     // DO NOT DELETE THESE!
    public double getx0() { //method to get the x value
        return a0; //returning the x value
    }
    public double gety0() { //method to get the y value
        return b0; //returning the y value
    }
    public double getx1() { //method to get the x value
        return a1; //returning the x value
    }
    public double gety1() { //method to get the y value
        return b1; //returning the y value
    }
    public double getx2() { //method to get the x value
        return a2; //returning the x value
    }
    public double gety2() { //method to get the y value
        return b2; //returning the y value
    }
}
