import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
public class FileCopy {
	public static void main(String [] args) {
		char [] data=new char[50];
		FileWriter writer=null;
		FileReader reader =null;
		try {
			reader=new FileReader("input.txt");
			int size=reader.read(data);
			System.out.println(data);
			System.out.println("Size of data:"+size);
			reader.close();
			
			writer=new FileWriter("output.txt");
			writer.write(data,0,size);
			writer.flush();
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
