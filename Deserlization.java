package file_handling.java_8_features;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserlization {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Emplyoee el=null;
		try {
			FileInputStream fl=new FileInputStream("Employees.txt");
			ObjectInputStream inp=new ObjectInputStream(fl);
			el=(Emplyoee)inp.readObject();
			inp.close();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Deserilized dat of Emplyoee is :");
		System.out.println("id: "+el.id);
		System.out.println("name: "+el.name);
		System.out.println("address: "+el.address);
	

	}

}
