public class SpacedPyramidNum {

	public static void main(String[] args) {
		int n = 5;
		int c = 1;
		for (int i = 0; i < n; i++) {
			c = 1;
			for (int j = 0, k = i + 1; j < 2 * n + 1 && k > 0; j++) {
				if (i + j >= n && (i + j) % 2 == 0) {
					if (i == 0)
						System.out.print(1);
					else
						System.out.print(c++);
					k--;
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
