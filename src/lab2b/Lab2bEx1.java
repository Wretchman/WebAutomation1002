package lab2b;

abstract class GO{
	abstract double area(int sides);
	abstract double perimeter();
	
}

class Octagon extends GO implements Comparable, Cloneable {
	int side;
	
	public Octagon(int side) {
	this.side = side;	
		
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double area(int side) {
		double a;
		a = (2+4/Math.sqrt(2))*side * side;
		
		return a;
	}

	@Override
	double perimeter() {
		
		return (this.side * 8);
	}
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
	
}


public class Lab2bEx1 {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Octagon o1 = new Octagon(8);
		System.out.println("Area = " +  o1.area(8));
		System.out.println("P = " + o1.perimeter());
			
		Octagon o2 = (Octagon)o1.clone();
		
		if (o1.equals(o2))
			System.out.println("the objects are equal");
		else
			System.out.println("the objects are NOT equal");
			
	}

}
