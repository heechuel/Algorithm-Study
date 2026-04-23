import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> stack = new ArrayDeque<>();
		int N = Integer.parseInt(br.readLine());
		long sum = 0;
		
		for(int i = 1; i < N+1; i++){
		    int num = Integer.parseInt(br.readLine());
		    
		    while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }

            sum += stack.size();
            stack.push(num);
		    
	   }
	   
	   System.out.print(sum);
	}
}
