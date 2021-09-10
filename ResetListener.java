import java.awt.event.*;
import java.awt.*;
class ResetListener implements ActionListener
{
    public void actionPerformed(ActionEvent evt)
    {
	Va.winnerfound=false;
	Va.user=1;
	Va.count=0;
	Va.msg.setText("First player turn...");
	Va.msg.setForeground(Color.blue);
	for(int i=0;i<9;i++)
	{
	  Va.bt[i].setIcon(null);
	  Va.bt[i].setBackground(Color.green);
	}
	Va.reset.setEnabled(false);
    }
}