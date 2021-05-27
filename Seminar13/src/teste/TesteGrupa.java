package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;

public class TesteGrupa {

	@Test
	public void testConstructorRight()
	{
		Grupa grupa = new Grupa(1077);
		assertEquals(1077, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLowerBoundary()
	{
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorUpperBoundary()
	{
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorMaiMic()
	{
		Grupa grupa = new Grupa(100);
		assertEquals(100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorMaiMare()
	{
		Grupa grupa = new Grupa(1101);
		assertEquals(1101, grupa.getNrGrupa());
	}
	
	@Test(timeout =500)
	public void testConstructorPerformance()
	{
		Grupa grupa = new Grupa(1077);
	}
	
	@Test
	public void testConstructorExistence()
	{
		Grupa grupa = new Grupa(1077);
		assertNotNull(grupa.getStudenti());
	}
}
