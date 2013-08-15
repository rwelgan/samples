/**
 * 
 */
package com.fvsw.example.scale;

import java.util.ArrayList;

/**
 * @author rwelgan
 * 
 * A platform contains Weights that the scale can weigh.
 *
 */
public class Platform {
	
	ArrayList<Weight> contents = null;

	/**
	 * @return the contents
	 */
	public ArrayList<Weight> getContents() {
		return contents;
	}

	/**
	 * @param contents the contents to set
	 */
	public void setContents(ArrayList<Weight> contents) {
		this.contents = contents;
	}

}
