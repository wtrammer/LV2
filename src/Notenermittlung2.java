
public class Notenermittlung2 {

	public static void main(String[] args) {
		
		String note = "nix";
		int noten = 90;
		
		System.out.println("Note = " + note);
		
	}
	
	
	public static String note(int noten)	{
		
			
	
	if (noten >= 90)
	{
		note = "Sehr Gut";		
	}
	
	else if (noten >=78)
	{
		note= "Gut";
	}
	
	else if (noten >=65)
	{
		note = "Befriedigend";
	}
	
	else if (noten >= 51)
	{
		note = "Genügend";
	}
	else 
	{
		note = "Nicht Genügend";
	}
	}

}
