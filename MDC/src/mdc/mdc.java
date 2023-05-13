package mdc;
import java.util.Scanner;
public class mdc {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a, b, mdc, r;
	a = sc.nextInt();
	b = sc.nextInt();
	
	while (b != 0) {
		r = a%b;
		a = b;
		b = r;
	}
	mdc = a;
	System.out.println(mdc);
	}

}
