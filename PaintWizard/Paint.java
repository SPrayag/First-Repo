package PaintWizard;

public class Paint {
	
	private String pName;
	private String pColour;
	private int pSize;
	private int pCoverage;
	private double price;
	
	
	public Paint(String pName, String pColour, int pSize, int pCoverage, double price) {
		super();
		this.pName = pName;
		this.pColour = pColour;
		this.pSize = pSize;
		this.pCoverage = pCoverage;
		this.price = price;
	}


	public String toString() {
		return "Name: " + pName + " Colour: " + pColour + " Size(Litres): " + pSize + " Coverage(m2): " + pCoverage + " Price: £" + price;
	}
	
	
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpColour() {
		return pColour;
	}
	public void setpColour(String pColour) {
		this.pColour = pColour;
	}
	public int getpSize() {
		return pSize;
	}
	public void setpSize(int pSize) {
		this.pSize = pSize;
	}
	public int getpCoverage() {
		return pCoverage;
	}
	public void setpCoverage(int pCoverage) {
		this.pCoverage = pCoverage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
	
	
	
	
	

}
