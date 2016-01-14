package gui.view;

import gui.Controller.Controller;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Panel extends JPanel
{
private SpringLayout baseLayout;	
private Controller baseController;

public Panel(Controller baseController)
{
this.baseController = baseController;
baseLayout = new SpringLayout();

setupPanel();
setupLayout();
setupListeners();

}

private void setupPanel()
{
	this.setLayout(baseLayout);
	
}
private void setupLayout()
{
	
}

private void setupListeners()
{
	
}

}
