package JavaAdvance.JavaAdvanced.ExamPrep.OSPlanning;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(", "))
                            .map(Integer::parseInt).collect(Collectors.toList());
        Deque<Integer> tasks = listToDeque(list);

        List<Integer> queue = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt).collect(Collectors.toList());
        Deque<Integer> threads = listToQueue(queue);
        int taskToBeKilled = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < tasks.size(); i++) {
            for (int j = 0; j < threads.size(); j++) {
                int threadValue = threads.poll();
                int taskValue = tasks.pop();

                if(taskToBeKilled == taskValue){
                    System.out.printf("Thread with value %d killed task %d\n", threadValue, taskToBeKilled);
                    threads.push(threadValue);
                    for (Integer item : threads) {
                        System.out.print(item + " ");
                    }
                    break;
                } else if(threadValue < taskValue){
                    tasks.push(taskValue);
                }
            }
        }
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
}
