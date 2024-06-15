import java.time.Instant;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        printIsLeapYear(2021);
        System.out.println();

        System.out.println("Task 2");
        printValidTypeInfo(1, 2023);
        System.out.println();

        System.out.println("Task 3");
        printDeliveryDays(95);
    }

    public static void printIsLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.printf("%s год является високосным", year);
        } else {
            System.out.printf("%s год не является високосным", year);
        }
    }

    public static void printValidTypeInfo(int type, int year) {
        int currentYear = LocalDate.now().getYear();
        int transitionalYear = 2015;
        if (type == 0 && year < transitionalYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (type == 0 && year >= transitionalYear) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (type == 1 && year < transitionalYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (type == 1 && year >= transitionalYear) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else {
            System.out.println("Такого приложения нет");
        }
    }

    public static int calculateDistanceDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance < 100) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void printDeliveryDays(int deliveryDistance) {
        int deliveryDays = calculateDistanceDays(deliveryDistance);
        if (deliveryDays > 0) {
            System.out.println("Потребуется дней:" + deliveryDays);
        } else {
            System.out.println("Доставки не осуществляется");
        }
    }
}
