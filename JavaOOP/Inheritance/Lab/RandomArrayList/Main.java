package JavaOOP.Inheritance.Lab.RandomArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RandomArrayList list = new RandomArrayList();
        list.add(3);
        list.add(4);
        list.add(6);
        System.out.println(list.getRandomElement());
    }
}
