
// Selection sort in Java
import java.util.*;

class SelectionSort {
  void selectionSort(int array[]) {
    int size = array.length;

    for (int step = 0; step < size - 1; step++) {
      int min_idx = step;

      for (int i = step + 1; i < size; i++) {

        // To sort in descending order, change > to < in this line.
        // Select the minimum element in each loop.
        if (array[i] < array[min_idx]) {
          min_idx = i;
        }
      }

      // put min at the correct position
      int temp = array[step];
      array[step] = array[min_idx];
      array[min_idx] = temp;
    }
  }

  // driver code
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
    SelectionSort ss = new SelectionSort();
    ss.selectionSort(a);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(a));
  }
}
