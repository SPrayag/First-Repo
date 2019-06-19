package PaintWizard;

public class PaintApp {

	public static void main(String[] args) { 
		//name colour size coverage price
		Paint paint1 = new Paint("CheapoMax", "Green", 21, 10, 19.99);
		Paint paint2 = new Paint("ThatOneWithTheDog", "Blue", 40, 12, 34.38);
		Paint paint3 = new Paint("AverageJoes", "Indigo", 16, 11, 17.99);
		Paint paint4 = new Paint("DuluxourousPaints", "Yellow", 10, 22, 25.00);
		
		System.out.println(paint1);
		System.out.println(paint2);
		System.out.println(paint3);
		System.out.println(paint4);

	}

}
