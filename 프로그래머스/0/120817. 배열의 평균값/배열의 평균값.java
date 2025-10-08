class Solution {
    public double solution(int[] numbers) {
        int result=0;
        for(int i=0; i<numbers.length; i++){
            result +=numbers[i];
        }
        return (double)result/numbers.length;
    }
}