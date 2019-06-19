package PaintWizard;

import java.util.ArrayList;
import java.util.List;


public class PaintShop {

	// list of paint - arrays:
	private List<Paint> paints = new ArrayList<>();
	
	public boolean addPaint(Paint paint) {
		return this.paints.add(paint);
	}
	
	public boolean removePaint(Paint paint) {
		return this.paints.remove(paint);
	}

}
