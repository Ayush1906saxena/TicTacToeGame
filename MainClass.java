import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MainClass extends JFrame
{
  JLabel bg=new JLabel(new ImageIcon(getClass().getResource("images/t2.jpg")));
  JPanel []pa=new JPanel[3];
  public MainClass()
  {
	super("Tic Tac Toe");
 	Va.icon1=new ImageIcon(getClass().getResource("images/user2.png"));
 	Va.icon2=new ImageIcon(getClass().getResource("images/user1.png"));
 	setSize(600,640);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setResizable(false);
	add(bg);
	addPanels();
	setVisible(true);
  }
  private void addPanels()
  {
	for(int i=0;i<3;i++)
	{
	  pa[i]=new JPanel();
	  bg.add(pa[i]);
	}
	pa[0].setBounds(100,30,400,40);
	pa[1].setBounds(100,100,400,400);
	pa[2].setBounds(100,530,400,40);
	addInfo();
	addButtons();
  }
  private void addInfo()
  {
	pa[0].add(Va.msg);
	Va.msg.setFont(new Font("elephant",Font.PLAIN,25));
	Va.msg.setForeground(Color.blue);
	pa[2].add(Va.reset);
	Va.reset.addActionListener(new ResetListener());
	pa[2].setOpaque(false);
	Va.reset.setFont(new Font("arial",Font.PLAIN,20));
	Va.reset.setEnabled(false);
  }
  private void addButtons()
  {
	pa[1].setBorder(BorderFactory.createLineBorder(Color.green,4));
	pa[1].setLayout(new GridLayout(3,3));     	
	javax.swing.border.Border b=BorderFactory.createLineBorder(Color.green,2);
	TicListener listener=new TicListener();
	for(int i=0;i<9;i++)
	{
	  Va.bt[i]=new JButton();
	  Va.bt[i].addActionListener(listener);
	  Va.bt[i].setBorder(b);
	  Va.bt[i].setBackground(Color.blue);
	  pa[1].add(Va.bt[i]);
	}
  }
  public static void main(String []abc)
  {
	setDefaultLookAndFeelDecorated(true);
	new MainClass();
  }
}