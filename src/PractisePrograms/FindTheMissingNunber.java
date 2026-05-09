package PractisePrograms;
class Example {

    public static int missingNumber(int num[], int totalCount) {
        int expC = totalCount * ((totalCount + 1) / 2);
        int actualSum = 0;

        for (int i : num) {
            actualSum += i;
        }
        return totalCount - actualSum;
    }


    public class FindTheMissingNunber {
        public static void main(String[] args) {
            int num[] = {1, 2, 3, 4, 6};
            missingNumber(num, 6);
        }
    }
}
