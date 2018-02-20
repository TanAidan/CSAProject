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
		String[] r = {"A","B","C"};
		String[] s = {"Giraffes", "Lions"};
		int[] p = {2,1,6};
		Deck d1 = new Deck(r,s,p);
		System.out.println(d1.isEmpty());
		System.out.println("Asfsfd");
	}
}
