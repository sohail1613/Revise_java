//print given pattern.
//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1

package com.company.Lecture5;

public class Que9 {
    public static void main(String[] args) {
        int number=5;
        for (int i=1; i<=number; i++){
            for (int j=1; j<=i; j++){
                if ((i+j)%2==0){
                    System.out.print(1+" ");
                } else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
