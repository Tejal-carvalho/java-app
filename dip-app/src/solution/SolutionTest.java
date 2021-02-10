package solution;

public class SolutionTest {

	public static void main(String[] args) {
		TaxCalculator obj=new TaxCalculator(new JSONLogger());
		System.out.println(obj.calculateTax(10, 5));
		System.out.println(obj.calculateTax(0, 0));
	}

}
