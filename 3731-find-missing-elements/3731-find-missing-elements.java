class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        int m1=nums[0];
        int m2=nums[n-1];
        for(int i=m1;i<=m2;i++)
        {
            list.add(i);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<list.size();j++)
            {
                if(nums[i]==list.get(j))
                {
                    list.remove(j);
                    break;
                }
            }
        }
        return list;
    }
}