package semester1.Blatt4;

public class Reihenberechnung_2
{
	public static void main(String[] args)
	{
		//Initialisieren der Variablen
		
		double formel1, anderung, summe1, summe2;
		summe1 = 0;
		
				
			for (int k = 1; ;k++)
				{
				
					//Berechnung
					formel1 = 1 / (Math.pow(k, 2));
					
					summe1 = summe1 + formel1;
					summe2 = summe1-formel1;
					anderung = (summe1*6) - (summe2*6);
					if (anderung < 0.00001 )
					{
						System.out.println(k+ " Reihenwert: " + (summe1*6));
						break;
					}
					else
					{	
						System.out.println(k+ " Reihenwert: " + (summe1*6));
					}
				}
	}

}
