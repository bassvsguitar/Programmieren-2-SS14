package exercise05b;

import java.lang.String;

// Die nachfolgende Klasse repraesentiert einen String.
// Durch das Ueberschreiben der equals-Methode soll
// erreicht werden, dass zwei Instanzen der Klasse
// dann als gleich betrachtet werden, wenn sie sich
// nur in der Gross-/Kleinschreibung des repraesentierten
// Strings unterscheiden.

public class CaseInsensitiveString
{
	// Hier wird der repraesentierte String gespeichert
	private String s;

	// Konstruktor, dem der jeweilige String uebergeben wird
	public CaseInsensitiveString(String s)
	{
		if (s == null)
			throw new NullPointerException();
		this.s = s;
	}

	// Getter, um den String ggf. auslesen zu koennen
	public String asString()
	{
		return s;
	}


// ***************************************************************************
// Hier fehlt die Implementierung einer passenden equals-Methode
	 public static void main(String[] args){
		 
	        CaseInsensitiveString s1 = new CaseInsensitiveString("abc"); 
	        CaseInsensitiveString s2 = new CaseInsensitiveString("abc"); 
	        CaseInsensitiveString s3 = new CaseInsensitiveString("ABc"); 
	        CaseInsensitiveString s4 = new CaseInsensitiveString("Abcd"); 
	        CaseInsensitiveString s5 = null; 
	        int s6= 5; 
	        String s7="Abc"; 
	          
	          
	        System.out.println(s1.equals(s1)); 
	        System.out.println(s1.equals(s2)); 
	        System.out.println(s1.equals(s3)); 
	        System.out.println(s1.equals(s4)); 
	        System.out.println(s1.equals(s5)); 
	        System.out.println(s1.equals(s6)); 
	        System.out.println(s1.equals(s7));
	 }
	     
// ***************************************************************************

}
