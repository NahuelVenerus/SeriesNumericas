package com.company;

public class Main {
    /*
    Dadas las siguientes series numericas, desarrollar programas que muestren los primeros 20 terminos de cada una de ellas.

    a. 1, 1, 2, 3, 4, 9, 8, 27, 16...
        es decir 2(a la 0), 3(a la 0), 2(a la 1), 3(a la 1), 2(a la 2), 3(a la 2)...
    b. -1, 2, -3, 4, -5, 6 -7...
        es decir 1*(-1)(a la 1), 2*(-1)(a la 2), 3*(-1)(a la 3)...
    c. 1, 2, 4, 7, 11, 16, 22, 29
        es decir 1, (1+1), (2+2), (4+3), (7+4), (11+5), (16+6), (22+7)...
     */

    public static int calculateA(){
        int resultA = 1;
        for (int i = 0; i < 9; i++) {
            resultA = (int) Math.pow(2, i);
            System.out.println(resultA);
            resultA = (int) Math.pow(3, i);
            System.out.println(resultA);
        }
        return resultA;
    }

    public static int calculateB(){
        int resultB = 1;
        for (int i = 1; i < 20; i++) {
            resultB = i * (int) Math.pow((-1), i);
            System.out.println(resultB);
        }
        return resultB;
    }


    private static int calculateC() {
        int resultC = 1;
        for (int i = 0; i < 20; i++) {
            int savedNumber = resultC;
            resultC = savedNumber + i;
            System.out.println(resultC);
        }
        return resultC;
    }

    public static void main(String[] args) {
        System.out.println("A:");
        System.out.println(calculateA());
        System.out.println("B:");
        System.out.println(calculateB());
        System.out.println("C:");
        System.out.println(calculateC());
    }
}
