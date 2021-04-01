import java.util.*;
import java.io.*;

public class QuickSort {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] a = new int[n];
			for (int i = 0; i < n; ++i)
				a[i] = Integer.parseInt(st.nextToken());
			quickSort(a, 0, n - 1);
			System.out.println(Arrays.toString(a));
		}
	}

	private static void quickSort(int[] a, int low, int high) {
		if (high <= low)
			return;

		int j = partition(a, low, high);
		quickSort(a, low, j - 1);
		quickSort(a, j + 1, high);
	}

	private static int partition(int[] a, int low, int high) {
		int i = low, j = high + 1;
		while (true) {
			while (a[++i] < a[low]) {
				if (i == high)
					break;
			}

			while (less(a[low], a[--j])) {
				if (j == low)
					break;
			}

			if (i >= j)
				break;

			exchange(a, i, j);
		}
		exchange(a, low, j);
		return j;
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
