package assignment2;

public class AreaMeasurementOfShape {
	
	public static void main(String[] args) throws InterruptedException {
		int i[] = {1, 2, 3};
		String a = "Triangle";
		int LengthOfTriangle = 15;
		//Input Length Value here
		int HeightOfTriangle = 10;
		//Input Height Value here
		try {
			System.out.println("Shape :" + a);
			Thread.sleep(1000);
			//////System.out.println(i[1]);
			//Starts from 0, 1, 2_ArrayIndexOutOfBoundsExceptionSituation
			//////System.out.println(10/0);
			//ArithmeticExecptionSituation
			System.out.println("Dimension Area : " + (LengthOfTriangle*HeightOfTriangle)/2 + "cm");
			//Area of triangle = (Length X Height) divided by 2
		}catch(ArithmeticException e){
			System.out.println("Unable to calculate");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException f){
			System.out.println("Array out of bounds!");
			f.printStackTrace();
		}finally {
			System.out.println((LengthOfTriangle*HeightOfTriangle)/2  + "cm");
		}
	}
}
