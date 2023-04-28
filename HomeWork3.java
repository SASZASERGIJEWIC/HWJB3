import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько коробок вы хотите отправить?:");
        int boxes = scanner.nextInt();
        System.out.println("Сколько весит каждая коробка в килограммах?:");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Введите полное имя получателя:");
        String name = scanner.nextLine();
        System.out.println("Введите адрес получателя:");
        String address = scanner.nextLine();
        double boxweight = boxes * weight;
        String label = "Имя получателя:\"" + name.toUpperCase() + "\"\n" + "Адресс получателя:\"" + address.toUpperCase() + "\"\n" + "Вес посылки:" + boxweight +"кг";
        System.out.println(label);
        System.out.println("Все верно? true/false");
        boolean answer = scanner.nextBoolean();
    }
}
