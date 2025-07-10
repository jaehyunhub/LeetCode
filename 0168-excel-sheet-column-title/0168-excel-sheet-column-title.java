class Solution {
    public String convertToTitle(int columnNumber) {
        
       StringBuilder sb = new StringBuilder();

       while(columnNumber > 0){

        // 1-26 범위로 맞추기 위해서
        // (A-0, B-1, ...,Z-25)로 변경하기 위해서
        // 빼지않고 그냥 나중에 +65로 가능하지만 가독성이나 실수하기 쉽기때문에 이런식으로 진행
        columnNumber--;

        int r = columnNumber % 26;
        char c = (char)('A' + r);
        sb.append(c);

        columnNumber /= 26;

       }
       return sb.reverse().toString();
    }
}