package j100_Date_Time;

public class _11_CurrentTimeMillis3 {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		for (int i = 0; i < 100000; System.out.println(i++));

		long finish = System.currentTimeMillis();

		System.out.print("Passed time (mili sec)  :  " + (finish - start));

	}

}
