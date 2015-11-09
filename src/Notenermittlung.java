
public class Notenermittlung {

	
	public static String note(int noten){
		
	} 
	public static void main(String[] args) {

	//int noten = 4;
	//String note = "nix";
	
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
		
		
		
		System.out.println("Note = " + note);
		
		
		
	}

}
