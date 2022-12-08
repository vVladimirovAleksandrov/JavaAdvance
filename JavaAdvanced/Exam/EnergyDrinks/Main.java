package JavaAdvance.JavaAdvanced.Exam.EnergyDrinks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {

    public static int maxCoffeine = 300;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(", "))
                            .map(Integer::parseInt).collect(Collectors.toList());
        Deque<Integer> caffeine = listToDeque(list);

        list = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).collect(Collectors.toList());
        Deque<Integer> energyDrinks = listToQueue(list);
        int totalCaffeine = 0;

        while(!caffeine.isEmpty() && !energyDrinks.isEmpty()) {

            int curCaffeine = caffeine.peek();
            int currentDrink = energyDrinks.peek();

            if((curCaffeine * currentDrink) + totalCaffeine <= maxCoffeine) {
                totalCaffeine += (curCaffeine * currentDrink);
                caffeine.pop();
                energyDrinks.poll();
            } else {
                caffeine.pop();
                energyDrinks.poll();
                energyDrinks.offer(currentDrink);

                if(totalCaffeine - 30 >= 0) {
                    totalCaffeine -= 30;
                } else {
                    totalCaffeine = 0;
                }
            }
        }

        if(energyDrinks.size() > 0) {
            print(energyDrinks);
        } else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }

        System.out.printf("Stamat is going to sleep with %d mg caffeine.", totalCaffeine);
    }

    static Deque<Integer> listToDeque(List<Integer> list) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (Integer item : list) {
            deque.push(item);
        }
        return deque;
    }

    static Deque<Integer> listToQueue(List<Integer> list) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (Integer item : list) {
            queue.offer(item);
        }
        return queue;
    }

    static void print(Deque<Integer> deque) {
        System.out.print("Drinks left: ");
        for (Integer item : deque) {
            if(item == deque.getLast()) {
                System.out.print(item);
            } else {
                System.out.print(item + ", ");
            }
        }
        System.out.println();
    }
}