class Solution {
    public int[] solution(int[] num_list) {
        int temp = 0;
        int n = num_list.length;
        for(int i=0; i<=n/2; i++){
            temp = num_list[i];
            num_list[i] = num_list[n-1-i];
            num_list[n-1-i] = temp;
        }
        return num_list;
    }
}