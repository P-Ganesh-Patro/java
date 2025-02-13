package MultiThreadingSync;

public class SynchonizationClassDemo {
	public static void main(String[] args) {
		DisplayInfo di = new DisplayInfo();
		GoodMorning gm = new GoodMorning();
		gm.displayInfo = di;
		GoodEvening gv = new GoodEvening();
		gv.displayInfo = di;
		gm.start();
		gv.start();
	}
}

class GoodMorning extends Thread {
	DisplayInfo displayInfo;

	@Override
	public void run() {
		displayInfo.displayMessage("Good morning", 2);
	}
}

class GoodEvening extends Thread {
	DisplayInfo displayInfo;

	@Override
	public void run() {
		displayInfo.displayMessage("Good Evening", 2);
	}
}

class DisplayInfo {
	// lock
	void displayMessage(String message, int count) {
//		only one thread can access this method
		synchronized (this) {
			for (int i = 0; i <= count; i++) {
				System.out.println(message + " **** " + i);
			}
		}
	}
}
