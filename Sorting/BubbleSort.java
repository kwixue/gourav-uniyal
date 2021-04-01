import java.util.*;
import java.io.*;

public class BubbleSort {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] a = new int[n];
			for (int i = 0; i < n; ++i)
				a[i] = Integer.parseInt(st.nextToken());
			bubbleSort(a, n);
			System.out.println(Arrays.toString(a));
		}
	}

	public static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n; i++)
			for (int j = 1; j < n - i; j++) {
				if (less(a[j], a[j - 1]))
					exchange(a, j, j - 1);
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
