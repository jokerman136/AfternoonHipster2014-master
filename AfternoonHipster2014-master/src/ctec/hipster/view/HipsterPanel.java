package ctec.hipster.view;

import java.awt.Color;

import javax.swing.*;

import ctec.hipster.controller.HipsterAppController;

public class HipsterPanel extends JPanel
{
	private HipsterAppController baseController;
	private JComboBox albumBox;
	private JLabel albumLabel;
	private JLabel hipsterImage;
	private SpringLayout baseLayout;
	
	public HipsterPanel(HipsterAppController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		albumLabel = new JLabel("Album infro here:C");
		baseLayout.putConstraint(SpringLayout.NORTH, albumLabel, 38, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, albumLabel, 108, SpringLayout.WEST, this);
		hipsterImage = new JLabel("Name");
		albumBox = new JComboBox();
		baseLayout.putConstraint(SpringLayout.SOUTH, albumBox, 0, SpringLayout.SOUTH, albumLabel);
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		
	}
	
	private void setupPanel()
	{
		this.setSize(1000,300);
		this.setBackground(Color.YELLOW);
		this.setLayout(baseLayout);
		this.add(albumBox);
		this.add(albumLabel);
		this.add(hipsterImage);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}
