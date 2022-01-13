//     1
//    212
//   32123
//  4321234
// 543212345
//print given pattern

package com.company.Lecture6;

public class Que4 {
    public static void main(String[] args) {
        int number=5;

        for (int i=1; i<=number; i++){
            //printing space
            for (int j=1; j<=number-i; j++){
                System.out.print(" ");
            }

            //printing numbers
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }

            //right hand side part
            for (int j=2; j<=i; j++){
                System.out.print(j);
            }
            //next line
            System.out.println();
        }
    }
}
