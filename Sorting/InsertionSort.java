import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int a[] = { 2, 3, 1, 5, 4 };
		insertionSort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(less(2, 3));
	}

	static void insertionSort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j > 0; j--)
				if (less(a[j], a[j - 1]))
					exchange(a, j, j - 1);
				else
					break;
		}
	}

	static boolean less(Integer v, Integer w) {
		return v.compareTo(w) < 0;
	}

	public static void exchange(int a[], int i, int min) {
		int temp = a[i];
		a[i] = a[min];
		a[min] = temp;
	}
}
