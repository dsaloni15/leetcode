class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int i = 0;
        while(true){
            if(chalk[i] <= k){
                k -= chalk[i];
                i++;
            }
            else{
                return i;
            }
            if (i == chalk.length) {
            i = 0;
        }
        }

    }
}