import org.junit.Assert;
import org.junit.Test;

public class WhiteBoardQuestionTest {

    WhiteBoardQuestion sum = new WhiteBoardQuestion();

    @Test
    public void sumOfAllSubArraysTest() {
        // Given
        int[] givenArray = new int[] {1, 3, 5, 4};
        int expectedSum = 68;

        // When
        int actualSum = sum.sumOfAllSubArrays(givenArray);

        // Then
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void sumOfAllSubArrays_AllNegativesTest() {
        // Given
        int[] givenArray = new int[] {-1, -3, -5, -4};
        int expectedSum = -68;

        // When
        int actualSum = sum.sumOfAllSubArrays(givenArray);

        // Then
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void sumOfAllSubArrays_SomeNegativesTest() {
        // Given
        int[] givenArray = new int[] {-1, 3, 5, -4};
        int expectedSum = 28;

        // When
        int actualSum = sum.sumOfAllSubArrays(givenArray);

        // Then
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void sumOfAllSubArrays_LongTest() {
        // Given
        int[] givenArray = new int[] {1, 3, 5, 4, 6, 7, 10, 4, 99, 34, 6, 1, 3};
        int expectedSum = 7774;

        // When
        int actualSum = sum.sumOfAllSubArrays(givenArray);

        // Then
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void sumOfAllSubArrays_LongAllNegativeTest() {
        // Given
        int[] givenArray = new int[] {-1, -3, -5, -4, -6, -7, -10, -4, -99, -34, -6, -1, -3};
        int expectedSum = -7774;

        // When
        int actualSum = sum.sumOfAllSubArrays(givenArray);

        // Then
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void sumOfAllSubArrays_LongSomeNegativeTest() {
        // Given
        int[] givenArray = new int[] {1, -3, 5, 4, -6, -7, 10, -4, 99, 34, -6, 1, -3};
        int expectedSum = 5560;

        // When
        int actualSum = sum.sumOfAllSubArrays(givenArray);

        // Then
        Assert.assertEquals(expectedSum, actualSum);
    }
}
