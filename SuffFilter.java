package src;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author me
 * @date 2018Äê6ÔÂ15ÈÕ  
 * @version 1.0.0 
 */
public class SuffFilter implements FilenameFilter {
	
	/* (non-Javadoc)
	 * @see java.io.FilenameFilter#accept(java.io.File, java.lang.String)
	 */
	private String suffix;
	/**
	 * @param suffFilter
	 */
	public SuffFilter(String suffix) {
		super();
		suffix = suffix;
	}
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return  name.endsWith(suffix);
	}

}
