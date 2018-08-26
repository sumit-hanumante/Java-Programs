/**
 * Created by sumit.
 *
 * Prime Number is a number that is divisible only by itself and 1
 *
 *
 * This Program is optimized version
 * to check whether given number
 * or all the numbers between 1 to N is
 * prime of not
 *
 */


public class PrimeNumber {

    public static void main(String[] args) {

        int number = 41;

        if (isPrime(number))
            System.out.println(number + " is prime number");
        else
            System.out.println(number + " is not prime number");
    }

    static boolean isPrime(int number){

        if (number<=1)
            return false;
        if (number<=2)
            return true;

        /***
         * to check whether number is prime or not
         * we need to iterate till square root of that number
         * only
         */
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public void printAllPrimeNumberBetweenTheNumber(int number){

        for (int i = 2; i <=number ; i++){
            if (PrimeNumber.isPrime(i))
                System.out.println(i);
        }
    }
}
