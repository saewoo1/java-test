class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int start = n;
        for (int i = 0; start < num_list.length; i++) {
            answer[i] = num_list[start];
            start++;
        }
        int j = 0;
        for (int i = num_list.length - n; i < num_list.length; i++) {
            answer[i] = num_list[j];
            j++;
        }
        return answer;
    }
}