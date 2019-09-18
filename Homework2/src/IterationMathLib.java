
public class IterationMathLib extends MathLib{

	@Override //overriding abstract method from MathLib
	public int gcd(int x, int y) {
		while ( y != 0 ) {
			if ( x >= y && x!= 0 ) {
				int temp = x;
				x = y;
				y = temp%y;
			}
		}
		return x;
	}
	
	int Acker(int x, int y) {
		while( x!=0 ) {
			if(y == 0) {
				y = 1;
				x = x -1;
			}else {
				if( x != 0 && y != 0) {
					if(y - 1 == 0) {
						if(x - 1 == 0) {
							y = 2;
						}
					}else {
						y = y - 1;
					}
					x = x - 1;
				}
			}
			
		}
		return y;
	}
	
	int Hanoi(int n) {
		int ans = 1;
		for(int i = 0; 1 < n; i++) {
			ans =  ans * 2;
		}
		return(ans - 1);
	}
	
	

}
