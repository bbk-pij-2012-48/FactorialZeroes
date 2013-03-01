
public class FactorialZeroes {
	
	public int trailingZeroes(int src) {
		int output = 0;					// number of trailing zeroes
		long total = 1;
		for(int i=2 ; i<=src ; i++) {
			total *= i;
			while(total%10 == 0) {
				total /= 10;
				output++;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		FactorialZeroes launcher = new FactorialZeroes();
		launcher.launch();
	}
	
	public void launch() {
		int src = 40;
		System.out.println(src + "! has " + trailingZeroes(src) + " trailing zeroes.");
	}
}
