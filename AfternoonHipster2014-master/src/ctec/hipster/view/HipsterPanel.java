package ctec.hipster.view;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

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
		hipsterImage = new JLabel("Ricky selfie", new ImageIcon(HipsterPanel.class.getResource("/ctec/hipster/view/image/Untitled.png")), JLabel.CENTER);
		albumBox = new JComboBox();
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		albumBox.setModel(new DefaultComboBoxModel(baseController.getSelfHipster().getHipsterAlbums()));
	}
	
	private void setupPanel()
	{
		this.setSize(1000,300);
		this.setBackground(Color.BLUE);
		this.setLayout(baseLayout);
		this.add(albumBox);
		this.add(albumLabel);
		this.add(hipsterImage);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, albumLabel, 38, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, albumLabel, 108, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, hipsterImage, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, hipsterImage, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, albumBox, -3, SpringLayout.NORTH, albumLabel);
		baseLayout.putConstraint(SpringLayout.EAST, albumBox, -334, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		albumBox.addItemListener(new ItemListener()
		{

			@Override
			public void itemStateChanged(ItemEvent selected)
			{
				if(albumBox.getSelectedIndex() == 0)
				{
					albumLabel.setText("The hipster gods praise you");
				}
				else if(albumBox.getSelectedIndex() <= 2)
				{
					albumLabel.setText("You are somewhat of a hipster");
				}
				else
				{
					albumLabel.setText("THOU ART NOT A HIPSTER");
				}
			}
			
		});
	}

}
