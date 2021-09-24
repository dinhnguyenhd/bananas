package tessts;

public class TestThread implements Runnable {

	public String thread;
	private Test t1 = new Test("Test 1", this.thread);
	private Test t2 = new Test("Test 2", this.thread);
	private Test t3 = new Test("Test 3", this.thread);

	public TestThread(String thread) {
		super();
		this.thread = thread;
	}

	public void test() {
		System.out.println(" Context :  : " + this.thread + "  name = " + t1.getName() + "  Non static x = " + t1.x++
				+ " static y = " + t1.y++ + " static volatile z = " + t1.z++  + "  volatile  "+ t1.k++);
		System.out.println(" Context :  : " + this.thread + "  name = " + t1.getName() + "  Non static x = " + t1.x++
				+ " static y  = " + t1.y++ + " static volatile z = " + t1.z++  + "  volatile  "+ t1.k++);
		System.out.println(" Context :  : " + this.thread + "  name = " + t1.getName() + "  Non static x = " + t1.x++
				+ " static y  = " + t1.y++ + " static volatile z = " + t1.z++  + "  volatile  "+ t1.k++);

		System.out.println(" Context :  : " + this.thread + "  name = " + t2.getName() + "  Non static x  = " + t2.x++
				+ " static y  = " + t2.y++ + " static volatile z = " + t2.z++  + "  volatile  "+ t1.k++);
		System.out.println(" Context :  : " + this.thread + "  name = " + t2.getName() + "  Non static x  = " + t2.x++
				+ " static y  = " + t2.y++ + " static volatile z = " + t2.z++  + "  volatile  "+ t1.k++);

		System.out.println(" Context :  : " + this.thread + "  name = " + t2.getName() + "  Non static x  = " + t2.x++
				+ " static y  = " + t2.y++ + " static volatile z = " + t2.z++  + "  volatile  "+ t1.k++);

		System.out.println(" Context :  : " + this.thread + "  name = " + t3.getName() + "  Non static x  = " + t3.x++
				+ " static y  = " + t3.y++ + " static volatile z = " + t3.z++  + "  volatile  "+ t1.k++);
		System.out.println(" Context :  : " + this.thread + "  name = " + t3.getName() + "  Non static x  = " + t3.x++
				+ " static y  = " + t3.y++ + " static volatile z = " + t3.z++  + "  volatile  "+ t1.k++);

		System.out.println(" Context :  : " + this.thread + "  name = " + t3.getName() + "  Non static x  = " + t3.x++
				+ " static y  = " + t3.y++ + " static volatile z = " + t3.z++  + "  volatile  "+ t1.k++);

		System.out.println(
				" ____________________________________________________________________________________________________________ ");
	}

	@Override
	public void run() {
		test();
	}

	public String getThread() {
		return thread;
	}

	public void setThread(String thread) {
		this.thread = thread;
	}

	public Test getT1() {
		return t1;
	}

	public void setT1(Test t1) {
		this.t1 = t1;
	}

	public Test getT2() {
		return t2;
	}

	public void setT2(Test t2) {
		this.t2 = t2;
	}

}
