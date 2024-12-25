import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.Literals.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {

    @Mock
    private Feline feline;

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Test
    public void lionWrongSexTest() {
        try {
            Lion lion = new Lion(WRONG_SEX_VALUE, feline);
            lion.doesHaveMane();
        } catch (Exception e) {
            Assert.assertEquals(WRONG_ANIMAL_SEX_ERROR, e.getMessage());
        }
    }

    @Test
    public void lionWrongSexSecondWayTest() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(WRONG_ANIMAL_SEX_ERROR);
        throw new IllegalArgumentException(WRONG_ANIMAL_SEX_ERROR, new IllegalArgumentException());
    }

    @Test
    public void lionGetFoodTest() throws Exception {
        Lion lion = new Lion(MALE_SEX_VALUE, feline);
        Mockito.when(feline.getFood(ANIMAL_KIND_PREDATOR)).thenReturn(PREDATORS_FOOD);
        Assert.assertEquals(PREDATORS_FOOD, lion.getFood());
    }

    @Test
    public void lionessKittensTest() throws Exception {
        Lion lion = new Lion(FEMALE_SEX_VALUE, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void lionKittensTest() throws Exception {
        Lion lion = new Lion(MALE_SEX_VALUE, feline);
        Assert.assertEquals(0, lion.getKittens());
    }

}
