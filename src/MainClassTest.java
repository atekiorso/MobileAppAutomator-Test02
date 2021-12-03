import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainClassTest extends MainClass {
    private int actualClassNumber;

    @Before
    public void getActualClassNumber() {
        actualClassNumber = getClassNumber();
    }

    @Test
    public void testGetClassNumber() {
        final int classNumberMustBeGreaterThan = 45;
        final String errorMessage = String.format("Результат функции MainClass.getClassNumber() = %1$d не больше заданного значения = %2$d.",
                actualClassNumber, classNumberMustBeGreaterThan);
        
        Assert.assertTrue(errorMessage, actualClassNumber > classNumberMustBeGreaterThan);
    }
}
