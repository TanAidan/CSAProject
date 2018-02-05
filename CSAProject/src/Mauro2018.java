import javax.swing.JOptionPane;

public class Mauro2018 {
public static void main(String[] args) {
	
	String num1 = JOptionPane.showInputDialog("Enter your age");
	
	int one = Integer.parseInt(num1);
	if(one <1)
	{
		System.out.println(" dude you aren't younger than that");
		System.exit(0);
	}
	Mauro2018 mauro = new Mauro2018();
	mauro.readNum(one);
	
}
public void readNum(int i)
{
	
	String print;
	switch  (i)
	{
		case 1: print = "infant";
				break;
		case 2:
		case 3:
			print = "toddler";
			break;
		case 4:
			print  = "preschooler";
			break;
		case 5:
			print= "kindergartener";
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			print = "elementary age";
			break;
		case 11:
		case 12:
		case 13:
			print =" middle schooler";
			break;
		case 14:
		case 15:
		case 16:
		case 17:
			print = "high schooler";
			break;
		case 18: 
			print = "too cool";
			break;
		default:
			print = "old";
			break;
			//
			
	}
	System.out.println(print);
	
}
}





