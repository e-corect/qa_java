import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static com.example.Literals.*;

@RunWith(Parameterized.class)
public class LionManeParametrizedTest {

    private final String lionsSex;
    private final boolean expectedValue;
    @Mock
    private Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

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
        Lion lion = new Lion(lionsSex, feline);
        Assert.assertEquals(expectedValue, lion.doesHaveMane());

    }

}
