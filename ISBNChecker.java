
public class ISBNChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isISBN("0205080057"));
		System.out.println(isISBN("123456789X"));
		System.out.println(isISBN("0136091812"));
	}
	
	public static boolean isISBN(String isbn) {
		//sum: sum & last digit c
		int sum = 0;
		char c = 'X';
		//sum up all numbers
		for (int i = 0; i < 9; i++) {
			sum += (i + 1) * Character.getNumericValue(isbn.charAt(i));
		}
		//mod 11
		sum %= 11;
		//change c if necessary
		if (sum != 10) {
			c = (char)((char) sum + '0'); //small cast trick in C
		}
		return (c == isbn.charAt(9));
	}
}
