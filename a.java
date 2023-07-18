public class ex{
	static void div(int a, int b ) throws ArithmeticException
	{
		if (b==0) {
				throw new ArithmeticException();
			}	
			else {
				int c =a/b;
				System.out.print(c);
			}
	}
	public static void main(String[] args) {
		ex e = new ex();
		try{
			e.div(10,5);
		}
		catch(Exception a){
			System.out.print("You can't divide by zero !!");
		}
	}
}
