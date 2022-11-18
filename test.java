import java.awt.Color;
import static org.junit.Assert.*;
import org.junit.*;

public class test {

    @Test
    public void Saabs_color(){
        // assign
        var Car1 = new Saab95();
        
        assertEquals(Color.red, Car1.getColor());

    }

    @Test
    public void Volvos_color(){

        var Car2 = new Volvo240();

        assertEquals(Color.black, Car2.getColor());
    }

    @Test
    public void the_number_of_doors(){
        var Car1 = new Saab95();

        assertEquals(2, Saab95.nrDoors);
    }

}
