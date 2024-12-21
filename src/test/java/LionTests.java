import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import static com.example.Literals.*;

public class LionTests {

    @Test
    public void lionWrongSexTest() throws Exception {
        Feline feline = new Feline();
        try {
            Lion lion = new Lion(WRONG_SEX_VALUE, feline);
            lion.doesHaveMane();
        } catch (Exception e){
            Assert.assertEquals(WRONG_ANIMAL_SEX_ERROR, e.getMessage());
        }
    }

    @Test
    public void lionGetFoodTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(MALE_SEX_VALUE, feline);
        Assert.assertEquals(PREDATORS_FOOD, lion.getFood());
    }

    @Test
    public void lionessKittensTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(FEMALE_SEX_VALUE, feline);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void lionKittensTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(MALE_SEX_VALUE, feline);
        Assert.assertEquals(1, lion.getKittens());
    }

}
