package Sample.Project;

public class App {
	public static void main(String args[]) throws Exception {
		String sentance = "kavindjnfkjnKavinbfjnfKavinbdojewkavin".toLowerCase();
		int count = 0;
		for (int a = 0; a <= sentance.length() - 1; a++) {
			if (sentance.substring(a).startsWith("kavin")) {
				count++;
			}
		}
		System.out.println(count);
	}
}
