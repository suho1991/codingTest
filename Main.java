package programers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a1 = Integer.parseInt(st.nextToken());
		int a0 = Integer.parseInt(st.nextToken());
		int c  = Integer.parseInt(br.readLine());
		int n0  = Integer.parseInt(br.readLine());
		
		int answer = 1;
		
		int n = n0;
		
		int fn = (a1 * n) + a0;
		int gn = c * n;

		if(fn <= gn && c >= a1) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
