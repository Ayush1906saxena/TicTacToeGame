import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TicListener implements ActionListener
{
    public void actionPerformed(ActionEvent evt)
    {
	JButton bc=(JButton)evt.getSource();
	Icon ic=bc.getIcon();
	if(ic!=null || Va.winnerfound)
	  return;
	if(Va.user==1)
	{
	  bc.setIcon(Va.icon1);
	  Va.msg.setText("Second player turn...");
	  Va.user=2;
	  Va.player="First";
	  FindWinner.matchIcon(Va.icon1);
	}
	else if(Va.user==2)
	{
	  bc.setIcon(Va.icon2);
	  Va.msg.setText("First player turn...");
	  Va.user=1;
	  Va.player="Second";
	  FindWinner.matchIcon(Va.icon2);
	}
	Va.count++;
	if(Va.count==9 && !Va.winnerfound)
	{
	  Va.msg.setText("Oooops It's a tie...");
	  Va.msg.setForeground(Color.red);
	}
    }  
}