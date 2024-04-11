import java.io.*;
import java.util.*;

public class Main {
	static final int[] dirX = new int[] {-1, -1, 1, 1};
	static final int[] dirY = new int[] {-1, 1, -1, 1};
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt((st.nextToken()));
        int result = 1;

        PriorityQueue<int[]> q = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[0], o2[0]);
			}
		});
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
        	q.offer(new int[] {Integer.parseInt((st.nextToken())), 1});		// start
        	q.offer(new int[] {Integer.parseInt((st.nextToken())), -1});	// end
		}
        
        int cnt = 0;
        
        while (!q.isEmpty()) {
			cnt += q.poll()[1];
			if (result < cnt) result = cnt;
		}
       
        System.out.println(result);
        br.close();
    }
}