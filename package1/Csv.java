package package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Csv {

	public static void main(String[] args) throws IOException {
		File src = new File("C:\\Users\\ng21408\\eclipse-workspace\\testing\\test.csv");
        FileReader fr =new FileReader(src);
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        System.out.println("printed the csv data");
        br.close();

	}

}	