import java.util.Scanner;

public class ItemNotFound {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String[] heroes = {"Abderous", "Achilles", "Aeneas",
			"Ajax", "Amphityron", "Bellerophon", "Castor",
			"Chrysippus", "Daedalus", "Diomedes", "Eleusis",
			"Eunostus", "Ganymede", "Hector", "Iolaus", 
			"Jason", "Meleager", "Odysseus", "Orpheus", 
			"Perseus", "Thesius", "Achilles", "Achilles"};
		String guess;
		boolean found;
		int counter = 0;

		System.out.println("Pop Quiz!");
		System.out.print("Name any *mortal* hero from" + 
			"Greek mythology: ");
		guess = keyboard.next();

		found = false;

		/*
		for (String hero: heroes) {
			if (guess.equals(hero)) {
				counter++;
			}
		}
		*/

		for (String hero: heroes) {
			if (guess.equals(hero)) {					
				found = true;
				counter++; 	//Moved counter here - simpler
			}				//and smaller code than req
		}					//in the study drill.

		if (found == false) {
			System.out.println("No, " + guess + 
				" wasn't a Greek mortal hero.");
		} else {
			System.out.println("Yes " + guess + 
					" was a Greek mortal hero. He was " +
					"found " + counter + " times.");
		}
	}
}
