import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.Literals.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {
    @Mock
    private Feline feline;

    @Test
    public void catVoiceTest(){
        Cat cat = new Cat(feline);
        Assert.assertEquals(CATS_VOICE_VALUE, cat.getSound());
    }

    @Test
    public void feetCatTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(cat.getFood()).thenReturn(PREDATORS_FOOD);
        Assert.assertEquals(PREDATORS_FOOD, cat.getFood());
    }

}
