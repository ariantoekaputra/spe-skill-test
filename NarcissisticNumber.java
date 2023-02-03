import java.util.Scanner;

public class NarcissisticNumber {
    int countDigits(int number) {
        if (number == 0)
            return 0;
        return 1 + countDigits(number / 10);
    }

    boolean isNarcissistic(int number) {
        int pwr = countDigits(number);
        int n = number;
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, pwr);
            n = n / 10;
        }
        if (number == sum) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        NarcissisticNumber nrstic = new NarcissisticNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        //
        if (nrstic.isNarcissistic(number))
            System.out.println(number + " angka Narcissistic");
        else
            System.out.println(number + " bukan angka Narcissistic");
    }
}