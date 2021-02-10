package voilation;

public class VoilationTest {
	public static void main(String args[]) {
		TaxCalculator obj=new TaxCalculator(LogType.XML);
		System.out.println(obj.calculateTax(10, 5));
		System.out.println(obj.calculateTax(0, 0));
		
	}

}
