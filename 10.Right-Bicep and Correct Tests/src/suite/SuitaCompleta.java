package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import teste.TestGrupaWithFakeStudent;
import teste.TestGrupaWithStudentStub;
import teste.TesteGrupa;

@RunWith(Suite.class)
@SuiteClasses({TestGrupaWithFakeStudent.class, TestGrupaWithStudentStub.class, TesteGrupa.class})
public class SuitaCompleta {
}
