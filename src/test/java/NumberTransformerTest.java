import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import services.ConsoleInputService;
import services.NumberTransformer;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class NumberTransformerTest {

    private static final int RESULT = 91;
    private static final String USER_INPUT = "01011011";
    private static final String WRONG_INPUT = "acb011011";

    @InjectMocks
    private NumberTransformer numberTransformer;

    @Mock
    private ConsoleInputService inputServiceMock;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() {
        numberTransformer = new NumberTransformer();
        Mockito.when(inputServiceMock.stringInputFromConsole()).thenReturn(USER_INPUT);
        numberTransformer.setInputService(inputServiceMock);
    }

    @Test
    public void binaryToIntConsole() {
        assertEquals(RESULT, numberTransformer.binaryToIntConsole());
    }

    @Test
    public void binaryToInt() {
        assertEquals(RESULT, numberTransformer.binaryToInt(USER_INPUT));
    }

    @Test
    public void shouldReturnException() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Wrong input");
        numberTransformer.binaryToInt(WRONG_INPUT);
    }
}
