import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class input {

void writer() throws IOException{
	FileWriter write=new FileWriter("/home/alan/Journal/journal.txt",true);
	PrintWriter printline=new PrintWriter(write);
	printline.println("--------------------------------------------------------");
	System.out.println("Print the date");
	Scanner scansys=new Scanner(System.in);
	String date=scansys.nextLine();
	date="Date: "+date;
	printline.println(date);
	System.out.println("Print the title of this entry.");
	String title=scansys.nextLine();
	printline.println(title);
	System.out.println("Print this journal entry.");
	String entry=scansys.nextLine();
	printline.println(entry);
	printline.println("--------------------------------------------------------");
	printline.close();
	scansys.close();
	System.out.println("Have a nice day!");
	
}

}
