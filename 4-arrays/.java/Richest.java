public class Richest {
    public static void main(String[] args) {
        

        int[][] accounts = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {

                sum = sum + accounts[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

}
