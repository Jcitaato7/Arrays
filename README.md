# Array Manipulation Class - Java

## Overview
The 'Array' class is designed to handle various common operations on arrays, such as insertion, deletion, searching, and several calculations. It includes methods for finding sums, maximum and minimum elements, averages, and more complex operations like sorting and merging arrays.

## Features
The 'Array' class includes the following methods:
- `insert(int item)`: Adds an item to the array, expanding it if necessary.
- `indexOf(int item)`: Returns the index of the item, or -1 if not found.
- `removeAt(int index)`: Removes the item at the specified index.
- `max()`, `minNum()`: Returns the maximum and minimum values in the array.
- `sumAll()`: Calculates the sum of all elements.
- `average()`: Calculates the average of the elements.
- `reverse()`: Reverses the order of the elements in the array.
- `sortAscending()`, `sortDesc()`: Sorts the array in ascending or descending order.
- `contains(int item)`: Checks if the array contains a specified item.
- `removeDuplicates()`: Removes duplicate elements from the array.
- `secondLargest()`: Finds the second largest element in the array.
- `mergeArrays(int[] a, int[] b)`: Merges two sorted arrays into a single sorted array.
- `print()`: Prints all elements of the array.

## Usage
To utilize the `Array` class in your projects, include it in your Java project and instantiate it with a specified size. Here is a basic example of using some of the methods:

```java
public class Main {
    public static void main(String[] args) {
        Array myArray = new Array(10);  // Create an Array object with a capacity of 10 elements
        myArray.insert(3);
        myArray.insert(1);
        myArray.insert(6);
        myArray.insert(9);

        System.out.println("Index of 6: " + myArray.indexOf(6));
        myArray.removeAt(2);  // Removes the element at index 2

        System.out.println("Maximum Value: " + myArray.max());
        System.out.println("Sum of All Elements: " + myArray.sumAll());
        
        myArray.print();  // Prints all elements of the array
    }
}
```

## Contributions
Contributions are welcome. If you wish to improve the class or add more functionality, please fork the repository and submit a pull request.

## License
This project is open-sourced under the MIT license.
