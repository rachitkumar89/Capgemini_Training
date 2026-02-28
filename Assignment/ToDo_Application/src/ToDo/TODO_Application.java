

package ToDo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.Buffer;
import java.util.*;
public class TODO_Application {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
// Call the non Static readline method of the bufferdreader class
		//-->How to work with abstract class - child class
		//can not instantiate the type reader because it is 
		//Reader read=new Reader();
		try {
			FileReader file1=new FileReader("Galgotias");
		}
		catch(Exception e){
			System.out.println(e);
		}
		InputStream input1=System.in;
		InputStreamReader input= new InputStreamReader(input1);
		BufferedReader br=new BufferedReader(input);
		br.readLine();
				
	}

}
