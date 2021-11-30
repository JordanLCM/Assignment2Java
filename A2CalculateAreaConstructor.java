package Area.Calculate.Assignment2;

public class A2CalculateAreaConstructor {

	A2CalculateAreaParent ShapeAreaMeasurements = new A2CalculateAreaParent();
	
	public A2CalculateAreaConstructor() {
		System.out.println(ShapeAreaMeasurements.Shapes[0] + ((ShapeAreaMeasurements.height[2] * ShapeAreaMeasurements.breadth[2])/2) + "cm");
		//calculate area of triangle = (height X breath) / 2
		
		System.out.println(ShapeAreaMeasurements.Shapes[1] + (ShapeAreaMeasurements.length[2] * ShapeAreaMeasurements.breadth[2]) + "cm");
		//calculate area of square = (length X breath)
		
		System.out.println(ShapeAreaMeasurements.Shapes[2] + (Math.PI) * (Math.pow(ShapeAreaMeasurements.radius[1], ShapeAreaMeasurements.power))+ "cm");
		//calculate area of circle = (pi X radius ** 2)
		
		System.out.println(ShapeAreaMeasurements.Shapes[3] + ((ShapeAreaMeasurements.length[1] + ShapeAreaMeasurements.length[2])/2) * ShapeAreaMeasurements.height[2] + "cm");
		//calculate area of trapezium = ((length + length) / 2) * height
		
	}
}
