import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //task1
        int year =2022;
        task1(year);

        //task2
        int clientOS = 1; // (0 — iOS, 1 — Android)
        int clientDeviceYear = 2021;
        task2(clientOS,clientDeviceYear);

        //task3
        int deliveryDistance = 95;//  содержит дистанцию до клиента
        task3(deliveryDistance);
    }

    public static void task1(int yearNow) {
        int year = yearNow;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " — високосный год ");
        } else System.out.println(year + " — не високосный год");
    }

    public static void task2(int os, int year) {
        int clientOS = os; // (0 — iOS, 1 — Android)
        int clientDeviceYear = year;
        String nameOS;
        int currentYear = LocalDate.now().getYear();
        if (clientOS==0) {
             nameOS ="iOS";
        } else nameOS ="Android";
        if (clientDeviceYear>=currentYear) {
             System.out.println("Установите версию приложения для " + nameOS);
        }  System.out.println("Установите облегченную версию приложения для " + nameOS);

    }
    public static void task3(int distance) {
        int deliveryDistance = distance;//  содержит дистанцию до клиента
        int deliveryDay = 1;
        if (deliveryDistance<20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance>=20 && deliveryDistance <60) {
            deliveryDay = deliveryDay + 1;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance>=60 && deliveryDistance <100) {
            deliveryDay = deliveryDay + 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        }
    }
}