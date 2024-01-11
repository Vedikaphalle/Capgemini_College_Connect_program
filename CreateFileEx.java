package file_handling.java_8_features;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFileEx {

	public static void main(String[] args) throws IOException {
		
		File file=new File("data.txt");//representing a file
		if(file.exists()) {
			file.createNewFile();//new file will create
		}
        //write data inside the file
		FileOutputStream fos=new FileOutputStream(file);
		String data="this is a Traning of java full Stack";
		//serialization
		fos.write(data.getBytes());
		fos.flush();//flush method will remove all data inside write
		System.out.println("file creater: "+file.getAbsolutePath());
		System.out.println("file creater: "+file.getCanonicalPath());
		System.out.println("file creater: "+file.getPath());
	}

}
