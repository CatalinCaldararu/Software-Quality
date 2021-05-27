package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;

public class TesteGrupa {
	private Grupa grupa;
	
	@Before
	public void Setup()
	{
		grupa = new Grupa(1077);
		for(int i=0;i<10;i++)
		{
			Student student1 = new Student("Marcel");
			student1.adaugaNota(5);
			student1.adaugaNota(10);
			student1.adaugaNota(4);
			grupa.adaugaStudent(student1);
		}
	}
	
	@Test
	public void testGetPromovabilitateRight()
	{
		Student studentMarcel = new Student("Marcel");
		studentMarcel.adaugaNota(10);
		studentMarcel.adaugaNota(10);
		
		Student studentMaria = new Student("Maria");
		studentMaria.adaugaNota(10);
		studentMaria.adaugaNota(10);
		
		grupa.adaugaStudent(studentMarcel);
		grupa.adaugaStudent(studentMaria);
		assertEquals(0.16,grupa.getPromovabilitate(), 0.05);
	}
	
	@Test
	public void testGetPromovabilitateLowerBoundary()
	{
		assertEquals(0, grupa.getPromovabilitate(), 0.05);
	}
	
	@Test
	public void testGetPromovabilitateUpperBoundary()
	{
		Grupa grupaNoua = new Grupa(1076);
		Student student1 = new Student("Ion");
		student1.adaugaNota(10);
		student1.adaugaNota(10);
		
		Student student2 = new Student("Ana");
		student2.adaugaNota(10);
		student2.adaugaNota(10);
		
		grupaNoua.adaugaStudent(student1);
		grupaNoua.adaugaStudent(student2);
		
		assertEquals(1, grupaNoua.getPromovabilitate(),0.05);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetPromovabilitateError()
	{
		Grupa grupaNoua = new Grupa(1080);
		grupaNoua.getPromovabilitate();
	}
	
	@Test(timeout =500)
	public void testGetPromovabilitatePerformance()
	{
		grupa.getPromovabilitate();
	}
	
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
