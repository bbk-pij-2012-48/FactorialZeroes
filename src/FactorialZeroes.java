
public class FactorialZeroes {
	
	public int trailingZeroes(int src) {
		int output = 0;					// number of factors of 5
		for(int i=5 ; i<=src ; i++) {
			int tmp = i;
			while(tmp % 5 == 0) {
				tmp /= 5;
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
		int src = 123456789;
		System.out.println(src + "! has " + trailingZeroes(src) + " trailing zeroes.");
	}
}
