package BinarySearch;

/*
 Implement Power Function
 Implement pow(x, n) % d.

 In other words, given x, n and d,

 find (x^n % d)

 Note that remainders on division cannot be negative. 
 In other words, make sure the answer you return is non negative.

 Input : x = 2, n = 3, d = 3
 Output : 2

 2^3 % 3 = 8 % 3 = 2.
 See Expected Output

 */
public class PowerFunction {
	public static void main(String[] args) {
		new PowerFunction().pow(-2, 3, 3);
	}
	public int pow(int x, int n, int d) {

		long a = x;
		long res = 1L;

		while (n > 0) {

			if (n % 2 == 1) {
				res *= a;
				res %= d;
				System.out.println(res);
			}

			a *= a;
			a %= d;
			n = n >> 1;

		}

		res = (res + d) % d;

		return (int) res;

	}
}
