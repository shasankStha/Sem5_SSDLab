package lab5;

public class Menu {
	
	void displayMenuOption(int opt) throws InvalidOptionException{
		if(opt>=1 & opt<=3) {
			System.out.println("Menu option "+opt+" selected");
		}
		else{
			throw new InvalidOptionException(""+opt);
		}
	}
}
