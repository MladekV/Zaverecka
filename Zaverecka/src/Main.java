import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Zadejte celkové napìtí zdroje v obvodu");
		int napeti = s.nextInt();
		System.out.println("Zadejte odpor rezistoru 1 ");
		int odpor1 = s.nextInt();
		System.out.println("Zadejte odpor rezistoru 2 ");
		int odpor2 = s.nextInt();
		System.out.println("Zadejte odpor rezistoru 3 ");
		int odpor3 = s.nextInt();
		System.out.println("Zadejte odpor rezistoru 4 ");
		int odpor4 = s.nextInt();
		System.out.println("Zadejte odpor rezistoru 5 ");
		int odpor5 = s.nextInt();
		System.out.println("Zadejte odpor rezistoru 6 ");
		int odpor6 = s.nextInt();
		boolean zapojeni1 = true;
		boolean zapojeni2 = true;
		boolean zapojeni3 = true;
		String odpoved = null;
		System.out.println("Rezistor 1 a Rezistor 2 jsou zapojeny (P/S) ");
		odpoved = s.next();
		if (odpoved.equals("P")) {
			zapojeni1 = true;
		}
		if (odpoved.equals("S")) {
			zapojeni1 = false;
		}
		System.out.println("Rezistor 3 a Rezistor 4 jsou zapojeny (P/S) ");
		odpoved = s.next();
		if (odpoved.equals("P")) {
			zapojeni2 = true;
		}
		if (odpoved.equals("S")) {
			zapojeni2 = false;
		}
		System.out.println("Rezistor 5 a Rezistor 6 jsou zapojeny (P/S) ");
		odpoved = s.next();
		if (odpoved.equals("P")) {
			zapojeni3 = true;
		}
		if (odpoved.equals("S")) {
			zapojeni3 = false;
		}
		double proud1 = 0;
		if (zapojeni1 == true) {
			proud1 = napeti / ((odpor1 * odpor2) / (odpor1 + odpor2));
		} else {
			proud1 = napeti / (odpor1 + odpor2);
		}
		System.out.println("I1,2 = " + proud1);
		double proud2 = 0;
		if (zapojeni2 == true) {
			System.out.println(odpor3 + " " + odpor4);
			proud2 = napeti / ((odpor3 * odpor4) / (odpor3 + odpor4));
		} else {
			proud2 = napeti / (odpor3 + odpor4);
		}
		System.out.println("I3,4 = " + proud2);
		double proud3 = 0;
		if (zapojeni3 == true) {
			proud3 = napeti / ((odpor5 * odpor6) / (odpor5 + odpor6));
		} else {
			proud3 = napeti / (odpor5 + odpor6);
		}
		System.out.println("I5,6 = " + proud3);

		boolean zapojeni4 = true;
		boolean zapojeni5 = true;
		System.out.println("Rezistory1,2 a Rezistory 3,4 jsou zapojeny (P/S) ");
		odpoved = s.next();
		if (odpoved.equals("P")) {
			zapojeni4 = true;
		}
		if (odpoved.equals("S")) {
			zapojeni4 = false;
		}
		System.out.println("Rezistory3,4 a Rezistory 5,6 jsou zapojeny (P/S) ");
		odpoved = s.next();
		if (odpoved.equals("P")) {
			zapojeni5 = true;
		}
		if (odpoved.equals("S")) {
			zapojeni5 = false;
		}
		double proud4 = 0;
		if (zapojeni4 == true) {
			proud4 = proud1 + proud2;
		} else {
			proud4 = proud1;
		}
		System.out.println("I1,2,3,4 = " + proud4);
		double proud5 = 0;
		if (zapojeni5 == true) {
			proud5 = proud4 + proud3;
		} else {
			proud5 = proud1;
		}
		System.out.println("IC = " + proud5);
		s.close();
	}

}