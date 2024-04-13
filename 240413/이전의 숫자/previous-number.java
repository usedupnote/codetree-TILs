import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int answer = 0;
        int n = Integer.parseInt(st.nextToken());

        int[] nums = new int[n];
        
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0 ; i < n ; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            if(nums[i] == 0) {
                for(int j = i-5 ; j < i ; j++) {
                    answer += nums[j];
                }
                break;
            }
        }

        System.out.println(answer);
    }
}