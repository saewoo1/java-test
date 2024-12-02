import java.util.*;

class Solution {
    List<String> answer = new ArrayList<>();
    boolean[] visited;
    int n;
    
    public String[] solution(String[][] tickets) {
        
        n = tickets.length;
        visited = new boolean[n];
        dfs(0, "ICN", "ICN", tickets);
        Collections.sort(answer);
        
        return answer.get(0).split(" ");
    }
    
    public void dfs(int depth, String start, String path, String[][] tickets) {
        if (depth == n) {
            answer.add(path);
            return ;
        }
        
        for (int i = 0; i < n; i++) {
            if (!visited[i] && tickets[i][0].equals(start)) {
                visited[i] = true;
                dfs(depth + 1, tickets[i][1], path + " " + tickets[i][1], tickets);
                visited[i] = false;
            }
        }
    }
}