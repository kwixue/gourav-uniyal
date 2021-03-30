public class PyramidNum {
	public static void main(String[] args) {
		int n = 5;
		int c;
		for (int i = 0; i < n; i++) {
			c = 1;
			for (int j = 0, k = 2 * i + 1; j < 2 * n + 1 && k > 0; j++) {
				if (i + j >= n) {
					System.out.print(c++);
					k--;
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
