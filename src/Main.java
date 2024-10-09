import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи число: ");

        int t = scanner.nextInt();

        int num  = t % 5;
        if (num>=0 && num<=2) {
            System.out.println("светофор зеленый");
        } else if (num>=3 && num<=4) {
            System.out.println("светофор красный");
        }

    }
}