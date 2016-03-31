//package exercise01;
package semester2.Uebung1;

// Die nachfolgende Klasse soll einen Punkt in einem zweidimensionalen
// Koordinatensystem repraesentieren.

public class Point {

	protected double x;
	protected double y;

	// Konstruktor mit Uebergabe der x und y - Koordinate
	Point(double x, double y)
	{
		if(x == (long) x)
			this.x = x;

		if(y == (long) y)
			this.y = y;
	}
	
	// Auslesen der x-Koordinate
	double getX()
	{
		return this.x;
	}
	
	// Auslesen der y-Koordinate
	double getY()
	{
		return this.y;
	}
	
	// Abstand zu einem anderen Punkt
	double distance(Point other)
	{
		double newX = Math.pow(this.getX() - other.getX(), 2);
		double newY = Math.pow(this.getY() - other.getY(), 2);
		return Math.sqrt(newX + newY);
	}
	
	// Erzeugung eines neuen Punktes, der zum Ausgangspunkt verschoben ist
	Point moved(double deltaX, double deltaY)
	{
		return new Point(this.getX() + deltaX , this.getY() + deltaY);
	}

	
	// **********************************************************
	// In der nachfolgenden Main-Methode werden einige Tests
	// ausgefuehrt, die bei korrekter Loesung keinen Fehler 
	// liefern sollten.
	
	public static void main(String[] args)
	{
		Point p1 = new Point(2, 3);
		
		System.out.println("Start der Tests...");
		
		if (Math.abs(p1.getX() - 2) > 0.1 )
			System.out.println ("x-Koordinate P1 fehlerhaft.");
		
		if (Math.abs(p1.getY() - 3) > 0.1 )
			System.out.println ("y-Koordinate P1 fehlerhaft.");
		
		Point p2 = p1.moved(-1, 2);
				
		if (Math.abs(p2.getX() - 1) > 0.1 )
			System.out.println ("x-Koordinate P2 fehlerhaft.");
				
		if (Math.abs(p2.getY() - 5) > 0.1 )
			System.out.println ("y-Koordinate P2 fehlerhaft.");

		double d = p1.distance(p2);
		
		if (Math.abs(d- Math.sqrt(5)) > 0.1)
			System.out.println ("Abstandsberechnung fehlerhaft.");

		if (Math.abs(p1.distance(p2) - p2.distance(p1)) > 0.1)
			System.out.println ("Abstandsberechnung fehlerhaft.");		

		System.out.println("Testende");
		
	}

}
