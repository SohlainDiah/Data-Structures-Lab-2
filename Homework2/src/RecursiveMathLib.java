
public class RecursiveMathLib extends MathLib{

	@Override //overriding abstract method from MathLib
	public int gcd(int x, int y) {
		if ( y == 0 )
			return x;
		
		if ( x >= y && x!= 0 ) {
			return gcd ( y, x%y );
		}
		
		return 0;
	}
	
	int Acker(int x, int y) {
		if(y == 0) {	
			return(Acker(x-1, 1));
		}else{
			if(x != 0 && y != 0) {
			return(Acker(x-1, Acker(x, y-1)));
			}
		}
		return(y+1);
	}
	
	int Hanoi(int n) {
		if(n == 1) {
			return(n);
		}else {
			if(n>1) {
				return(2*(Hanoi(n-1))+1);
			}
		}
		return(n);
	}
}
