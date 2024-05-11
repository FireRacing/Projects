package javaapplication70;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class bank{
	public static void main(String args[])
	{
		Scanner in1 = new Scanner(System.in);
		ArrayList<String> account_holder = new ArrayList<String>();
		ArrayList<Double> balance = new ArrayList<Double>();
		File f = new File("accounts.txt");
		int i;
		String s,s1;
		double d;
		while(true)
		{
			try {
				BufferedReader reader = new BufferedReader(new FileReader(f));
				System.out.println("Reader object created");
				reader.close();				
			}catch(FileNotFoundException e)
			{
				e.printStackTrace();
				System.out.println("File not created");
				try {
					PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(f)));
					System.out.println("Input the number of accounts: ");
					int n = in1.nextInt();
					for(i = 0; i < n; i++)
					{
						s = in1.nextLine();
						System.out.println(s);
					}
					for(i = 0; i < n; i++)
					{
						System.out.println("Balance: ");
						d = in1.nextDouble();
					}
					writer.close();
				}catch(IOException e2)
				{
					e2.printStackTrace();
					System.out.println("File not Written");
				}
			}
			catch(IOException e1)
			{
				e1.printStackTrace();
				System.out.println("IO exception");
			}
			account_holder.clear();
			balance.clear();
			in1.close();
			break;
		}
	}
}