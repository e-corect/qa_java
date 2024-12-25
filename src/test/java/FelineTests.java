
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static com.example.Literals.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {

    @Spy
    Feline felineSpy;

    @Mock
    Feline felineMock;

    @Test
    public void felineEatMeatDefaultValueTest() throws Exception {
        List<String> meat = new ArrayList<>();
        Assert.assertEquals(meat, felineMock.eatMeat());
    }

    @Test
    public void felinePredatorEatMeatTest() throws Exception {
        felineSpy.eatMeat();
        Mockito.verify(felineSpy, Mockito.times(1)).eatMeat();
        Assert.assertEquals(PREDATORS_FOOD, felineSpy.eatMeat());
    }

    @Test
    public void felineGetFoodPredatorTest() throws Exception {
        Mockito.when(felineMock.getFood(ANIMAL_KIND_PREDATOR)).thenReturn(PREDATORS_FOOD);
        Assert.assertEquals(PREDATORS_FOOD, felineMock.getFood(ANIMAL_KIND_PREDATOR));
    }

    @Test
    public void getKittensTest(){
        felineSpy.getKittens();
        Mockito.verify(felineSpy, Mockito.times(1)).getKittens(1);
        Assert.assertEquals(1, felineSpy.getKittens());
    }

    @Test
    public void getKittens2Test(){
        Mockito.lenient().when(felineMock.getKittens()).thenReturn(0);
        Assert.assertEquals(0, felineMock.getKittens());
    }

    @Test
    public void getFamilyTest(){
        Mockito.lenient().when(felineMock.getFamily()).thenReturn(ANIMAL_FAMILY_VALUE);
        Assert.assertEquals(ANIMAL_FAMILY_VALUE, felineSpy.getFamily());
    }

}
