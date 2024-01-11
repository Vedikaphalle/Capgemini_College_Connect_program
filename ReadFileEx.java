package file_handling.java_8_features;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileEx {

	public static void main(String[] args) throws IOException {
		// File Input Stream->read Data
       FileInputStream inp=new FileInputStream("data.txt");
       //read first
       int i=inp.read();
       while(i!=-1) {
    	   System.out.print((char)i);
    	   //read next byte from the file
    	   i=inp.read();
       }
       inp.close();
	}

}
