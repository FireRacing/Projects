package mathematics;

import java.util.ArrayList;

class test1{ //class for testing various things. not for testing precoded functions
	double funct()
	{
		return (Math.pow(2, 4)/2);
	}
	int funct1()
	{
		return 0;
	}
}
public class test{ // For testing precoded functions
	public static void main(String args[])
	{
		long l = 1000000;
		miscellaneous m = new miscellaneous();
		m.convert_number_to_binary(l);
	}
}