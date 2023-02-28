package functions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@DisplayName("Test Class Additions")
class AdditionsTest {

    Additions additions;

    @BeforeEach
    public void beforeEachTestMethod(){
        additions = new Additions();
    }

   @ParameterizedTest
   @MethodSource("testIntegerAdditionsInputParametersWhenValidValuesProvidedShouldReturnExpectedResult")
   void testIntegerAddition(int x, int y, int result){
        int actualResult = additions.additionInteger(x, y);

        Assertions.assertEquals(result, actualResult,
                ()-> x + " + " + y + " did not produce " + result);
   }

   private static Stream<Arguments> testIntegerAdditionsInputParametersWhenValidValuesProvidedShouldReturnExpectedResult(){

        return Stream.of(
                Arguments.of(33, 11, 44),
                Arguments.of(100, 5, 105),
                Arguments.of(44, 80, 124)
        );
   }

    @Test
    @DisplayName("Addition Double -> 3.14 + 2.89 = 6.03")
    void testDoubleAdditionsWhenValidValuesProvidedShouldReturnExpectedResult(){
        double result = additions.additionDouble(3.14, 2.89);
        Assertions.assertEquals(6.03, result, "When we add 3.14 and 2.89, we get 6.03 :)");
    }

}