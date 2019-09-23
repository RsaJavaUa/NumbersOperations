import org.junit.Assert;
import org.junit.Test;
import services.DigitsCounterService;

import static org.junit.Assert.assertEquals;

public class DigitsCounterServiceTest {

    private static final long NUMBER = 55L;
    private static final long NEGATIVE_NUMBER = -55L;
    private static final long RESULT = 6L;
    private static final long RESULT_FROM_NEGATIVE = 7L;

    private DigitsCounterService digitsCounterService = new DigitsCounterService();

    @Test
    public void countDigits() {
        Assert.assertEquals(RESULT, digitsCounterService.countDigits(NUMBER));
        assertEquals(RESULT_FROM_NEGATIVE, digitsCounterService.countDigits(NEGATIVE_NUMBER));
    }
}
