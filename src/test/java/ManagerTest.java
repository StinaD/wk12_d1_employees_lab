import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Steve Jobs", "ABC123", 100000.00, "IT");
    }

    @Test
    public void canGetName(){
        assertEquals("Steve Jobs", manager.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("ABC123", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(100000.00, manager.getSalary(), 0.001);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(50000.00);
        assertEquals(150000.00, manager.getSalary(), 0.001);
    }

    @Test
    public void cannotDecreaseSalary(){
        manager.raiseSalary(-30.00);
        assertEquals(100000, manager.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000.00, manager.payBonus(), 0.001);
    }

    @Test
    public void canChangeName(){
        manager.setName("Postman Pat");
        assertEquals("Postman Pat", manager.getName());
    }

    @Test
    public void cannotChangeNameToNull(){
        manager.setName(null);
        assertEquals("Steve Jobs", manager.getName());
    }
}
