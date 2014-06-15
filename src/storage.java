import java.io.IOException;
import java.util.Scanner;


public class storage {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		input writer=new input();
		output viewer=new output();
		System.out.println("Do you wish to write or view the journal?");
		Scanner detect=new Scanner(System.in);
		String s=detect.nextLine();
		if (s.equals("write")){
			writer.writer();
		} else if(s.equals("view")){
			viewer.viewer();
		}
		detect.close();

	}

}
