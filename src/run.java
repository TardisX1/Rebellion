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
    //ʹ�����ʾ����Ļ����
	public static void screencentre(JFrame frame) {

		Toolkit kit = Toolkit.getDefaultToolkit(); // ���幤�߰�

		Dimension screenSize = kit.getScreenSize(); // ��ȡ��Ļ�ĳߴ�

		int screenWidth = screenSize.width; // ��ȡ��Ļ�Ŀ�

		int screenHeight = screenSize.height; // ��ȡ��Ļ�ĸ�

		
		frame.setLocation(screenWidth/4, screenHeight/15);// ���ô��ھ�����ʾ
	}
}