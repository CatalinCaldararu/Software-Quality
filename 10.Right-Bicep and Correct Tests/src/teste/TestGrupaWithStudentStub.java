package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import clase.IStudent;
import dubluri.StudentStub;

public class TestGrupaWithStudentStub {

	
	@Test
	public void testGetPromovabilitateGrupa() {
		Grupa grupa1=  new Grupa(1077);
		IStudent student1 = new StudentStub();
		IStudent student2 = new StudentStub();
		IStudent student3 = new StudentStub();
		
		grupa1.adaugaStudent(student1);
		grupa1.adaugaStudent(student2);
		grupa1.adaugaStudent(student3);
		assertEquals(1, grupa1.getPromovabilitate(),0.001);
	}
}
