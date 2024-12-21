import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import static com.example.Literals.*;


public class CatTests {

    @Test
    public void catVoiceTest(){
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        Assert.assertEquals(CATS_VOICE_VALUE, cat.getSound());
    }

    @Test
    public void feetCatTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        Assert.assertEquals(PREDATORS_FOOD, cat.getFood());
    }

}
