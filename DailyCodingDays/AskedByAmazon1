
/*
Sample Programming Interview Question
ASKED BY
There's a staircase with N steps, and you can climb 1 or 2 steps at a time.
Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.

For example, if N is 4, then there are 5 unique ways:

1, 1, 1, 1
2, 1, 1
1, 2, 1
1, 1, 2
2, 2
*/

public class AskedByAmazon1 {

    static public int factorial(int n, int r) {
        int result = 1;
        for (int i = r+1; i <= n; i++ ) {
            result = result * i;
        }
        return result;
    }

    static public int combination(int n, int r) {
        int firstFacto = factorial(n, r) == 0? 1: factorial(n, r);
        int secondFacto = factorial(n-r, 0) == 0? 1:factorial(n-r, 0);
        return firstFacto / secondFacto;
    }

    static public int solution(int N) {
        int k = N / 2;
        int result = 0;

        for(int i = 0; i <= k; i++ ) {
            result = result + combination(N - i, i);
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 10;
        int r = solution(N);
        System.out.println("if N is "+ N +", then there are "+ r +" unique ways");
    }

}
