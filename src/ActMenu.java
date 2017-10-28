
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.*;

public class ActMenu extends JPanel implements Serializable {
	JFrame options = new JFrame("ѡ��");

	JButton[] buttons = { new JButton("ս��"), new JButton("��ǰ��ս"), new JButton("����"), new JButton("�̵�"),
			new JButton("����"), new JButton("ѡ��") };

	JButton[] ops = { new JButton("������Ϸ"),new JButton("������Ϸ"), new JButton("��ȡ�浵"),new JButton("  ����  ")};
	
	public ActMenu() {
 
		setLayout(new FlowLayout());

		options(options);
		
		for (int index = 0; index < buttons.length; index++)
			buttons[index].addActionListener(new ActLis());

		for (int index = 0; index < buttons.length; index++)
			add(buttons[index]);

	}

	public void shutdown() {
		for (int index = 0; index < run.frames.length; index++)
			run.frames[index].setVisible(false);
	}

	private class ActLis implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttons[0]) {
				shutdown();
				run.frames[1].setVisible(true);
			} else if (e.getSource() == buttons[1]) {
				shutdown();
				run.frames[2].setVisible(true);
			} else if (e.getSource() == buttons[2]) {
				shutdown();
				run.frames[3].setVisible(true);
			} else if (e.getSource() == buttons[3]) {
				shutdown();
				run.frames[4].setVisible(true);
			} else if (e.getSource() == buttons[4]) {
				shutdown();
				run.frames[5].setVisible(true);
				
			} else if (e.getSource() == buttons[5]) {
				options.setVisible(true);

			}
		}
	}
	
	//ѡ�ť
	
	public void options(JFrame options) {
		
		JPanel[] three = new JPanel[4];
		
		options.setLayout(new GridLayout(3, 1));
		for (int index = 0; index < three.length; index++) {
			three[index] = new JPanel();
			ops[index].addActionListener(new OpLis());
			three[index].add(ops[index]);
			options.add(three[index]);
		}
		options.setPreferredSize(new Dimension(300, 200));
		run.screencentre(options);
		options.pack();
		
		
	}
	private class OpLis implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == ops[0]) {
				options.setVisible(false);
			}
			else if(e.getSource()==ops[1]){
				S_L.Save();
				JOptionPane.showMessageDialog(null, "��Ϸ�ѱ���", "����", JOptionPane.INFORMATION_MESSAGE);
				options.setVisible(false);
			}
			else if(e.getSource()==ops[2]){
				S_L.Load();
				JOptionPane.showMessageDialog(null, "�浵������", "��ȡ�浵", JOptionPane.INFORMATION_MESSAGE);
				options.setVisible(false);
			}
			else if(e.getSource()==ops[3]){
				run.begin.help.setVisible(true);
				options.setVisible(false);
			}
		}
	}
	
}