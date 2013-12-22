/**
 * Answer to Reverse binary problem
 *
 * Integer String to binary
 * Reverse binary
 * Convert new binary to integer
 * Print new integer
 */

class reverseBinary {
    public static void main(String[] args) {
	int outValue;
	String inBinary = Integer.toBinaryString(Integer.parseInt(args[0]));
	String outBinary = new StringBuilder(inBinary).reverse().toString();
	outValue = Integer.parseInt(outBinary, 2);
	String outString = Integer.toString(outValue);
	System.out.println(outString);
	}
}
