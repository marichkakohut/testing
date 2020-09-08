package mery;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double waight = 53.5;
        int age = 19;
        String surname = " Kohut";
        System.out.println("Привіт я Марічка" + surname+" мені " + age +" років" +" моя вага " + waight);
        System.out.println("press any kay..");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
    }
}
