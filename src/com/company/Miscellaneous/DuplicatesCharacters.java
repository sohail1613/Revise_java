package com.company.Miscellaneous;

public class DuplicatesCharacters {
    public static void main(String[] args) {
        String str = "Ankara and Adari";
        int count = 0;
        char[] c = str.toCharArray();
        System.out.println("Duplicates characters are :");
        for (int i=0; i<str.length(); i++){
            for (int j=i+1; j<str.length(); j++){
                if (c[i] == c[j]){
                    System.out.println(c[j]);
                    count++;
                    break;
                }
            }
        }
    }
}
