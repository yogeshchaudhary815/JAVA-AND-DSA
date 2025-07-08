package $01_introduction;

import java.util.Scanner;

public class $04_charDataType {
    public static void main(String[] args){
    //     char myChar = 'A';
    //     System.out.println(myChar);
    //     char myChar1 ='1';
    //     System.out.println(myChar1);
    //    // Unicode are important topic so plz try and unicode website
    //    char myUniChar1 ='\u013f';
    //    System.out.println(myUniChar1);
    area(5);
    area(5,10);
    area(5,2.5);
    }
    public static void area(int length){
        System.out.println("area of square : "+ (length*length));
    }
     public static void area(int length , int breadth){
        System.out.println("area of rectangle : "+ (length*breadth));
    }
     public static void area(int length, double height){
        System.out.println("area of triangle : "+ (length*height)/2);
    }
}

    