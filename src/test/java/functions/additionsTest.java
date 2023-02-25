package functions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class additionsTest {

    Additions additions;

    @Test
    public void testIntegerAdditionsWhenValidValuesProvidedShouldReturnExpectedResult(){
        additions = new Additions();
        int result = additions.additionInteger(10, 20);
        Assertions.assertEquals(30, result, "When we add 10 and 20, we get 30 :)");
    }

    @Test
    public void testDoubleAdditionsWhenValidValuesProvidedShouldReturnExpectedResult(){
        additions = new Additions();
        double result = additions.additionDouble(3.14, 2.89);
        Assertions.assertEquals(6.03, result, "When we add 3.14 and 2.89, we get 6.03 :)");
    }

}