import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Andy Rubin", "XYZ999", 50000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Andy Rubin", developer.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("XYZ999", developer.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(50000.00, developer.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(50000.00);
        assertEquals(100000.00, developer.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus(){
        assertEquals(500.00, developer.payBonus(), 0.001);
    }
}
