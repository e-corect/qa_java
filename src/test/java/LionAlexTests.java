import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.Literals.*;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTests {

    @Mock
    private Feline feline;

    @Test
    public void lionAlexWrongSexTest() throws Exception {
        LionAlex alex = new LionAlex(WRONG_SEX_VALUE, feline);
        Assert.assertTrue(alex.doesHaveMane());
    }

    @Test
    public void lionAlexFemaleSexTest() throws Exception {
        LionAlex alex = new LionAlex(FEMALE_SEX_VALUE, feline);
        Assert.assertTrue(alex.doesHaveMane());
    }

    @Test
    public void lionAlexGetFoodTest() throws Exception {
        LionAlex alex = new LionAlex(MALE_SEX_VALUE, feline);
        Mockito.when(feline.getFood(ANIMAL_KIND_PREDATOR)).thenReturn(PREDATORS_FOOD);
        Assert.assertEquals(PREDATORS_FOOD, alex.getFood());
    }

    @Test
    public void lionAlexGetKittensTest() throws Exception {
        LionAlex alex = new LionAlex(MALE_SEX_VALUE, feline);
        Assert.assertEquals(0, alex.getKittens());
    }

    @Test
    public void lionAlexGetPlaceOfLivingTest() throws Exception {
        LionAlex alex = new LionAlex(MALE_SEX_VALUE, feline);
        Assert.assertEquals(LIONS_MARTY_RESIDENCE, alex.getPlaceOfLiving());
    }

    @Test
    public void lionAlexeGetFriendsTest() throws Exception {
        LionAlex alex = new LionAlex(MALE_SEX_VALUE, feline);
        Assert.assertEquals(LIONS_MARTY_FRIENDS, alex.getFriends());
    }
}
