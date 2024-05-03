import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(10);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(20);
        numbers.print();
        System.out.println("index is: " + numbers.indexOf(30));
        numbers.removeAt(4);
        numbers.print();

        System.out.println("\n");
        System.out.println("Max num: " + numbers.max());
        System.out.println("\n");
        int[] newArray = {-1,-2,400,20};
        System.out.println("intersect item(s): " + numbers.intersect(newArray));
        System.out.println("\n");
        //numbers.reverse();
        numbers.print();

        System.out.println("Sum of remaining elements: " + numbers.sumAll());
        System.out.println("max number in array: " + numbers.maxNum());
        System.out.println("min number in array: " + numbers.minNum());
        System.out.println("average of all the elements in array: " + numbers.average());
        numbers.reverse();
        numbers.print();

        System.out.println("\n");
        numbers.sortAscending();
        System.out.println("Sorted Numbers Asc:");
        numbers.print();

        System.out.println("\n");
        numbers.sortDesc();
        System.out.println("Sorted Numbers desc:");
        numbers.print();

        System.out.println("\n");
        System.out.println("Number is in Array: " + numbers.contains(400));
        System.out.println("\n");

        System.out.println("array with duplicates:");

        numbers.print();
        System.out.println("\n");
        numbers.removeDuplicates();
        System.out.println("array without duplicates:");
        numbers.print();

        System.out.println("\n");
        System.out.println("Second Largest Number: " + numbers.secondLargest());

        System.out.println("\n");
        System.out.println("merging and sorting 2 arrays: ");
        int[] a = {12,10, 11, 13};
        int[] b = {9, 22, 11, 15};
        int[] mergedArraySort = numbers.mergeArrays(a,b);
        System.out.println(Arrays.toString(mergedArraySort));

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue:");
        System.out.println(queue);

        System.out.println("Reversed Queue:");
        reverse(queue);
        System.out.println(queue);

    }
    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
            queue.add(stack.pop());
    }
}
