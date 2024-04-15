import java.io.*;
import java.util.*;

public class Main {
	// 상 우 하 좌
	static final int[] dirX = new int[] {-1, 0, 1, 0};
	static final int[] dirY = new int[] {0, 1, 0, -1};
	
	static int R, C, K;
	static HashMap<Integer, int[]> hashMap;
	static int[][] map;
	
	static boolean check(int x, int y) {
		int dx, dy;
		
		for (int d = 0; d < 4; d++) {
			dx = x + dirX[d];
			dy = y + dirY[d];
			
			if (0<=dy && dy<C && map[dx][dy] == 0) continue;
			return false;
		}
		return true;
	}
	
	static int[] drop(int x, int y, int dir) {
		while (true) {
			if (x == R+1) break;

			// 하
			if (check(x+1, y)) {
				x++;
				continue;
			}

			// 좌하
			if (check(x, y-1) && check(x+1, y-1)) {
				x++; y--;
				dir = (dir+3) % 4;
				continue;
			}
			
			// 우하
			if (check(x, y+1) && check(x+1, y+1)) {
				x++; y++;
				dir = (dir+1) % 4;
				continue;
			}
			
			break;
		}
		
		return new int[] {x, y, dir};
	}
	
	static int move(int x, int y, int maxValue) {
		boolean[] v = new boolean[K+1];

		v[0] = true;
		v[map[x][y]] = true;
		
		ArrayDeque<int[]> q = new ArrayDeque<>();
		
		q.add(new int[] {x, y});
		
		while (!q.isEmpty()) {
			int[] poll = q.poll();
			int[] get = hashMap.get(map[poll[0]][poll[1]]);
			
			maxValue = Math.max(maxValue, get[2]);
			
			int dx, dy;
			for (int d = 0; d < 4; d++) {
				dx = get[0] + dirX[d];
				dy = get[1] + dirY[d];
				
				if (0 <= dx && dx < R+3 && 0<=dy && dy<C && !v[map[dx][dy]]) {
					v[map[dx][dy]] = true;
					q.offer(new int[] {dx, dy});
				}
			}
		}
		return maxValue - 2;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        
        R = Integer.parseInt((st.nextToken()));
        C = Integer.parseInt((st.nextToken()));
        K = Integer.parseInt((st.nextToken()));
    	
        hashMap = new HashMap<>();
        map = new int[R+3][C];
    	   
        for (int t = 1; t <= K; t++) {
        	st = new StringTokenizer(br.readLine());
        	
        	int c = Integer.parseInt((st.nextToken()))-1;
	        int d = Integer.parseInt((st.nextToken()));

	        int[] cur = drop(1, c, d);
	        
	        if (cur[0] <= 3) {
	        	map = new int[R+3][C];
				continue;
			}
	        
	        hashMap.put(t, new int[] {cur[0] + dirX[cur[2]], cur[1] + dirY[cur[2]], cur[0] + 1});
	        
	        map[cur[0]][cur[1]] = t;
	        for (int i = 0; i < 4; i++) {
		        map[cur[0] + dirX[i]][cur[1] + dirY[i]] = t;
			}
	        
	        result += move(cur[0], cur[1], cur[0] + 1);
		}
        
        System.out.println(result);
        br.close();
    }
}