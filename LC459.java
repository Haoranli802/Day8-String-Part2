//移动匹配
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String temp = s + s;
        return temp.substring(1, temp.length() - 1).contains(s);
    }
}
//O(N), O(1)

//KMP
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length() == 1) return false;
        int[] next = new int[s.length()];
        getNext(next, s);
        return next[s.length() - 1] > 0 && s.length() % (s.length() - next[s.length() - 1]) == 0; 
    }
    private void getNext(int[] next, String s){
        int j = 0;
        next[0] = j;
        for(int i = 1; i < s.length(); i++){
            while(j > 0 && s.charAt(i) != s.charAt(j)){
                j = next[j - 1];
            }
            if(s.charAt(i) == s.charAt(j)){
                j ++;
            }
            next[i] = j;
        }
    }
}
// O(N), O(N)
