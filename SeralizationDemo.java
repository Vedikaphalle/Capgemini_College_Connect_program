package file_handling.java_8_features;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SeralizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emplyoee e=new Emplyoee(101,"hari","Banglore");
		try {
			FileOutputStream fo=new FileOutputStream("Employees.txt");
			ObjectOutputStream out=new ObjectOutputStream(fo);
			out.writeObject(e);
			fo.close();
			System.out.println("seralized data saved in emplyoee.txt file");
		}catch(Exception i){
			i.printStackTrace();
		}

	}

}
