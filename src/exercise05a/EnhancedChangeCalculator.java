package exercise05a;

// Ihre Aufgabe ist es, in der nachfolgenden Klasse die geerbte
// Methode getChange zu ueberschreiben. Natuerlich muss der
// Softwarevertrag der Oberklasse eingehalten werden. Ihre
// Spezialisierung soll aber darueber hinaus sicherstellen,
// dass die Anzahl der ausgegeben Muenzen minimal ist.

public class EnhancedChangeCalculator extends SimpleChangeCalculator 
{
	
	// Hier fehlt Ihre Implementierung

	public int[] getChange(int euro, int cent)
	{
		
		int result [] = new int [8];
		int twoeuro 	= 0;
		int oneeuro 	= 0;
		int fiftycent 	= 0;
		int twentycent 	= 0;
		int tencent 	= 0;
		int fivecent 	= 0;
		int twocent		= 0;
		int onecent		= 0;
		
		int amountOfcent = 100 * euro +cent; 
		
		
		
		while (amountOfcent >= 200){
			twoeuro++;
			amountOfcent -= 200;	
		}
		while (amountOfcent >= 100){
			oneeuro++;
			amountOfcent -=100;
		}
		while(amountOfcent >= 50){
			fiftycent++;
			amountOfcent -=50;
		}
		while(amountOfcent >= 20){
			twentycent++;
			amountOfcent -=20;
		}
		while(amountOfcent >= 10){
			tencent++;
			amountOfcent -=10;
		}
		while(amountOfcent >= 5){
			fivecent++;
			amountOfcent -=5;
		}
		while(amountOfcent >= 2){
			twocent++;
			amountOfcent -=2;
		}
		while(amountOfcent >= 1){
			onecent++;
			amountOfcent -=1;
		}
		
		result [0] = onecent;
		result [1] = twocent;
		result [2] = fivecent;
		result [3] = tencent;
		result [4] = twentycent;
		result [5] = fiftycent;
		result [6] = oneeuro;
		result [7] = twoeuro;
		
		return result;	
				
	}

	public static void main(String[] args)
	{
		
		EnhancedChangeCalculator calc = new EnhancedChangeCalculator();
		
		int[] result = calc.getChange(20,45);
		
		System.out.println("Der Automat gibt folgende Muenzen zurueck:");
		
		for (int i=0; i<Coin.availableCoins.length; i++)
		{
			System.out.println(result[i] + " x " + Coin.availableCoins[i].name());
		}
	}	
}

