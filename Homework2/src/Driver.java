
public class Driver {

	public static void main(String[] args) {
		IterationMathLib iterationLib = new IterationMathLib();
		RecursiveMathLib recursiveLib = new RecursiveMathLib();
		
		System.out.println("----Recursive----");
		runtTestCode(recursiveLib);
		System.out.println("----Iteration---");
		runtTestCode(iterationLib);

	}
	public static void runtTestCode(MathLib library) {
		System.out.println("GCD(12, 4) = " + library.gcd(12, 4));
	}

}
