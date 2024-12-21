import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;

import static com.example.Literals.*;

public class LionAlexTests {

    @Test
    public void lionAlexWrongSexTest() throws Exception {
        Feline feline = new Feline();
        LionAlex alex = new LionAlex(WRONG_SEX_VALUE, feline);
        Assert.assertTrue(alex.doesHaveMane());
    }

    @Test
    public void lionAlexFemaleSexTest() throws Exception {
        Feline feline = new Feline();
        LionAlex alex = new LionAlex(FEMALE_SEX_VALUE, feline);
        Assert.assertTrue(alex.doesHaveMane());
    }

    @Test
    public void lionAlexGetFoodTest() throws Exception {
        Feline feline = new Feline();
        LionAlex alex = new LionAlex(MALE_SEX_VALUE, feline);
        Assert.assertEquals(PREDATORS_FOOD, alex.getFood());
    }

    @Test
    public void lionAlexGetKittensTest() throws Exception {
        Feline feline = new Feline();
        LionAlex alex = new LionAlex(MALE_SEX_VALUE, feline);
        Assert.assertEquals(0, alex.getKittens());
    }

    @Test
    public void lionAlexGetPlaceOfLivingTest() throws Exception {
        Feline feline = new Feline();
        LionAlex alex = new LionAlex(MALE_SEX_VALUE, feline);
        Assert.assertEquals(LIONS_MARTY_RESIDENCE, alex.getPlaceOfLiving());
    }

    @Test
    public void lionAlexeGetFriendsTest() throws Exception {
        Feline feline = new Feline();
        LionAlex alex = new LionAlex(MALE_SEX_VALUE, feline);
        Assert.assertEquals(LIONS_MARTY_FRIENDS, alex.getFriends());
    }
}
