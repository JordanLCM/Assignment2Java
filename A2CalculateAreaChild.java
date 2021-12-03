package Area.Calculate.Assignment2;

public class A2CalculateAreaChild extends A2CalculateAreaParent{

	public static void main(String[] args) throws InterruptedException {
		
		try {
			System.out.println("All Shape Areas = ");
			Thread.sleep(1000);
			A2CalculateAreaConstructor AreaOfShapes = new A2CalculateAreaConstructor();
		}
		
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("There is a calculation error!");
			e.printStackTrace();
		} 
		
		catch (ArrayIndexOutOfBoundsException f) {
			// TODO: handle exception
			System.out.println("There is a an error in array of numbers available for selection");
			f.printStackTrace();
		}
		
	}
}
