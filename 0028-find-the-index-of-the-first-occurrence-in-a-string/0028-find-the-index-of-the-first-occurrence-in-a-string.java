class Solution {
    public int strStr(String haystack, String needle) {
        
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            // haystack의 부분 문자열이 needle과 같은지 비교
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}