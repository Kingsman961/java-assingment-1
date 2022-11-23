// Insertion sort in Java

import java.util.*;

class InsertionSort {

  void insertionSort(int array[]) {
    int size = array.length;

    for (int step = 1; step < size; step++) {
      int key = array[step];
      int j = step - 1;

      // Compare key with each element on the left of it until an element smaller than
      // it is found.
      // For descending order, change key<array[j] to key>array[j].
      while (j >= 0 && key < array[j]) {
        array[j + 1] = array[j];
        --j;
      }

      // Place key at after the element just smaller than it.
      array[j + 1] = key;
    }
  }

  // Driver code
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number elements to be in the list :- ");
    int l = in.nextInt();
    int[] a = new int[l];
    int i;
    System.out.println("Enter the numbers :- ");
    for (i = 0; i < l; i++) {
      a[i] = in.nextInt();
    }
    InsertionSort is = new InsertionSort();
    is.insertionSort(a);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(a));
  }
}
