class Solution {
    public int maximumLength(int[] nums) {
        TreeMap<Integer,Integer> hm = new TreeMap<>();
        int maxNum = -1;
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
            maxNum = Math.max(maxNum,i);
        }
        int maxLen = 1;
        if(hm.containsKey(1))
        {
            if(hm.get(1)%2==0)
            maxLen = Math.max(maxLen,hm.get(1)-1);
            else
        {
            maxLen = Math.max(maxLen,hm.get(1));
        }
        hm.remove(1);
        }
        HashSet<Integer> visited = new HashSet<>();
        for(int i:hm.keySet())
        {
            visited.add(i);
            if(hm.get(i) < 2)
            continue;
            int cnt = 2;
            if(cnt>1){
                i = i*i;
                if(!visited.contains(i))
                {
                    for(int j=i;j<=maxNum;j*=j)
                    {
                        visited.add(j);
                        if(hm.containsKey(j))
                        {
                            if(hm.get(j)>=2)
                            {
                                cnt+=2;
                            }
                            else
                            {
                                cnt+=hm.get(j);
                                break;
                            }
                        }
                        else
                        {
                            break;
                        }
                    }
                }
            }
            maxLen = Math.max(maxLen,(cnt!=0 && cnt%2==0)?cnt-1:cnt);
        }
        return maxLen;
    }
}