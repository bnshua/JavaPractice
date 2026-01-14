public class ArrayEx1 {

    public static void main(String args[]) {

        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = primes;
        System.out.println(primes2[0]);
        primes2[0] = 5;
        System.out.println(primes[0]);
        int[] score = new int[9];
        byte[] values = {1,1,1,1,1,1,1,1,1,1};
        System.out.println(score[0]);
        System.out.println(values[7]);

    }

}
