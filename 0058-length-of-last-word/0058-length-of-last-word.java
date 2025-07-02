class Solution {
    public int lengthOfLastWord(String s) {
        int index = s.length()-1;

        while(index >=0 && s.charAt(index) == ' ') index--;
        
        int answer = 0;
        while(index >=0 && s.charAt(index) != ' '){
            answer++;
            index--;
        }
        return answer;
       }
    }