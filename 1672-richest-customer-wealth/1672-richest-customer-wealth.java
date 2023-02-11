class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth_max = -1;
        for (int i = 0; i < accounts.length; i++){
            int wealth_curr = 0;
            for (int j = 0; j < accounts[i].length; j++){
                wealth_curr += accounts[i][j];
            }

            wealth_max = wealth_max < wealth_curr ? wealth_curr : wealth_max;
        }

        return wealth_max;
    }

}