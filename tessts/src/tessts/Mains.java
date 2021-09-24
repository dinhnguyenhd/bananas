package tessts;

public class Mains {
	
	TestThread s1 = new TestThread( "Context 1");
	TestThread s2 = new TestThread("Context 2");
	TestThread s3 = new TestThread("Context 3");
	TestThread s4 = new TestThread("Context 4");
	
	public void demos() {
		s1.run();
		s2.run();
		s3.run();
		s4.run();
	}
	public static void main(String[] args) {
	 new Mains().demos();
	}
}
