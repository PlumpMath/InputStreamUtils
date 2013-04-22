package edu.uark.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;

public class FileUtilsTest
{
	@Test( expected = FileNotFoundException.class )
	public void testToString () throws IOException
	{
		FileUtils.toString( "fake.txt" );
	}

	@Test( expected = FileNotFoundException.class )
	public void testToByteArray () throws IOException
	{
		FileUtils.toByteArray( "fake.txt" );
	}

	@Test( expected = FileNotFoundException.class )
	public void testToProperties () throws IOException
	{
		FileUtils.toProperties( "fake.txt" );
	}

	@Test( expected = FileNotFoundException.class )
	public void testToMap () throws IOException
	{
		FileUtils.toMap( "fake.txt" );
	}

	@Test( expected = FileNotFoundException.class )
	public void testToList () throws IOException
	{
		FileUtils.toList( "fake.txt", "\n" );
	}
}
