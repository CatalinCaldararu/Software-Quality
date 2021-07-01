package suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import categorii.TesteGetPromovabilitate;
import categorii.TesteNormale;
import teste.TestGrupaWithFakeStudent;
import teste.TestGrupaWithStudentStub;
import teste.TesteGrupa;

@RunWith(Categories.class)
@SuiteClasses({TesteGrupa.class, TestGrupaWithFakeStudent.class, TestGrupaWithStudentStub.class, SuitaCompleta.class})
@IncludeCategory({TesteGetPromovabilitate.class})
@ExcludeCategory({TesteNormale.class})
public class SuitaCustom {
}
