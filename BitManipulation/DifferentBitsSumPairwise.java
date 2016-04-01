package BitManipulation;

import java.util.ArrayList;

/*
Different Bits Sum Pairwise
We define f(X, Y) as number of different corresponding bits in binary representation of X and Y. For example, f(2, 7) = 2, since binary representation of 2 and 7 are 010 and 111, respectively. The first and the third bit differ, so f(2, 7) = 2.

You are given an array of N positive integers, A1, A2 ,..., AN. Find sum of f(Ai, Aj) for all pairs (i, j) such that 1 <= i, j <= N. Return the answer modulo 109+7.

For example,

A=[1, 3, 5]

We return

f(1, 1) + f(1, 3) + f(1, 5) + 
f(3, 1) + f(3, 3) + f(3, 5) +
f(5, 1) + f(5, 3) + f(5, 5) =

0 + 1 + 1 +
1 + 0 + 2 +
1 + 2 + 0 = 8
 */
public class DifferentBitsSumPairwise {
	public int cntBits(ArrayList<Integer> a) {
        int n = a.size();
        long count = 0;
        int MOD = ((int)Math.pow(10,9))+7;
        for(int i = 0; i < 31; i++){
            long zeroCount = 0;
            long oneCount = 0;
            for(int j = 0; j < a.size(); j++){
                int element = a.get(j);
                if((element & (1<<i)) != 0){
                    oneCount++;
                }else{
                    zeroCount++;
                }
            }
            count = ((count%MOD) + ((2*zeroCount*oneCount)%MOD))%MOD;
        }
        
        return (int)count;    
    }
}
