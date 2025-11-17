class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int num = nums[i];
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(nums[i],1);
            }
        }
        Set<Integer> keySet = map.keySet();
        for(int key : keySet){
            if(map.get(key) > nums.length/2){
                return key;
            }
        }
        return -1;
    }
}