
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import static com.example.Literals.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {

    @Spy
    Feline felineSpy;

    @Mock
    Feline felineMock;

    @Test
    public void felineEatMeatTest() throws Exception {
        felineSpy.eatMeat();
        Mockito.verify(felineSpy, Mockito.times(1)).getFood(Mockito.anyString());
    }

    @Test
    public void felineGetFoodPredatorTest() throws Exception {
        felineMock.getFood(ANIMAL_KIND_PREDATOR);
        Mockito.verify(felineMock).getFood(ANIMAL_KIND_PREDATOR);
    }

    @Test
    public void getKittensTest(){
        felineSpy.getKittens();
        Mockito.verify(felineSpy, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void getKittens2Test(){
        felineMock.getKittens();
        Mockito.lenient().when(felineMock.getKittens()).thenReturn(0);
    }

    @Test
    public void getFamilyTest(){
        felineSpy.getFamily();
        Mockito.verify(felineSpy, Mockito.times(1)).getFamily();
    }

}
