package ctec.hipster.controller;

import ctec.hipster.model.Hipster;
import ctec.hipster.view.HipsterFrame;
/**
 *  HipsterAppController for the 2014 Hipster day project
 * @author CodyH
 * @version 1.0 11/12/14 Basic framework only
 */
public class HipsterAppController
{
	private HipsterFrame baseFrame;
	private Hipster selfHipster;
	private String [] myAlbums;
	
	public HipsterAppController()
	{
		selfHipster = new Hipster("Richard", 16);
		buildAlbumArray();
		baseFrame = new HipsterFrame(this);
	}
	
	public void start()
	{
		
	}
	
	private void buildAlbumArray()
	{
		//big, can add things as you go.
		
		String [] myAlbums = new String[4];
		myAlbums[0] = "Greenday";
		myAlbums[1] = "Modest Mouse: used to be hipster";
		myAlbums[2] = "Blink 182 - Not hipster";
		myAlbums[3] = "Britney Spears: Could not be hipster";
		selfHipster.setHipsterAlbums(myAlbums);
		
		//hipster
		//only one line
		// only used at one point one time
		String [] otherAlbums = {"stuff","other", "way for", "hipster array"};
		
		//ultra hipster
		//dynaic
		String [] weirdAlbums;
		
		weirdAlbums = new String [] {"weird", "sad", "sda", "dahadh"};
	}
	
	public Hipster getSelfHipster()
	{
		return selfHipster;
	}
	
}
