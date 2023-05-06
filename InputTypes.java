import java.util.*;
import java.io.*;
public class InputTypes {

	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		int command_line_input, scanner_input, io_input;
		
		command_line_input=Integer.parseInt(args[0]);
		scanner_input=sc.nextInt();
		 io_input=Integer.parseInt(br.readLine());
		
		
		System.out.println("Input from Command Line Arguments: "+command_line_input);
		System.out.println("Input from Scanner class: "+scanner_input);
		System.out.println("Input from Input Stream Reader: "+io_input);
	}

}
