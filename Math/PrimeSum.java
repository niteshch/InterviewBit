package Math;

import java.util.ArrayList;

/*Prime Sum
Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.

NOTE A solution will always exist. read Goldbach’s conjecture

Example:


Input : 4
Output: 2 + 2 = 4

If there are more than one solutions possible, return the lexicographically smaller solution.

If [a, b] is one solution with a <= b,
and [c,d] is another solution with c <= d, then

[a, b] < [c, d] 

If a < c OR a==c AND b < d.*/
public class PrimeSum{
    public ArrayList<Integer> primesum(int x) {
        int a = 0; 
        int b = 0;
        for(int i = 2; i <= x/2 + 1; i++){
            int c = i;
            int d = x - i;
            if(isPrime(c) && isPrime(d)){
               if(a > 0 && b > 0){
                   if( (a < c || a == c) && (b < d)){
                       a = c;
                       b = d;
                   }
               }else{
                   a = c;
                   b = d;
               }
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        return list;
    }
    private boolean isPrime(int a){
        if(a < 2) return false;
        int upperLimit = (int)(Math.sqrt(a));
        for(int i = 2; i <= upperLimit; i++){
            if(i < a && a % i == 0) return false;
        }
        return true;
    }
}
