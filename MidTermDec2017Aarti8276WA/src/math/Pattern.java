package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class Pattern {

	public static void main (String[] args) throws Exception{
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int j=100;
		int counter = 1, k=0;
		ConnectDB connectDB = new ConnectDB();
		List<String> storePattern = new ArrayList<String>();

		int[] array = new int[40];

		while(j>0) {
				for (int i=0; i<10; i++) {
					System.out.print(j+" ");
					array[k] = j;
					j-=counter;
					k++;
				}
				counter++;
		}
		System.out.println(" ");
		connectDB.InsertDataFromArryToMySql(array, "tbl_pattern", "column_pattern");
		storePattern = connectDB.readDataBase("tbl_pattern", "column_pattern");
		System.out.println("Data is reading from the Table (tbl_pattern) and displaying to the console");

		for (String st : storePattern) {
			System.out.print(" " + st);
		}
	}
}
