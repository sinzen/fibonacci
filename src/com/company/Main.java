package com.company;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Fibonacci calcul = new Fibonacci();
        int n = 100;







        for (int i = 0;i< n;i++)
        {
            System.out.println(calcul.fibMem(i));
        }
        //System.out.println(calcul.fibDynamique(n));
        /* ArrayList<BigInteger> memoized = new ArrayList<BigInteger>();
        calcul.fibonacci(n,memoized);

        for (BigInteger res: memoized )
        {
            System.out.println(res.toString());
        }*/
    }
}
