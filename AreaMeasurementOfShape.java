package assignment2;

public class AreaMeasurementOfShape {
	
	public static void main(String[] args) throws InterruptedException {
		int i[] = {1, 2, 3};
		
		String a = "Triangle";
		
		int LengthOfTriangle = 12;
		int HeightOfTriangle = 5;
		
		try {
			System.out.println("Shape :" + a);
			Thread.sleep(500);
			System.out.println(i[3]);
			//Starts from 0, 1, 2
			System.out.println("Dimension Area : " + (LengthOfTriangle*HeightOfTriangle)/2 + "cm");
		}
		catch(ArithmeticException e){
			System.out.println("Unable to calculate");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException f){
			System.out.println("Array out of bounds!");
			f.printStackTrace();
		}
		finally {
			System.out.println((LengthOfTriangle*HeightOfTriangle)/2  + "cm");
		}
			
	}

}
