package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by yassirhessane on 10/09/16.
 */
public class Fibonacci {

    public int fib(int n)
    {
        if(n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }
    
    public long fibDynamique(int n)
    {
        long[] tab  = new long[n+1];
        tab[1] = 1;
        tab[2] = 1;


        for(int i=3;i<=n;i++)
        {
            tab[i] = tab[i-1] + tab[i-2];
        }
        return tab[n];
    }

    public BigInteger fibonacci(int n, ArrayList<BigInteger> memoized) {
        BigInteger febonani = BigInteger.ZERO;
        int size = memoized.size();
        if (n < 0) {
            return BigInteger.ZERO;
        }
        if (size > n) {
            febonani = memoized.get(n);
        } else {
            for(int i = size; i <= n; i++) {
                if(i == 0) {
                    febonani = BigInteger.ZERO;
                } else if(i == 1 || i == 2) {
                    febonani = BigInteger.ONE;
                } else {
                    febonani = memoized.get(i - 1).add(memoized.get(i - 2));
                }
                memoized.add(febonani);
            }
        }
        return febonani;
    }

    public BigInteger fibMem(int n)
    {
        List<BigInteger> list = new ArrayList<BigInteger>();
        BigInteger febona = BigInteger.ZERO;



        for (int i=0;i<=n;i++) // creation d'un tableau dynamique pour resoudre le souci en programmation dynamique
        {
            if (i == 0)
                febona = BigInteger.ZERO; //initialisation dans array vu que il n'y a pas de calcul sur la position zero
            else if(i==1 || i== 2)
                febona = BigInteger.ONE; // initialisation du premier et deuximeme element vu le calcule commence au l'indice 4 == chiffre 3
            else
                febona = list.get(i-1).add(list.get(i-2));
            list.add(febona);
        }

        return febona;
    }
}
