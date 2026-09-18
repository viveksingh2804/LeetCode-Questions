class Solution {
    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();
        toss(n, "", list);
        return list;
    }
    
    public void toss(int n, String ans, List<String> list) {
        if(n == 0) {
            list.add(ans);
            return;
        }
        if(ans.length() == 0 || ans.charAt(ans.length()-1) != '0'){
            toss(n-1, ans+"0", list);
        }
        toss(n-1, ans+"1", list);
    }
}