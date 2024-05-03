import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Array {
    private int[] numbers;
    private int Count;

    public Array(int size)
    {
        numbers = new int[size];
    }
    public void insert(int item){
        if (Count == numbers.length){
            int[] newNums = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++)
                newNums[i] = numbers[i];
            numbers = newNums;
        }
        numbers[Count++] = item;
    }
    public int indexOf(int item){
        for (int i = 0; i < Count; i++){
            if (numbers[i] == item)
                return i;
        }
        return -1;
    }
    public void removeAt(int index){
        if (index < 0 || index >= Count)
            throw new IllegalArgumentException();

        for (int i = index; i < Count; i++)
            if (i + 1 < Count)
                numbers[i] = numbers[i + 1];
        Count--;
    }
    public int max(){
        int maxNum = numbers[0];
        for (int i = 0; i < Count; i++){
            if (numbers[i] > maxNum)
                maxNum = numbers[i];
        }
        return maxNum;
    }
    public String intersect(int[] newArray){
        StringBuilder builder = new StringBuilder();
        for (int j : newArray) {
            if (indexOf(j) != -1) {
                builder.append(j);
                builder.append(",");
            }
        }
        if (!builder.isEmpty()){
            builder.deleteCharAt(builder.lastIndexOf(","));
        }
        return  builder.toString();
    }

    public int sumAll(){
        int sum = 0;
        for (int i = 0; i < Count; i++)
        {
            sum += numbers[i];
        }
        return sum;
    }

    public int maxNum(){
        int largestNum = 0;
        largestNum = numbers[0];
        for (int i = 0; i < Count; i++){
            if (numbers[i] > largestNum)
                largestNum = numbers[i];
        }
        return largestNum;
    }

    public int minNum(){
        int smallestNum = 0;
        smallestNum = numbers[0];
        for (int i = 0; i < Count; i++){
            if (numbers[i] < smallestNum)
                smallestNum = numbers[i];
        }
        return smallestNum;
    }
    public int average(){
        int sum = 0;
        for (int i = 0; i < Count; i++){
            sum += numbers[i];
        }
        return sum / Count;
    }
    public void reverse(){
        Stack<Integer> stack = new Stack<>();
        int[] newNums = new int[Count];
        int index = 0;
        for (int i = 0; i < Count; i++){
            stack.push(numbers[i]);
        }
        while (!stack.isEmpty()){
            newNums[index++] = stack.pop();
        }

        numbers = newNums;
    }
    public void sortAscending(){
        for (int i = 0; i < Count; i++){
            for (int j = i + 1; j < Count; j++){
                int temp = 0;
                if (numbers[i] > numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
    public void sortDesc(){
        for (int i = 0; i < Count; i++){
            for (int j = i + 1; j < Count; j++){
                int temp = 0;
                if (numbers[i] < numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
    public boolean contains(int item){
        for (int i = 0; i < Count; i++){
            if (numbers[i] == item)
                return true;
        }
        return false;
    }
    public void removeDuplicates(){
        List<Integer> numsHolder = new ArrayList<>();
        for (int i = 0; i < Count; i++){
            if (numsHolder.contains(numbers[i]))
            {
                if ((i + 1) < Count)
                    numbers[i] = numbers[i + 1];

                i--;
                Count--;
            }{
                numsHolder.add(numbers[i]);
            }
        }
    }
    public int secondLargest()
    {
        sortAscending();

        return  numbers[Count - 2];
    }
    public int[] mergeArrays(int[] a, int[] b)
    {
        int index = 0;
        int length = a.length + b.length;
        int [] c = new int[length];
        for (int i = 0; i < length; i++){
            if (i < a.length){
                c[index++] = a[i];
            }
        }
        for (int k : b) {
            if (index < length)
                c[index++] = k;
        }

        for (int j = 0; j < c.length; j++){
            if (j + 1 < c.length) {
                for (int h = j + 1; h < c.length; h++)
                {
                    int temp = 0;
                    if (c[j] > c[h])
                    {
                        temp = c[j];
                        c[j] = c[h];
                        c[h] = temp;
                    }
                }
            }
        }
        return  c;
    }


    public void print()
    {
        for (int i = 0; i < Count; i++){
            System.out.println(numbers[i]);
        }
    }
}