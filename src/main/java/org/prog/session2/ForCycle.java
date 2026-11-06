package org.prog.session2;

public class ForCycle {
    public static void main(String[] args) {
        int divBy3 = 0;
        int divBy7 = 0;
        int divBy13 = 0;

        for (int i = 0; i < 100; i = i + 1){
            if(i%3==0)
            { divBy3++;}
            if(i%7==0)
            { divBy7++;}
            if(i%13==0)
            { divBy13++;}

        }
        System.out.println("Divisible by 3: " + divBy3);
        System.out.println("Divisible by 7: " + divBy7);
        System.out.println("Divisible by 13: " + divBy13);
    }
}
