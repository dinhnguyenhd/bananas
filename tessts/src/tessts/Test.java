package tessts;

public class Test {

	String name;
	String thread;
	int x;
	static int y;
	static volatile int z;
	volatile int k;

	public Test(String name, String thread) {
		super();
		this.name = name;
		this.thread = thread;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public static int getY() {
		return y;
	}

	public static void setY(int y) {
		Test.y = y;
	}

	public static int getZ() {
		return z;
	}

	public static void setZ(int z) {
		Test.z = z;
	}

	public String getThread() {
		return thread;
	}

	public void setThread(String thread) {
		this.thread = thread;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	
}
