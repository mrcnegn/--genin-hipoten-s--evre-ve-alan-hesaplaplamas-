import java.util.Scanner;
public class ��genalan�hesaplayanprogram {

	public static void main(String[] args) {
		
		int a,b;
		double c,�evre,alan;
	
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("birinci kenar� giriniz");
		a =input.nextInt();
		
		System.out.printf("ikinci kenar� giriniz");
		b =input.nextInt();
		
		
		c =Math.sqrt ((a*a) + (b*b));
		
		System.out.println("hipoten�s: " + c);

		�evre= a + b +c ;
		
		alan= (a*b)/2;
		
		System.out.println("��genin �evresi: " + �evre );
		System.out.println("��genin alan�: " + alan );
		
		
		
	}

}
