package assignment2;

public class AreaMeasurementOfShape {
	
	public static void main(String[] args) throws InterruptedException {
		
		String a = "Triangle";
		
		int LengthOfTriangle = 12;
		int HeightOfTriangle = 5;
		
		try {
			System.out.println("Shape :" + a);
			Thread.sleep(500);
			System.out.println("Dimension Area : " + (LengthOfTriangle*HeightOfTriangle)/2 + "cm");
		}
		catch(Exception e){
			System.out.println("Unable to calculate");
			e.printStackTrace();
		}
			
	}

}
