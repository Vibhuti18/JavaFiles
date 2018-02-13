

interface MyInt
{
	int opeation(int a,int b);
}
public class Tester {
	
	public static void main(String[] args) {
		
	
	
	MyInt my = new MyInt() {
		
		@Override
		public int opeation(int a, int b) {
			// TODO Auto-generated method stub
			//addition 
			return a+b;
		}
	};
	
 MyInt my11 = new MyInt() {
		
		@Override
		public int opeation(int a, int b) {
			// TODO Auto-generated method stub
			//addition 
			return a-b;
		}
	};
	
	
	MyInt mm = (int a,int b) -> a+b;
	System.out.println(mm.opeation(10,20));
	
	MyInt mm2 = (int a,int b) -> {
		System.out.println("Multiplication");
		return a*b;
	};
	
	}
	

}
