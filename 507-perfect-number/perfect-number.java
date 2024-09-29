class Solution {
    public boolean checkPerfectNumber(int num) {
        List<Integer> div = new ArrayList<>();

        for(int i = 1 ; i < num ; i++){
            if(num%i == 0){
                div.add(i);
            }
        }
        int sum = 0;
        for(int i = 0 ; i < div.size() ; i++){
            sum += div.get(i);
        }
        if(sum == num) return true;

        return false;
    }
}