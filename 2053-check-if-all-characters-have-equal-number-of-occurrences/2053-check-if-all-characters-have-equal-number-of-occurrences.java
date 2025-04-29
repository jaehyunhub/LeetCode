class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        
        for(char x : s.toCharArray()){
            freq[x - 'a']++;
        }

        int target = 0;
        for(int f : freq){
            if(f != 0){
                target = f;
                break;
            }
        }

        for(int f : freq){
            if(f !=0 && f != target){
                return false;
            }
        }

        return true;
    }

}