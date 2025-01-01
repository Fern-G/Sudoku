package sudokuProj;

import java.util.ArrayList;
import java.util.Random;

public class GridLogic {
	
	private int[][] grid;
	private int r;
	private int c;
	
	public GridLogic(){
		r = 3;
		c = 3;
		grid = new int[r][c];
		
	}

	public void randomNumber(){
		ArrayList<Integer> rand = new ArrayList<Integer>();

		rand.add(1);
		rand.add(2);
		rand.add(3);
		Random r = new Random();
		
		
		for (int i = 0; i < i; i++) {
			for (int l = 0; l < c; l++) {
				if (i == 1) {
					rand.remove(grid[l][i - 1]);
				}
				if (i == 2) {
					rand.remove(grid[l][i - 2]);
				}
				int n = rand.get(r.nextInt(rand.size()));
				grid[l][i] = n;
				rand.remove(n);

			}
			rand.add(1);
			rand.add(2);
			rand.add(3);
		}
		
	}
}
