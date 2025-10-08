class Solution {
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer(my_string);
        String new_string = sb.reverse().toString();
        return new_string;
    }
}