// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		double r = Math.random();
		int a = (int) (r*lim);
		r = Math.random();
		int b = (int) (r*lim);
		r = Math.random();
		int c = (int) (r*lim);

		System.out.println(a + " " + b + " "+ c);

		int min = Math.min(Math.min(a, b), Math.min(b, c));
		int max = Math.max(Math.max(a, b), Math.max(b, c));
		int mid = (a + b + c) - min - max;

		System.out.println(min + " " + mid + " "+ max);
	}
}
