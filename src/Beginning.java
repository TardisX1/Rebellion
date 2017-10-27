import java.awt.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
//��ʼ����
public class Beginning extends JFrame {
    JPanel panel = new JPanel();
	JLabel im = new JLabel(new ImageIcon("Images/1.jpg"));
	JLabel title = new JLabel("Rebellion",JLabel.CENTER);
	JPanel[] panels = new JPanel[4];
	JButton[] buttons = {
		new JButton("��ʼ"),
		new JButton ("����"),
		new JButton("����"),
        new JButton("�˳�") };
	JFrame help = new JFrame();
	
	public Beginning(String name) {
		super(name);
		setLayout(new GridLayout(3,1));
		//��������
		title.setFont(new Font("rebellion",Font.BOLD,150) );
	    
		add(title);
		add(im);
		
		helpcre();
		
		panel.setLayout(new GridLayout(3,2));
		panel.add(new JPanel());
		panel.add(new JPanel());
		for(int index=0;index<buttons.length;index++){
			buttons[index].addActionListener(new BeginLis());
			panels[index]=new JPanel();
			panels[index].add(buttons[index]);
			panel.add(panels[index]);
		}
			
		getContentPane().add(panel);
	}
    //��������
	public void helpcre(){
		JTextArea d = new JTextArea();
    	d.setEditable(false);
		d.setOpaque(false);
		d.setLineWrap(true);
    	d.setFont(new Font("",0,25));
    	d.setText(
"һ����Ϸ����\n\n"+
"        ����Ŀ��һ���غ���RPG ��Ϸ�������˶������ǶԿ����࣬���ӳ�����԰��ʼ��һ·������Կ���������������Ѱ���¶���������壬�Ƶ����಻�ò���̸֮�У��������������˺�ƽЭ��Ĺ��¡���ҿ���ͨ��ȫ������ٿ���������Ϸ��   \n\n\n"+

"������Ϸ��������\n\n"+
"        1.��ʼ���ӵ��������ս��ɫ����ս������Area1��������غ󣬿���ƽ���ƽ�Area 2-1 2-2  2-3 �ĸ����ؿ���\n\n"+
"        2.������Area���ԵĲ�ͬ������ӵ��¶�Ա����������ʾ�����ܺ�����ڻ��ذ������������˳��\n\n"+
"        3.�ؿ���������䲻ͬƷ�ʵ�װ����Ҳ����ȥ�̵깺��������ǿ��ɫս������\n\n"+
"        4.����ȼ������ߣ�����װ��Ʒ�ʲ���п���ս��ʧ�ܣ������ظ���ս��ǰ�ؿ������ȼ�ʵ�������ܽ�Ǯ�����������ء�\n\n"+
"        5.Area 2 ȫ�������󣬽�������Area 3 �Ĺؿ���\n");
    	
    	JButton back = new JButton("����");
    	back.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
		        help.setVisible(false);
	            }
    	});
    	JPanel s = new JPanel();
    	s.add(back);
    	
    	help.setLayout(new BorderLayout());
    	help.add(d,BorderLayout.CENTER);
    	help.add(s,BorderLayout.SOUTH);
    	
    	help.setPreferredSize(new Dimension(1000,900));
        run.screencentre(help);
        help.pack();
	}
	
    private class BeginLis implements ActionListener {

	    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==buttons[0]){
            	setVisible(false);
            	run.frames[1].setVisible(true);
            }
            else if(e.getSource()==buttons[1]){
            	setVisible(false);
            	run.frames[1].setVisible(true);
            	S_L.Load();
            }
            else if(e.getSource()==buttons[2]){
                help.setVisible(true);
            }
            else if(e.getSource()==buttons[3]){
            	System.exit(0);
            }
		}

	}
}
