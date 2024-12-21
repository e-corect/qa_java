import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static com.example.Literals.*;

@RunWith(Parameterized.class)
public class LionManeParametrizedTest {

    private final String lionsSex;
    private final boolean expectedValue;

    public LionManeParametrizedTest(String lionsSex, boolean expectedValue) {
        this.lionsSex = lionsSex;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {MALE_SEX_VALUE, true},
                {FEMALE_SEX_VALUE, false}
        };
    }

    @Test
    public void lionHasManeTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(lionsSex, feline);
        Assert.assertEquals(expectedValue, lion.doesHaveMane());

    }

}
