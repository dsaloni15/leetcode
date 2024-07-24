class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lesser = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for(int num : nums){
            if(num<pivot){
                lesser.add(num);
            }else if(num==pivot){
                equal.add(num);
            }
            else{
                greater.add(num);
            }
        }
        lesser.addAll(equal);
        lesser.addAll(greater);
        int[] result = new int[lesser.size()];
        for (int i = 0; i < lesser.size(); i++) {
            result[i] = lesser.get(i);
        }

        return result;
    }
}