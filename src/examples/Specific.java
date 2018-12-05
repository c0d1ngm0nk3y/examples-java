package examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Specific {
	static String readFirstLineFromFile(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			return br.readLine();
		} finally {
			if (br != null)
				br.close();
		}
	}
}
