package Chapter7;

import javax.swing.ImageIcon;

public class CIRCLE implements SHAPE {

	@Override
	public ImageIcon draw() {
		// TODO Auto-generated method stub
		ImageIcon img = new ImageIcon("./src/Chapter7/Circle.png");
		return img;
	}
}
