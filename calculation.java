import java.awt.Color;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class calculation extends Thread{
	JLabel[][] cell = new JLabel[4][4];
	int[][] board =new int[4][4];
	Queue<Integer> qe = new LinkedList<Integer>();
	int var1,var2,var3;
	public void run()
	{
	while(true)
	{
	if(qe.isEmpty()==false)
	{
		if(qe.peek()==-1)
		{
			JOptionPane.showMessageDialog(null, "Done");
			return;
		}
		if(qe.peek()==10)
		{
			JOptionPane.showMessageDialog(null, "Solution Found !");
			qe.poll();
		}
		var1=qe.peek();
		qe.poll();
		var2=qe.peek();
		qe.poll();
		var3=qe.peek();
		qe.poll();
		if(var3==0)
		{
			cell[var1][var2].setBackground(Color.RED);
			//cell[var1][var2].setIcon(null);
		}
		else if(var3==1)
		{
			cell[var1][var2].setBackground(Color.GREEN);
			cell[var1][var2].setIcon(new ImageIcon("/home/brijesh/Desktop/queen-resized.png"));
		}
		else if(var3==2)
		{
			cell[var1][var2].setBackground(null);
			cell[var1][var2].setIcon(null);
		}
		}
	try {
		sleep(50);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}
}
