class Solution {
    public int[] processQueries(int[] queries, int m) {
        ArrayList<Integer> p = new ArrayList<>();
        for(int i = 1 ; i <= m ; i++){
            p.add(i);
        }
        int[] ans = new int[queries.length];
        int idx = 0;
        for(int i = 0 ; i < queries.length ; i++){
            ans[idx++] = p.indexOf(queries[i]);
            p.remove(p.indexOf(queries[i]));
            p.add(0,queries[i]);
        }
        return ans;
    }
}