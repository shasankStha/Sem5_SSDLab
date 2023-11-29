package lab6;

public class Driver {

	/**
	 * To create an instance of NameManager and NumberSorter class and initilize its method
	 * @param args To recieve command line arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameManager manager = new NameManager();
		manager.addName("M.Mickleson");
		manager.addName ("Johnua Taylor Biggs");
		manager.addName ("P.Smith");
		manager.addName ("Peter Jonathan Smythton");
		manager.addName ("P.Thompson");
		manager.printNames();// should print all names
		manager.removeLongNames();
		manager.printNames();
		
		NumberSorter sorter = new NumberSorter();
		sorter.sort(new int [] {1,9,2,3,10,8,12,1, 99, 2, 43, 68, 109, 0},true);
		sorter.sort(new int [] {1,2,3,4},false);
		sorter.sort(new int [] {4,3,2,1},true);
	}

}
