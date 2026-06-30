class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> baskets = new HashMap<>();
        int maxSize = 0;
        int left=0,cur=0;
        while (cur < fruits.length) {
            baskets.put(fruits[cur],baskets.getOrDefault(fruits[cur],0)+1);
            while (baskets.size()>2) {
               
                int curCount = baskets.get(fruits[left]);
                if (--curCount ==0) {
                    baskets.remove(fruits[left]);
                } else {
                    baskets.put(fruits[left], curCount);
                }
                left++;
            }
            
            maxSize = Math.max(maxSize , cur - left+1);
            cur++;
        }

        return maxSize;        
    }
}