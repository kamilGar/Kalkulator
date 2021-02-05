
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class kalkulatormavenTest {
    @Test
    public void ShouldDisplaySum(){
        double result= kalkulatormaven.Sum(5, 3);
        Assertions.assertEquals(result, 8);
    }
    @Test
    public void ShouldDisplaySubstraction(){
        double result=kalkulatormaven.Substraction(5, 3);
        Assertions.assertEquals(result, 2);
    }
    @Test
    public void ShouldDisplayMultiplication(){
        double result=kalkulatormaven.Multiplication(5, 3);
        Assertions.assertEquals(result, 15);
    }
    @Test
    public void ShouldDisplayDivision(){
        double result=kalkulatormaven.Division(4, 2);
        Assertions.assertEquals(result, 2);

    }

}
