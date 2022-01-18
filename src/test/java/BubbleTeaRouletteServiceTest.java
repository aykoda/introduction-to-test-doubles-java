import com.techreturners.bubbleteaordersystem.service.BubbleTeaRouletteService;
import com.techreturners.bubbleteaordersystem.model.BubbleTeaTypeEnum;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import testhelper.RandomStub;

import static org.junit.Assert.assertEquals;

public class BubbleTeaRouletteServiceTest {

    @Test
    public void shouldGenerateARandomBubbleTeaTypeWhenGetRandomBubbleTeaTypeIsCalled() {

        //Arrange
        RandomStub randomStub = new RandomStub(BubbleTeaTypeEnum.JasmineMilkTea.ordinal());
        BubbleTeaRouletteService bubbleTeaRouletteService = new BubbleTeaRouletteService(randomStub);

        //Act
        var actualResult = bubbleTeaRouletteService.getRandomBubbleTeaType();
        var expectedResult = BubbleTeaTypeEnum.JasmineMilkTea;

        //Assert
        assertEquals(expectedResult, actualResult);

    }
    @Test
    public void shouldGenerateARandomBubbleTeaTypePeachIceTeaWhenGetRandomBubbleTeaTypeIsCalled() {

        //Arrange
        RandomStub randomStub = new RandomStub(BubbleTeaTypeEnum.PeachIceTea.ordinal());
        BubbleTeaRouletteService bubbleTeaRouletteService = new BubbleTeaRouletteService(randomStub);

        //Act
        var actualResult = bubbleTeaRouletteService.getRandomBubbleTeaType();
        var expectedResult = BubbleTeaTypeEnum.PeachIceTea;

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @ParameterizedTest
    @ValueSource(ints = {0,1,2,3,4})
    public void shouldGenerateARandomBubbleTeaTypeByParameters(int BubbleTeaTypeEnumParam) {

        //Arrange
        RandomStub randomStub = new RandomStub(BubbleTeaTypeEnumParam);
        BubbleTeaRouletteService bubbleTeaRouletteService = new BubbleTeaRouletteService(randomStub);

        //Act
        var actualResult = bubbleTeaRouletteService.getRandomBubbleTeaType().ordinal();
        var expectedResult = BubbleTeaTypeEnumParam;

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @ParameterizedTest
    @EnumSource(BubbleTeaTypeEnum.class)
    public void shouldGenerateARandomBubbleTeaTypeByClass(BubbleTeaTypeEnum BubbleTeaTypeEnumParam) {

        //Arrange
        RandomStub randomStub = new RandomStub(BubbleTeaTypeEnumParam.ordinal());
        BubbleTeaRouletteService bubbleTeaRouletteService = new BubbleTeaRouletteService(randomStub);

        //Act
        var actualResult = bubbleTeaRouletteService.getRandomBubbleTeaType();
        var expectedResult = BubbleTeaTypeEnumParam;

        //Assert
        assertEquals(expectedResult, actualResult);

    }



}
