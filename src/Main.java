import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // задание 2
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        Scanner scan = new Scanner(System.in);
        System.out.println("введите сумму начального щета: ");
        int sumBalance = scan.nextInt() ;
        System.out.println("Введите сумму пополнения: ");
        int depositAmount = scan.nextInt();
        sumBalance = (depositAmount >= 1000)? depositAmount/100 + sumBalance + depositAmount : depositAmount + sumBalance;
        System.out.println("Баланс = " + sumBalance);
    }
}