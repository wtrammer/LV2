
public class Beispiel2 {

	public static void main(String[] args) {
		
		boolean isWinterreifenpflicht = true;
		boolean rutschigeFahrbahn = true;
		int temperatur = 9;
		
		boolean result = isWinterreifenpflicht(temperatur,rutschigeFahrbahn);
		
		System.out.println("Winterreifenpflicht: " +result);
		
	}
	
	public static boolean isWinterreifenpflicht(int temperatur, boolean rutschigeFahrbahn) {
		
		return ( (temperatur <4)
					|| (temperatur <10 && rutschigeFahrbahn == true));
		
		
	}

}
