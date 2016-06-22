
import java.util.ArrayList;
import java.util.Scanner;

import jp.co.worksap.global.*;
public class Runnar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableQueue <Integer> ram = new ImmutableQueue<Integer>();
		ram = ram.enqueue(4);
		ram = ram.enqueue(5);
		ram = ram.enqueue(6);
		System.out.printf("%d", ram.peek());
		ram = ram.dequeue();
		System.out.printf("%d", ram.peek());
		ram = ram.dequeue();
		System.out.printf("%d", ram.peek());
		
		String line = "55 96";
	    ArrayList<String> lines = new ArrayList<String>();
		lines.add(line);

		Scanner wh = new Scanner(lines.get(0));
	    int W = wh.nextInt(); 
	    int H = wh.nextInt();
	    wh.close();
	    
	    System.out.printf("\n %d %d", W,H);
	}

}
