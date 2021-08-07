public class WhiteBoardQuestion {


    /**
     * Original solution
     */
//    public int sumOfAllSubArrays(int[] numbers) {
//        int sumOfNumbers = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i; j < numbers.length; j++) {
//                for (int x = i; x <= j; x++) {
//                    sumOfNumbers += numbers[x];
//                }
//            }
//        }
//        return sumOfNumbers;
//    }


    /**
     * Solution with only 1 for loop
     */
    public int sumOfAllSubArrays(int[] numbers) {
        int sumOfSubArraySum = 0;
        int subArraySum = 0;
        for (int startingIndex = 0, endingIndex = 0; startingIndex < numbers.length - 1; endingIndex++) {
            if (endingIndex == numbers.length) {
                startingIndex++;
                endingIndex = startingIndex;
                subArraySum = 0;
            }
            subArraySum += numbers[endingIndex];
            sumOfSubArraySum += subArraySum;
        }
        return sumOfSubArraySum;
    }
}
