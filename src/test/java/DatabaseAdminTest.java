import Staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Alan Kay", "XXX000", 40000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Alan Kay", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("XXX000", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000.00, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(5000.00);
        assertEquals(45000.00, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400.00, databaseAdmin.payBonus(), 0.001);
    }

}

