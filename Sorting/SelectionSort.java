import java.util.Arrays;

class SelectionSort {
	public static void main(String[] args) {
		int a[] = { -23, 65, -31, 76, 46, 89, 45, 32 };
		selectionSort(a);
	}

	public static void selectionSort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (less(a[j], a[min])) {
					min = j;
				}
			}
			if (min != i) {
				exchange(a, i, min);
			}
		}
		System.out.println(Arrays.toString(a));
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