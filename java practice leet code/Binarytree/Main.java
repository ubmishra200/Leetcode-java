public class Main {

	public static void mains(int s) {
		String str = Integer.toString(s);
		int n = str.length();

		int evensum = 0;
		int oddsum = 0;
		for (int i = 0; i < n; i++) {
			int charts = Character.getNumericValue(str.charAt(i));
			if (charts % 2 == 0) {
				evensum += charts;
			} else {
				oddsum += charts;

			}
		}
		System.out.println(evensum + "  " + oddsum);

		// Write your code here

	}

	public static void main(String[] args) {
		int s = 1235545;
		mains(s);

	}

}
