import java.util.*;
// N개의 물건을 갖고 있고, 최대 C의 무게를 넣을 수 있는 가방이 있다.
// N개의 물건을 가방에 넣을 수 있는 방법의 총 개수를 구하라.

/*
1. 정보들을 입력 받는다.
2. 물건들을 반 쪼갠다 -> 최대 2(넣는다, 안넣는다)의 30승이라 dfs만으로는 불가능하므로
3. dfs를 사용해 sum들을 구해낸다
4. answer = sum2만 오름차순으로 정렬하여 binary search, target idx의 최대값 + 1
*/
public class Main {
    static int N;
    static int C;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        C = scanner.nextInt();
        scanner.nextLine(); // 초기화
        
        String[] weights = scanner.nextLine().split(" ");
        List<Integer> weight1 = new ArrayList<>();
        List<Integer> weight2 = new ArrayList<>();
        
        // 짐을 쪼개서 반반 넣어주기 최악은 해봤자 (2의 15승) *2
        for (int i = 0; i < N; i++) {
            if (i < N / 2) {
                weight1.add(Integer.parseInt(weights[i]));
            }
            else {
                weight2.add(Integer.parseInt(weights[i]));
            }
        }
        
        List<Integer> sum1 = new ArrayList<>();
        List<Integer> sum2 = new ArrayList<>();
        // weight1의 0번째 값을 불러서 sum1에 0부터 시작한 sum 값을 더해나가 적립한다
        dfs(0, 0, weight1, sum1);
        dfs(0, 0, weight2, sum2);
        
        // binary search를 위해 sum2만 오름차순 정렬 ㄱㄱ
        Collections.sort(sum2);
        int answer = 0;
        for (int i = 0; i < sum1.size(); i++) {
            // sum2에서 찾은 target에서 가장 큰 idx + 1 = C가 된 count
            int target = C - sum1.get(i);
            answer += binarySearch(sum2, target) + 1;
        }
        
        System.out.println(answer);
    }
    
    public static void dfs(int i, int currentSum, List<Integer> weight, List<Integer> sum) {
        // 이미 최대 적재량을 초과했다면 dfs 돌 필요 없으 걍 가쇼
        if (currentSum > C) {
            return ;
        }
        // weight의 모든 경우(끝까지 다 옴)를 돌았다면 currentSum을 리스트에 더해주자
        if (i == weight.size()) {
            sum.add(currentSum);
            return;
        }
        
        
        // 가방을 짐에 넣어
        dfs(i + 1, currentSum + weight.get(i), weight, sum);
        // 안넣어
        dfs(i + 1, currentSum, weight, sum);
    }
    
    // target이 있는 위치 중 가장 큰 idx값을 반환하라
    public static int binarySearch(List<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;
        
        // 가장 큰 idx가 될 answer
        int answer = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            // target이 더 크다면
            if (list.get(mid) <= target) {
                answer = mid;
                // 그럼 좌측 검사 안해잉
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return answer;
    }
}