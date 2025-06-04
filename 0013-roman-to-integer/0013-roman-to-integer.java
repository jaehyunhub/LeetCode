class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        int result = 0;
        int prev = 0;


        for(int i = s.length()-1; i>=0; i--){
            int curr = roman.get(s.charAt(i));
            if(curr < prev){
                result -= curr;
            }else{
                result += curr;
            }
            prev = curr;
        }
        return result;
    }
}