package com.company.keywords;

//it's non-static class So, we have create object of it
//and  if static then, we don't need to create object of it
public class ClassExample {
    int x = 2;
    int y = 8;
}

//and we cannot declare class private or protected
//it should be public or default (no modifier)
 class Example{
     public static void main(String[] args) {
         ClassExample classExample = new ClassExample();
         System.out.println( classExample.x);
         System.out.println(classExample.y);
     }
 }
