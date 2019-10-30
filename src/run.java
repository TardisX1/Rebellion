import java.awt.*;
import java.io.Serializable;

import javax.swing.JFrame;

public class run implements Serializable{
	static String title = "Rebellion";
	static Beginning begin = new Beginning(title);
	static Map map = new Map(title);
	static Data data = new Data(title);
	static Base base = new Base(title);
	static Bag bag = new Bag(title);
	static Shop shop = new Shop(title);

	static JFrame[] frames = { begin,map,data,bag,shop,base};

	public static void main(String args[]) throws InterruptedException {

		for (int index = 0; index < frames.length; index++) {
			frames[index].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frames[index].setPreferredSize(new Dimension(1000,900));
            screencentre(frames[index]);

			frames[index].pack();
		}
		frames[0].setVisible(true);

	}
    //使框架显示在屏幕中央
	public static void screencentre(JFrame frame) {

		Toolkit kit = Toolkit.getDefaultToolkit(); // 定义工具包

		Dimension screenSize = kit.getScreenSize(); // 获取屏幕的尺寸

		int screenWidth = screenSize.width; // 获取屏幕的宽

		int screenHeight = screenSize.height; // 获取屏幕的高

		
		frame.setLocation(screenWidth/4, screenHeight/15);// 设置窗口居中显示
	}
}