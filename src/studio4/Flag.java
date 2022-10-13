package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setXscale(0, 20);
		StdDraw.setYscale(0, 16);
			StdDraw.clear();
			StdDraw.setPenColor(240, 160, 230);
			StdDraw.filledRectangle(10, 8, 20, 20);
			StdDraw.setPenColor(120, 200, 15);
			StdDraw.filledEllipse(10, 8, 2, 2);
			StdDraw.filledEllipse(10, 2, 2, 2);
			StdDraw.filledEllipse(10, 14, 2, 2);
			StdDraw.setPenColor(120, 30, 180);
			StdDraw.filledRectangle(10, 11, 5, 0.5);
			StdDraw.filledRectangle(10, 5, 5, 0.5);


		}
	}
