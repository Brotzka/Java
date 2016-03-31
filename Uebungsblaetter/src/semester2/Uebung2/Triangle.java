package semester2.Uebung2;

class Triangle implements Polygon
{
    private Point p1, p2, p3;
    private double distanceA, distanceB, distanceC;

    Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }


    public Point[] allVertexes(){
        Point[] points = new Point[3];
        points[0] = this.p1;
        points[1] = this.p2;
        points[2] = this.p3;

        return points;
    }

    public double perimeter(){
        Point p1 = this.p1;
        Point p2 = this.p2;
        Point p3 = this.p3;

        double p1TOp2 = p1.distance(p2);
        this.distanceA = p1TOp2;

        double p2TOp3 = p2.distance(p3);
        this.distanceB = p2TOp3;

        double p3TOp1 = p3.distance(p1);
        this.distanceC = p3TOp1;

        return p1TOp2 + p2TOp3 + p3TOp1;
    }

    public double area(){
        double s = this.perimeter() / 2;
        return Math.sqrt(s * (s - this.distanceA) * (s - this.distanceB) * (s - this.distanceC));
    }

    public void move(double dx, double dy){
        this.p1 = this.p1.moved(dx, dy);
        this.p2 = this.p2.moved(dx, dy);
        this.p3 = this.p3.moved(dx, dy);
    }


    public static void main(String[] args)
    {
        Point p1 = new Point(0.0, 0.0);
        Point p2 = new Point(1.0, 0.0);
        Point p3 = new Point(0.0, 1.0);

        Triangle Dreieck = new Triangle(p1, p2, p3);

        Point[] points = Dreieck.allVertexes();
        for(int x = 0; x < points.length; x++){
            System.out.println("Punkt " + (x + 1) + ": (" + points[x].getX() + ";" + points[x].getY() + ")");
        }

        System.out.println("Gesamtumfang: " + Dreieck.perimeter());
        System.out.println("Flächeninhalt: " + Dreieck.area());

        System.out.println("Strecke a: " + Dreieck.distanceA);
        System.out.println("Strecke b: " + Dreieck.distanceB);
        System.out.println("Strecke c: " + Dreieck.distanceC);


        System.out.println("Verschiebe das Dreieck um x = 2.0 und y = 3.0");
        Dreieck.move(2.0, 3.0);
        Point[] newPoints = Dreieck.allVertexes();
        for(int x = 0; x < newPoints.length; x++){
            System.out.println("Punkt " + (x + 1) + " neu: (" + newPoints[x].getX() + ";" + newPoints[x].getY() + ")");
        }
    }
}
