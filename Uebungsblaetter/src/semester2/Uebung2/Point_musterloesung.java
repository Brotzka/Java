package semester2.Uebung2;


// Die nachfolgende Klasse repraesentiert einen Punkt in einem 
// zweidimensionalen Koordinatensystem.

public class Point_musterloesung {

	// Die Instanzvariablen zur Aufnahme der Koordinatenwerte
	private double x, y;

	// Konstruktor mit Uebergabe der x und y - Koordinate
	Point_musterloesung(double x, double y)
	{
		this.x = x;
		this.y = y;
	}//endconstructor
	
	// Auslesen der x-Koordinate
	double getX()
	{
		return x; 
	}//endmethod getX
	
	// Auslesen der y-Koordinate
	double getY()
	{
		return y; 
	}//endmethod getY
	
	// Abstand zu einem anderen Punkt
	double distance(Point_musterloesung other)
	{
		double dx = getX()-other.getX();
		double dy = getY()-other.getY();		
		return Math.sqrt(dx*dx + dy*dy);
	}//endmethod distance
	
	// Erzeugung eines neuen Punktes, der zum Ausgangspunkt verschoben ist
	Point_musterloesung moved(double deltaX, double deltaY)
	{
		return new Point_musterloesung(getX() + deltaX, getY() + deltaY);
	}//endmethod moved
	
	// Rueckgabe der Koordinaten in einem String in lesbarer Form
	public String toString()
	{
		return String.format("(%.2f;%.2f)", getX(), getY());
	}//endmethod toString
	
}//endclass
