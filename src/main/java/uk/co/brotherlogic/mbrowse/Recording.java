package uk.co.brotherlogic.mbrowse;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

/**
 * Class that represents playable content within the browser
 * 
 * @author simon
 * 
 */
public class Recording
{
	/** The artist that made the recording */
	private final String artist;

	/** The title of the recording */
	private final String title;

	/** An image (square) that represents the recording */
	private Image artwork;

	/**
	 * Constructor
	 * 
	 * @param art
	 *            The artist that made this recording
	 * @param tit
	 *            The title of the recording
	 */
	public Recording(final String art, final String tit)
	{
		artist = art;
		title = tit;
	}

	public void setArtword(File f) throws IOException
	{

	}
}
