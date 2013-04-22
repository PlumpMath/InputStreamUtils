package edu.uark.util;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.junit.Test;
import static org.junit.Assert.*;

public class ResourceUtilsTest
{
	@Test
	public void testToString () throws IOException
	{
		assertTrue ( ResourceUtils.toString ( "fake.txt" ) == null );

		final String value = ResourceUtils.toString( "test.properties" );
		assertFalse( value.isEmpty() );
		assertTrue( value.length() == 28 );
	}

	@Test
	public void testToByteArray () throws IOException
	{
		assertTrue( ResourceUtils.toByteArray( "fake.txt" ) == null );

		final byte[] value = ResourceUtils.toByteArray( "test.properties" );
		assertTrue( value != null );
		assertTrue( value.length == 28 );
	}

	@Test
	public void testToProperties () throws IOException
	{
		assertTrue( ResourceUtils.toProperties( "fake.txt" ) == null );

		final Properties p = ResourceUtils.toProperties( "test.properties" );
		assertFalse( p.isEmpty() );
		assertTrue( p.size() == 2 );
		assertTrue( p.getProperty("mike").equals( "5-2467" ) );
	}

	@Test
	public void testToMap () throws IOException
	{
		assertTrue( ResourceUtils.toMap( "fake.txt" ) == null );

		final Map<String, String> m = ResourceUtils.toMap( "test.properties" );
		assertFalse( m.isEmpty() );
		assertTrue( m.size() == 2 );
		assertTrue( m.get("mike").equals( "5-2467" ) );
	}

	@Test
	public void testToList () throws IOException
	{
		assertTrue( ResourceUtils.toList( "fake.txt", "\n" ) == null );

		final List<String> value = ResourceUtils.toList( "test.properties", "\n" );
		assertFalse( value.isEmpty() );
		assertTrue( value.size() == 2 );
	}

}
