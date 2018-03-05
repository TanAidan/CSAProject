package unit9;



/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] r = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};		
		String[] s = {"Hearts","Spades","Diamond","Clubs"};
		
		int[] p = {2,3,4,5,6,7,8,9,10,10,10,10,1};
		
		Deck d1 = new Deck(r,s,p);
	d1.deal();
		System.out.println(d1);
		
	}
}
