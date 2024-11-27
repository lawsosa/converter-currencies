import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rateUSD = 105.06;
        double rateEUR = 110.49;
        double rateCNY = 14.44;

        System.out.println("Введите сумму рублей для конвертации:");
        double countRUB = scanner.nextDouble();
        if (countRUB <= 0) {
            System.out.println("Ошибка: некорректные значения.");
            System.exit(0);
        }


        System.out.println("Введите номер валюты, в какую перевести рубли:");
        System.out.println("1 – доллары;");
        System.out.println("2 – евро;");
        System.out.println("3 – юани;");


        int numberReader = scanner.nextInt();

        if (numberReader == 1) {
            double resultUSD = countRUB / rateUSD;
            double roundedUSD = Math.round(resultUSD * 100.0) / 100.0;
            System.out.println("Количество долларов в рублях $" + roundedUSD);
        } else if (numberReader == 2) {
            double resultEUR = countRUB / rateEUR;
            double roundedEUR = Math.round(resultEUR * 100.0) / 100.0;
            System.out.println("Количество евро в рублях €" + roundedEUR);
        } else if (numberReader == 3) {
            double resultCNY = countRUB / rateCNY;
            double roundedCNY = Math.round(resultCNY * 100.0) / 100.0;
            System.out.println("Количество юаней в рублях ¥" + roundedCNY);
        } else {
            System.out.println("Такой команды нет.");
        }
        System.out.println("Программа завершена.");
    }
}
