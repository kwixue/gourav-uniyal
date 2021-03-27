public class RighAlignTriangleNum {
	public static void main(String[] args) {
		int n = 5;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < n; j++)
				if (j >= i)
					System.out.print(n - j);
				else
					System.out.print(" ");
			System.out.println("");
		}
	}
}
