public class Diamond {
	public static void main(String[] args) {
		int n = 9;
		int c = 1;
		for (int i = 1; i <= 2 * n - 1; i++) {
			for (int j = c; j <= n; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= c * 2 - 1; k++) {
				System.out.print("* ");
			}
			if (i < n)
				c++;
			else
				c--;
			System.out.println("");
		}
	}
}
