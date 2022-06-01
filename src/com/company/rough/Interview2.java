package com.company.rough;

public class Interview2 {
    static long gcd(long m, long n){
        if(m%n != 0)
            return gcd(n, m%n);
        else
            return n;
    }

    static long lcm(long a){
        long ans = 1;
        for(long i=1; i<=a; i++){
            ans = (ans*i)/(gcd(ans, i));
        }
        return ans;
    }

    public static void main(String[] args){
        long a = 12;
        System.out.println(lcm(a));
    }
}
