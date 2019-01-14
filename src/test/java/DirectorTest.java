import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Bill Gates", "PPP111", 250000.00, "Board", 20.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Bill Gates", director.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("PPP111", director.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(250000.00, director.getSalary(), 0.001);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Board", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(50000.00);
        assertEquals(300000.00, director.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus(){
        assertEquals(5000.00, director.payBonus(), 0.001);
    }

    @Test
    public void canGetBudget(){
        assertEquals(20.00, director.getBudget(), 0.001);
    }

}
