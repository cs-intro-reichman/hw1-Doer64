// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);

        int hund = num/100; //hundreds
        int tens = (num/10)%10; //tens
        int ones = num%10; //ones

        System.out.println(hund + " hundreds, "+ tens+" tens, and "+ ones +" ones.");
	}
}
