package edu.uark.util;

import java.io.*;
import java.util.*;

import org.apache.commons.lang.Validate;
import org.apache.commons.io.IOUtils;

/**
 * Utility methods to related to ClassLoader.getResourceAsStream()
 * @author Michael Akerman
 */
public final class ResourceUtils
{
	private ResourceUtils () {}

	/** 
	 * @return the contents of the file if present, new byte [] {} if empty, null if missing 
	 * You should Validate.notEmpty the return value if you require contents
	 */
	public static byte [] toByteArray ( final String resourceName ) throws IOException
	{
		Validate.notEmpty( resourceName );

		final InputStream is = ResourceUtils.class.getClassLoader().getResourceAsStream( resourceName );
		try
		{
			return InputStreamUtils.toByteArray( is );
		}
		finally
		{
			is.close();
		}
	}

	/** 
	 * @return the contents of the file if present, "" if empty, null if missing 
	 * You should Validate.notEmpty the return value if you require contents
	 */
	public static String toString ( final String resourceName ) throws IOException
	{
		Validate.notEmpty( resourceName );

		final InputStream is = ResourceUtils.class.getClassLoader().getResourceAsStream( resourceName );
		try
		{
			return InputStreamUtils.toString( is );
		}
		finally 
		{
			is.close();
		}
	}

	/** 
	 * @return the contents of the file if present, new Properties() if empty, null if missing 
	 * You should Validate.notEmpty the return value if you require contents
	 */
	public static Properties toProperties ( final String resourceName ) throws IOException
	{
		Validate.notEmpty( resourceName );

		final InputStream is = ResourceUtils.class.getClassLoader().getResourceAsStream( resourceName );
		try
		{
			return InputStreamUtils.toProperties( is );
		}
		finally 
		{
			is.close();
		}
	}
	
	/** 
	 * @return the contents of the file if present, new HashMap() if empty, null if missing 
	 * You should Validate.notEmpty the return value if you require contents
	 */
	public static Map<String,String> toMap ( final String resourceName ) throws IOException
	{
		Validate.notEmpty( resourceName );

		final InputStream is = ResourceUtils.class.getClassLoader().getResourceAsStream( resourceName );
		try
		{
			return InputStreamUtils.toMap( is );
		}
		finally 
		{
			is.close();
		}
	}
	
	/** 
	 * @return the contents of the file if present, new List() if empty, null if missing 
	 * You should Validate.notEmpty the return value if you require contents
	 */
	public static List<String> toList ( final String resourceName, final String delimiter ) throws IOException
	{
		Validate.notEmpty( resourceName );

		final InputStream is = ResourceUtils.class.getClassLoader().getResourceAsStream( resourceName );
		try
		{
			return InputStreamUtils.toList( is, delimiter );
		}
		finally 
		{
			is.close();
		}
	}
}
