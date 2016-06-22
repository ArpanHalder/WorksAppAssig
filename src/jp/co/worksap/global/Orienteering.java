package jp.co.worksap.global;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Orienteering {
	
	/*int path_length;*/
	int W,H; //
	static int Sw,Sh; // starting coordinate for S
	
	char[][] mapdata;
	
	
	public Orienteering(String path){
		loadMap(path);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orienteering Problem = new Orienteering("map.txt"); // the input file
		Problem.solve(Sh, Sw);
		
	}
	public int solve(int x ,int y){
		
		// Failed need more time
		return - 1;
	}
	
	int[] findCh(char ch){
		
		int h = 0,w = 0; // indexex to return
		//TODO for loop search
		
		return new int[]{h,w}; // return position of certain character 'ch'
	}
		

	public void loadMap(String path) { //to load the maze
		

	    BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    String line = null;
		try {
			line = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    ArrayList<String> lines = new ArrayList<String>();
	    // Load all the lines
	    while (line != null){
	        lines.add(line);
	    }
	    
	    // Parse the data
		Scanner wh = new Scanner(lines.get(0));
	    this.W = wh.nextInt(); 
	    this.H = wh.nextInt();
	    wh.close();
	    mapdata = new char[H][W];
	    for (int i = 1; i < lines.size(); i++) {
	        for (int j = 0; j < lines.get(i).length(); j++) {
	            mapdata[j][i] = lines.get(i).charAt(j);
	        }
	    }
	}
	

}
