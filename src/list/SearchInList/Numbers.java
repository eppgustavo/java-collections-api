package list.SearchInList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Numbers {

    private List<Integer> numbers;

    public Numbers() {
        this.numbers = new ArrayList<Integer>();
    }

    public void addNumberToList(int number) {
        this.numbers.add(number);
    }

    public void calculateSumOfAllNumbers() {
        if (!numbers.isEmpty()) {
            int sum = 0;
            for (Integer number : numbers) {
                sum += number;
            }
            System.out.println("The sum of all numbers is " + sum);
        }
        else {
            System.out.println("There are no numbers in the list");
        }
    }

    public void findHighestNumberInTheList() {
        if (!numbers.isEmpty()) {
            System.out.println("The highest number in the list is: " + Collections.min(numbers));
        } else {
            System.out.println("There are no numbers in the list");
        }
    }

    public void findLowestNumberInTheList() {
        if (!numbers.isEmpty()) {
            System.out.println("The lowest number in the list is: " + Collections.min(numbers));
        } else {
            System.out.println("There are no numbers in the list");
        }
    }

    public void showNumbersInTheList() {
        if (!numbers.isEmpty()) {
            System.out.println("The numbers in the list is: ");
           for (Integer number : numbers) {
               System.out.println(number);
           }
        } else {
            System.out.println("There are no numbers in the list");
        }
    }

    public static void main(String[] args) {

        final Numbers numbers = new Numbers();

        numbers.addNumberToList(10);
        numbers.addNumberToList(15);
        numbers.addNumberToList(20);

        numbers.findHighestNumberInTheList();
        numbers.findLowestNumberInTheList();

        numbers.calculateSumOfAllNumbers();

        numbers.showNumbersInTheList();

    }
}
