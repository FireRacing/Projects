package mathematics;

import java.util.ArrayList;

/*
 * TODO:- Add support to check for group_validty with respect to Zn where n is an integer.
 */
/**
 * A public class for implementing group theory concepts.
 * @author K. Tarun Kumar Reddy.
 */
public class group_theory{
	/**
	 * How the function will check for group validity:
	 * Apply first operation on the group and then check for validity with respect to that 
	 * operation.<br>
	 * Supported operations : +
	 * @param d - the array list to be verified.
     * @param group_name - for labeling purposes.
     * @return a boolean value that indicates whether the collection is a group with respect to 
     * addition.
	 */
	boolean check_against_addition(ArrayList<Double> d, char group_name)
	{
		boolean identity_exists = false;
		for(int i = 0;i < d.size(); i++)
		{
			if(d.get(i)==0)
			{
				System.out.println("Identity element exists");
				identity_exists= true;
				break;
			}
		}
		int count =0;
		if(identity_exists == false)
		{
			System.out.println("Identity element does not exist in the set");
			return false;
		}
		for(int i = 0 ; i < d.size() ; i++)
		{
			if(d.get(i) == 0)
				continue;
			else
			{
				for(int j = 0 ; j < d.size(); j++)
				{
					if(d.get(i) - d.get(j) == 0)
					{
						count++;
						break;
					}
				}
			}
		}
		if(count == d.size()-2)//Addition is associative by default
		{
			System.out.println("Inverses exists for each element in the set");
			System.out.println(group_name+" is a group under addition");
			identity_exists = false;
		}
		else
		{
			System.out.println(group_name+" is not a group under addition");
			identity_exists = false;
			return false;
		}
		return true;
	}
	/**
	 * How the function will check for group validity:
	 * Apply first operation on the group and then check for validity with respect to that 
	 * operation.<br>
	 * Supported operations : +
	 * @param i - the array to be verified.
     * @param group_name - for labeling purposes.
     * @return a boolean value that indicates whether the collection is a group with respect to 
     * addition.
	 */
	boolean check_against_addition(int i[], char group_name)
	{
		boolean identity_exists = false;
		for(int i1 = 0; i1 < i.length; i1++)
		{
			if(i[i1] == 0)
			{
				System.out.println("Identity element exists");
				identity_exists= true;
				break;
			}
		}
		int count = 0;
		if(identity_exists == false)
		{
			System.out.println("Identity element does not exist in the set");
			return false;
		}
		for(int i1 = 0 ; i1 < i.length ; i1++)
		{
			if(i[i1] == 0)
				continue;
			else
			{
				for(int j = 0 ; j < i.length; j++)
				{
					if(i[i1] - i[j] == 0)
					{
						count++;
						break;
					}
				}
			}
		}
		if(count == i.length-2)//Addition is associative by default
		{
			System.out.println("Inverses exists for each element in the set");
			System.out.println(group_name+" is a group under addition");
			identity_exists = false;
		}
		else
		{
			System.out.println(group_name+" is not a group under addition");
			identity_exists = false;
			return false;
		}
		return true;
	}
	/**
	 * How the function will check for group validity:
	 * Apply first operation on the group and then check for validity with respect to that 
	 * operation.<br>
	 * Supported operations : * (multiplication).
	 * @param d - the array list to be verified.
     * @param group_name - for labeling purposes.
     * @return a boolean value that is true if the array list is a group under multiplication.
	 */
	boolean check_against_multiplication(ArrayList<Double> d, char group_name)
	{
		boolean identity_exists = false;
		for(int i = 0;i < d.size(); i++)
		{
			if(d.get(i)==1)
			{
				System.out.println("Identity element exists");
				identity_exists= true;
				break;
			}
		}
		int count =0;
		if(identity_exists == false)
		{
			System.out.println("Identity element does not exist in the set");
			return false;
		}
		for(int i = 0 ; i < d.size() ; i++)
		{
			if(d.get(i) == 0)
				continue;
			else
			{
				for(int j = 0 ; j < d.size(); j++)
				{
					if(d.get(i)/ d.get(j) == 1)
					{
						count++;
						break;
					}
				}
			}
		}
		if(count == d.size()-1)//Multiplication is associative by default
		{
			System.out.println("Inverses exists for each element in the set");
			System.out.println(group_name+" is a group under multiplication");
			identity_exists = false;
		}
		else
		{
			System.out.println("Inverses do not exist for each element in the set");
			System.out.println(group_name+" is not a group under multiplication");
			identity_exists = false;
			return false;
		}
		return true;
	}
	/**
	 * How the function will check for group validity:
	 * Apply first operation on the group and then check for validity with respect to that operation.
	 * Supported operations : *
	 * @param i - the array to be verified.
     * @param group_name - for labeling purposes.
     * @return a boolean value that is true if the array is a group under multiplication.
	 */
	boolean check_against_multiplication(int i[], char group_name)
	{
		boolean identity_exists = false;
		for(int i1 = 0; i1 < i.length; ++i1)
		{
			if(i[i1]==1)
			{
				System.out.println("Identity element exists");
				identity_exists= true;
				break;
			}
		}
		int count =0;
		if(identity_exists == false)
		{
			System.out.println("Identity element does not exist in the set");
			return false;
		}
		for(int i1 = 0 ; i1 < i.length ; ++i1)
		{
			if(i[i1] == 0)
				continue;
			else
			{
				for(int j = 0 ; j < i.length; j++)
				{
					if(i[i1]/ i[j] == 1)
					{
						count++;
						break;
					}
				}
			}
		}
		if(count == i.length-1)//Multiplication is associative by default
		{
			System.out.println("Inverses exists for each element in the set");
			System.out.println(group_name+" is a group under multiplication");
			identity_exists = false;
		}
		else
		{
			System.out.println("Inverses do not exist for each element in the set");
			System.out.println(group_name+" is not a group under multiplication");
			identity_exists = false;
			return false;
		}
		return true;
	}
	/**
	 * Checks whether the array list is a group with respect to exponentiation.
	 * @param d - the array list to be verified.
     * @param group_name - for labeling purposes.<br>
     * How the function will check for group validity:<br>
	 * Apply first operation on the group and then check for validity with respect to that
	 * operation.<br>
	 * Supported operations : ^ (exponentiation).
	 * @return a boolean value that indicates whether the array list is a group with respect to
	 * exponentiation.
	 */
	boolean check_against_exponentiation(ArrayList<Double> d,char group_name)
	{
		boolean identity_exists = false;
		for(int i=0;i<d.size();i++)
		{
			if(d.get(i)==1)
			{
				System.out.println("identity element exists in the group");
				identity_exists = true;
				break;
			}
			else if(i==d.size()-1)
			{
				System.out.println("identity element does not exist in the group");
				return false;
			}
		}
		if(identity_exists)
		{
			int count = 0;
			for(int i=0;i<d.size();i++)
			{
				for(int j=0;j<d.size();j++)
				{
					if(Math.log10(d.get(i)/Math.log10(d.get(j)))==1)
					{
						count++;
						break;
					}
					else if(d.get(j)==1)
						continue;
				}
			}
			if(count == d.size()-2)//Exponentiation is associative by default
			{
				System.out.println(group_name+" is a group under exponentiation");
				System.out.println("Inverses exist for each element in the set except the identity element");
			}
			else
			{
				System.out.println("Inverses do not exist for each element in the set except the identity element");
				System.out.println(group_name+" is not a group under exponentiation");
				return false;
			}
		}
		return true;
	}
	/**
	 * Checks whether the array is a group with respect to exponentiation.
	 * @param i - the array to be verified.
     * @param group_name - for labeling purposes.
     * How the function will check for group validity:
	 * Apply first operation on the group and then check for validity with respect to that operation.
	 * Supported operations : ^
	 * @return a boolean value that indicates whether the collection is a group with respect to exponentiation.
	 */
	boolean check_against_exponentiation(int i[],char group_name)
	{
		boolean identity_exists = false;
		for(int i1=0; i1 < i.length ; ++i1)
		{
			if(i[i1]==1)
			{
				System.out.println("identity element exists in the group");
				identity_exists = true;
				break;
			}
			else if(i1 == i.length-1)
			{
				System.out.println("identity element does not exist in the group");
				return false;
			}
		}
		if(identity_exists)
		{
			int count = 0;
			for(int i1 = 0; i1 < i.length ; ++i1)
			{
				for(int j = 0 ; j < i.length; ++j)
				{
					if(Math.log10(i[i1]/Math.log10(i[j]))==1)
					{
						count++;
						break;
					}
					else if(i[j] == 1)
						continue;
				}
			}
			if(count == i.length-2)//Exponentiation is associative by default
			{
				System.out.println(group_name+" is a group under exponentiation");
				System.out.println("Inverses exist for each element in the set except the identity element");
			}
			else
			{
				System.out.println("Inverses do not exist for each element in the set except the identity element");
				System.out.println(group_name+" is not a group under exponentiation");
				return false;
			}
			
		}
		return true;
	}
	/**
	 * Checks whether the array list is a group with respect to modulus.
	 * @param i1 - the array list to be verified.
     * @param group_name - The name the group will be called as if the array list passes as a group.
     * @param value_to_check_against - value to check set's group validity against.
     * @param operation - The primary operation to apply before checking whether the array list is
     * a group or not.
     * <p> How the function will check for group validity:<br>
	 * Apply first operation on the group and then check for validity with respect to that
	 * operation.<br>
	 * For example: if the array list contains elements 1, 2, 3 in order of typing and operation is
	 * '*' and number is 7 then, the numbers will be multiplied with each other and a table will be
	 * constructed with the residue values with respect to modulo 7 as follows:
	 * <br>
	 * <br>
	 * *  | 1 | 2 | 3 <br>
	 * ---------------<br>
	 * 1  | 1 | 2 | 3 <br>
	 * 2  | 2 | 4 | 6 <br>
	 * 3  | 3 | 6 | 2 <br>
	 * <br>
	 * After doing so, the program will check whether the identity element is present in the table
	 * or not.
	 * If it is, it proceeds with checking for group validity with respect to inverses for each 
	 * element.
	 * If an inverse is present for each element, then, it automatically declares the array list as
	 * a group as addition and multiplication are associative.
	 * </p>
	 * Supported operations : +%, *%, ^ (exponentiation) %.
	 * @return a boolean value that is true if the array list is a group and false otherwise. 
	 */
	boolean check_against_modulo(ArrayList<Integer> i1,char group_name,char operation,int value_to_check_against)
	{
		if(operation == '+')
		{
			ArrayList<Integer> number_list= new ArrayList<Integer>();
			for(int i = 0 ; i <i1.size();i++)
			{
				if(number_list.contains(i1.get(i))==true)
					continue;
				else
					number_list.add(i1.get(i));
					
			}
			int modulo_array[][] = new int[number_list.size()][number_list.size()];
			for(int i = 0 ; i < modulo_array.length;i++)
			{
				for(int j = 0 ; j < modulo_array.length;j++)
					modulo_array[i][j] = (number_list.get(i)+number_list.get(j))%value_to_check_against;
			}
			int count = 0;
			for(int i = 0 ; i <modulo_array.length;i++)
			{
				for(int j = 0; j < modulo_array.length;j++)
				{
					if(modulo_array[i][j]==0)
					{
						System.out.println("Identity element exists in the set");
						break;
					}
				}
				if(i==modulo_array.length-1)
				{
					System.out.println("Identity element does not exist in the set");
					return false;
				}
			}
			for(int i = 0; i < modulo_array.length;i++)
				for(int j = 0; j < modulo_array.length;j++)
					if(modulo_array[i][j] == number_list.get(i))
						count++;
			if(count == number_list.size())
			{
				System.out.println("Inverses exist for each unique element in the set");
				System.out.println(group_name+" is a group in "+operation+" with respect to "+value_to_check_against);
			}
			else
			{
				System.out.println("Inverses exist for each unique element in the set");
				return false;
			}
			for(int i = 0; i < modulo_array.length; ++i)
				for (int j = 0 ; j < modulo_array[0].length; ++j)
					modulo_array[i][j] = 0;
			number_list.clear();
			number_list = null;
		}
		else if(operation == '*')
		{
			ArrayList<Integer> number_list= new ArrayList<Integer>();
			for(int i = 0 ; i <i1.size();i++)
			{
				if(number_list.contains(i1.get(i))==true)
					continue;
				else
					number_list.add(i1.get(i));
					
			}
			int modulo_array[][] = new int[number_list.size()][number_list.size()];
			for(int i = 0 ; i < modulo_array.length;i++)
			{
				for(int j = 0 ; j < modulo_array.length;j++)
					modulo_array[i][j] = (number_list.get(i)*number_list.get(j))%value_to_check_against;
			}
			int count = 0;
			for(int i = 0 ; i <modulo_array.length;i++)
			{
				for(int j = 0; j < modulo_array.length;j++)
				{
					if(modulo_array[i][j]==0)
					{
						System.out.println("Identity element exists in the set");
						break;
					}
				}
				if(i==modulo_array.length-1)
				{
					System.out.println("Identity element does not exist in the set");
					return false;
				}
			}
			for(int i = 0; i < modulo_array.length;i++)
				for(int j = 0; j < modulo_array.length;j++)
					if(modulo_array[i][j] == number_list.get(i))
						count++;
			if(count == number_list.size())
			{
				System.out.println("Inverses exist for each unique element in the set");
				System.out.println(group_name+" is a group in "+operation+" with respect to "+value_to_check_against);
			}
			else
			{
				System.out.println("Inverses exist for each unique element in the set");
				return false;
			}
			for(int i = 0; i < modulo_array.length; ++i)
				for (int j = 0 ; j < modulo_array[0].length; ++j)
					modulo_array[i][j] = 0;
			number_list.clear();
			number_list = null;
		}
		if(operation == '^')
		{
			ArrayList<Integer> number_list= new ArrayList<Integer>();
			for(int i = 0 ; i <i1.size();i++)
			{
				if(number_list.contains(i1.get(i))==true)
					continue;
				else
					number_list.add(i1.get(i));
					
			}
			int modulo_array[][] = new int[number_list.size()][number_list.size()];
			for(int i = 0 ; i <modulo_array.length;i++)
				for(int j = 0; j < modulo_array.length;j++)
					modulo_array[i][j] = (int)Math.pow(number_list.get(i),number_list.get(j))%value_to_check_against;
			for(int i = 0 ; i <modulo_array.length;i++)
			{
				for(int j = 0; j < modulo_array.length;j++)
				{
					if(modulo_array[i][j]==0)
					{
						System.out.println("Identity element exists in the set");
						break;
					}
				}
				if(i == modulo_array.length-1)
				{
					System.out.println("Identity element does not exist in the set");
					return false;
				}
			}
			int count = 0;
			for(int i = 0; i < modulo_array.length;i++)
				for(int j = 0; j < modulo_array.length;j++)
					if(modulo_array[i][j] == number_list.get(i))
						count++;
			if(count == number_list.size())
			{
				System.out.println("Inverses exist for each unique element in the set");
				System.out.println(group_name+" is a group in "+operation+" with respect to "+value_to_check_against);
			}
			else
			{
				System.out.println("Inverses exist for each unique element in the set");
				return false;
			}
			for(int i = 0; i < modulo_array.length; ++i)
				for (int j = 0 ; j < modulo_array[0].length; ++j)
					modulo_array[i][j] = 0;
			number_list.clear();
			number_list = null;
		}
		return true;
	}
	/**
	 * Checks whether the array is a group with respect to modulus.
	 * @param i1 - the array to be verified.
     * @param group_name - The name the group will be called as if the array passes as a group.
     * @param value_to_check_against - value to check set's group validity against.
     * @param operation - The primary operation to apply before checking whether the array is a 
     * group or not.
     * <p> How the function will check for group validity:<br>
	 * Apply first operation on the group and then check for validity with respect to that 
	 * operation.<br>
	 * For example: if the array contains elements 1, 2, 3 in order of typing and operation is 
	 * '*' and number is 7 then, the numbers will be multiplied with each other and a table will 
	 * be constructed with the residue values with respect to modulo 7:
	 * <br>
	 * <br>
	 * *  | 1 | 2 | 3 <br>
	 * ---------------<br>
	 * 1  | 1 | 2 | 3 <br>
	 * 2  | 2 | 4 | 6 <br>
	 * 3  | 3 | 6 | 2 <br>
	 * <br>
	 * After doing so, the program will check whether the identity element is present in the table 
	 * or not.
	 * If it is, it proceeds with checking for group validity with respect to inverses for each 
	 * element.
	 * If an inverse is present for each element, then, it automatically declares the array list 
	 * as a group as addition and multiplication are associative.
	 * </p>
	 * Supported operations : +%, *%, ^ (exponentiation) %.
	 * @return a boolean value that is true if the array is a group and false otherwise. 
	 */
	boolean check_against_modulo(int i1[], char group_name, char operation, int value_to_check_against)
	{
		if(operation == '+')
		{
			ArrayList<Integer> number_list= new ArrayList<Integer>();
			for(int i = 0 ; i <i1.length;i++)
			{
				if(number_list.contains(i1[i])==true)
					continue;
				else
					number_list.add(i1[i]);
					
			}
			int modulo_array[][] = new int[number_list.size()][number_list.size()];
			for(int i = 0 ; i < modulo_array.length;i++)
			{
				for(int j = 0 ; j < modulo_array.length;j++)
					modulo_array[i][j] = (number_list.get(i)+number_list.get(j))%value_to_check_against;
			}
			int count = 0;
			for(int i = 0 ; i <modulo_array.length;i++)
			{
				for(int j = 0; j < modulo_array.length;j++)
				{
					if(modulo_array[i][j]==0)
					{
						System.out.println("Identity element exists in the set");
						break;
					}
				}
				if(i==modulo_array.length-1)
				{
					System.out.println("Identity element does not exist in the set");
					return false;
				}
			}
			for(int i = 0; i < modulo_array.length;i++)
				for(int j = 0; j < modulo_array.length;j++)
					if(modulo_array[i][j] == number_list.get(i))
						count++;
			if(count == number_list.size())
			{
				System.out.println("Inverses exist for each unique element in the set");
				System.out.println(group_name+" is a group in "+operation+" with respect to "+value_to_check_against);
			}
			else
			{
				System.out.println("Inverses exist for each unique element in the set");
				return false;
			}
			for(int i = 0; i < modulo_array.length; ++i)
				for (int j = 0 ; j < modulo_array[0].length; ++j)
					modulo_array[i][j] = 0;
			number_list.clear();
			number_list = null;
		}
		else if(operation == '*')
		{
			ArrayList<Integer> number_list= new ArrayList<Integer>();
			for(int i = 0 ; i <i1.length;i++)
			{
				if(number_list.contains(i1[i])==true)
					continue;
				else
					number_list.add(i1[i]);
					
			}
			int modulo_array[][] = new int[number_list.size()][number_list.size()];
			for(int i = 0 ; i < modulo_array.length;i++)
			{
				for(int j = 0 ; j < modulo_array.length;j++)
					modulo_array[i][j] = (number_list.get(i)*number_list.get(j))%value_to_check_against;
			}
			int count = 0;
			for(int i = 0 ; i <modulo_array.length;i++)
			{
				for(int j = 0; j < modulo_array.length;j++)
				{
					if(modulo_array[i][j]==0)
					{
						System.out.println("Identity element exists in the set");
						break;
					}
				}
				if(i==modulo_array.length-1)
				{
					System.out.println("Identity element does not exist in the set");
					return false;
				}
			}
			for(int i = 0; i < modulo_array.length;i++)
				for(int j = 0; j < modulo_array.length;j++)
					if(modulo_array[i][j] == number_list.get(i))
						count++;
			if(count == number_list.size())
			{
				System.out.println("Inverses exist for each unique element in the set");
				System.out.println(group_name+" is a group in "+operation+" with respect to "+value_to_check_against);
			}
			else
			{
				System.out.println("Inverses exist for each unique element in the set");
				return false;
			}
			for(int i = 0; i < modulo_array.length; ++i)
				for (int j = 0 ; j < modulo_array[0].length; ++j)
					modulo_array[i][j] = 0;
			number_list.clear();
			number_list = null;
		}
		if(operation == '^')
		{
			ArrayList<Integer> number_list= new ArrayList<Integer>();
			for(int i = 0 ; i <i1.length ; ++i)
			{
				if(number_list.contains(i1[i])==true)
					continue;
				else
					number_list.add(i1[i]);
					
			}
			int modulo_array[][] = new int[number_list.size()][number_list.size()];
			for(int i = 0 ; i <modulo_array.length;i++)
				for(int j = 0; j < modulo_array.length;j++)
					modulo_array[i][j] = (int)Math.pow(number_list.get(i),number_list.get(j))%value_to_check_against;
			for(int i = 0 ; i <modulo_array.length;i++)
			{
				for(int j = 0; j < modulo_array.length;j++)
				{
					if(modulo_array[i][j]==0)
					{
						System.out.println("Identity element exists in the set");
						break;
					}
				}
				if(i==modulo_array.length-1)
				{
					System.out.println("Identity element does not exist in the set");
					return false;
				}
			}
			int count = 0;
			for(int i = 0; i < modulo_array.length;i++)
				for(int j = 0; j < modulo_array.length;j++)
					if(modulo_array[i][j] == number_list.get(i))
						count++;
			if(count == number_list.size())
			{
				System.out.println("Inverses exist for each unique element in the set");
				System.out.println(group_name+" is a group in "+operation+" with respect to "+value_to_check_against);
			}
			else
			{
				System.out.println("Inverses exist for each unique element in the set");
				return false;
			}
			for(int i = 0; i < modulo_array.length; ++i)
				for (int j = 0 ; j < modulo_array[0].length; ++j)
					modulo_array[i][j] = 0;
			number_list.clear();
			number_list = null;
		}
		return true;
	}
	/**
	 * Verifies whether the array list is closed under addition
	 * @param d - the array list to check closure against.
	 * @return a boolean value that indicates whether the array list is closed under addition or 
	 * not.
	 */
	boolean verify_closure_with_respect_to_addition(ArrayList<Double> d)
	{
		boolean b = false;
		int count = 0;
		for(int i = 0 ; i < d.size();i++)
		{
			if(i == d.size()-1)
			{
				double num = d.get(i) + d.get(0);
				for(int j = 0; j<d.size();j++)
				{
					if(d.get(j) == num)
					{
						count++;
						break;
					}
					else if(j == i|| j == 0)
						continue;
				}
			}
			else {
				double num = d.get(i) + d.get(i+1);
				for(int j = 0; j<d.size();j++)
				{
					if(d.get(j) == num)
					{
						count++;
						break;
					}
					else if(j == i|| j == i+1)
						continue;
				}
			}
		}
		if(count == d.size())
		{
			System.out.println("The set is closed under addition");
			b = true;
		}
		return b;
	}
	/**
	 * Verifies whether the array list is closed under addition
	 * @param i - the array to check closure against.
	 * @return a boolean value that indicates whether the array list is closed under addition or 
	 * not.
	 */
	boolean verify_closure_with_respect_to_addition(int i[])
	{
		boolean b = false;
		int count = 0;
		for(int i1 = 0 ; i1 < i.length; i1++)
		{
			if(i1 == i.length-1)
			{
				double num = i[i1] + i[0];
				for(int j = 0; j < i.length ; ++j)
				{
					if(i[j] == num)
					{
						count++;
						break;
					}
					else if(j == i1|| j == 0)
						continue;
				}
			}
			else {
				double num = i[i1] + i[i1+1];
				for(int j = 0; j < i.length; j++)
				{
					if(i[j] == num)
					{
						count++;
						break;
					}
					else if(j == i1|| j == i1+1)
						continue;
				}
			}
		}
		if(count == i.length)
		{
			System.out.println("The set is closed under addition");
			b = true;
		}
		return b;
	}
	/**
	 * Verifies whether the array list is closed under multiplication or not.
	 * @param d - The array list whose closure with respect to multiplication is to be checked.
	 * @return a boolean value that indicates whether the array list is closed under multiplication
	 * or not.
	 */
	boolean verify_closure_with_respect_to_multiplication(ArrayList<Double> d)
	{
		boolean b = false;
		int count = 0;
		for(int i = 0 ; i < d.size();i++)
		{
			if(i == d.size()-1)
			{
				double num = d.get(i) * d.get(0);
				for(int j = 0; j<d.size();j++)
				{
					if(d.get(j) == num)
					{
						count++;
						break;
					}
					else if(j == i|| j == 0)
						continue;
				}
			}
			else {
				double num = d.get(i) * d.get(i+1);
				for(int j = 0; j<d.size();j++)
				{
					if(d.get(j) == num)
					{
						count++;
						break;
					}
					else if(j == i|| j == i+1)
						continue;
				}
			}
		}
		if(count == d.size())
		{
			System.out.println("The set is closed under multiplication");
			b = true;
		}
		count = 0;
		return b;
	}
	/**
	 * Verifies whether the array list is closed under multiplication or not.
	 * @param i - The array whose closure with respect to multiplication is to be checked.
	 * @return a boolean value that indicates whether the array list is closed under multiplication
	 * or not.
	 */
	boolean verify_closure_with_respect_to_multiplication(int i[])
	{
		boolean b = false;
		int count = 0;
		for(int i1 = 0 ; i1 < i.length; i1++)
		{
			if(i1 == i.length-1)
			{
				double num = i[i1] * i[0];
				for(int j = 0; j < i.length; j++)
				{
					if(i[j] == num)
					{
						count++;
						break;
					}
					else if(j == i1|| j == 0)
						continue;
				}
			}
			else {
				double num = i[i1] * i[i1+1];
				for(int j = 0; j < i.length; j++)
				{
					if(i[j] == num)
					{
						count++;
						break;
					}
					else if(j == i1|| j == i1+1)
						continue;
				}
			}
		}
		if(count == i.length)
		{
			System.out.println("The set is closed under multiplication");
			b = true;
		}
		count = 0;
		return b;
	}
	/**
	 * Verifies whether the array list is closed under exponentiation or not.
	 * @param d - The array list whose closure with respect to exponentiation is to be checked.
	 * @return a boolean value that indicates whether the array list is closed under exponentiation
	 *  or not.
	 */
	boolean verify_closure_with_respect_to_exponentiation(ArrayList<Double> d)
	{
		boolean b = false;
		int count = 0;
		for(int i = 0 ; i < d.size();i++)
		{
			if(i == d.size()-1)
			{
				double num = Math.pow(d.get(i), d.get(0));
				for(int j = 0; j<d.size();j++)
				{
					if(d.get(j) == num)
					{
						count++;
						break;
					}
					else if(j == i|| j == 0)
						continue;
				}
			}
			else {
				double num = Math.pow(d.get(i), d.get(i+1));
				for(int j = 0; j<d.size();j++)
				{
					if(d.get(j) == num)
					{
						count++;
						break;
					}
					else if(j == i|| j == i+1)
						continue;
				}
			}
		}
		if(count == d.size())
		{
			System.out.println("The set is closed under exponentiation");
			b = true;
		}
		count = 0;
		return b;
	}
	/**
	 * Verifies whether the array list is closed under exponentiation or not.
	 * @param i - The array whose closure with respect to exponentiation is to be checked.
	 * @return a boolean value that indicates whether the array list is closed under exponentiation 
	 * or not.
	 */
	boolean verify_closure_with_respect_to_exponentiation(int i[])
	{
		boolean b = false;
		int count = 0;
		for(int i1 = 0 ; i1 < i.length; i1++)
		{
			if(i1 == i.length-1)
			{
				double num = Math.pow(i[i1], i[0]);
				for(int j = 0; j < i.length; j++)
				{
					if(i[j] == num)
					{
						count++;
						break;
					}
					else if(j == i1|| j == 0)
						continue;
				}
			}
			else {
				double num = Math.pow(i[i1], i[i1+1]);
				for(int j = 0; j < i.length; j++)
				{
					if(i[j] == num)
					{
						count++;
						break;
					}
					else if(j == i1|| j == i1+1)
						continue;
				}
			}
		}
		if(count == i.length)
		{
			System.out.println("The set is closed under exponentiation");
			b = true;
		}
		count = 0;
		return b;
	}
	/**
	 * Verifies whether the array list is closed under modulo or not.
	 * @param d - The array list whose closure with respect to modulo is to be checked.
	 * @param modulo_value - The value to modulo the array list with.
	 * @return a boolean value that indicates whether the array list is closed under modulo or not.
	 */
	boolean verify_closure_with_respect_to_modulo(ArrayList<Integer> i1, int modulo_value)
	{
		boolean b = false;
		int count = 0;
		for(int i = 0 ; i < i1.size();i++)
		{
			if(i == i1.size()-1)
			{
				int num = i1.get(i) % modulo_value;
				for(int j = 0; j < i1.size(); j++)
				{
					if(i1.get(j) == num)
					{
						count++;
						break;
					}
					else if(j == i|| j == 0)
						continue;
				}
			}
			else {
				int num = i1.get(i) % modulo_value;
				for(int j = 0; j < i1.size(); j++)
				{
					if(i1.get(j) == num)
					{
						count++;
						break;
					}
					else if(j == i|| j == i+1)
						continue;
				}
			}
		}
		if(count == i1.size())
		{
			System.out.println("The set is closed under modulus");
			b = true;
		}
		count = 0;
		return b;
	}
	/**
	 * Verifies whether the array list is closed under modulo or not.
	 * @param i - The array whose closure with respect to modulo is to be checked.
	 * @param modulo_value - The value to modulo the array with.
	 * @return a boolean value that indicates whether the array list is closed under modulo or not.
	 */
	boolean verify_closure_with_respect_to_modulo(int i[], int modulo_value)
	{
		boolean b = false;
		int count = 0;
		for(int i1 = 0 ; i1 < i.length; i1++)
		{
			if(i1 == i.length-1)
			{
				double num = i[i1] % modulo_value;
				for(int j = 0; j < i.length; j++)
				{
					if(i[j] == num)
					{
						count++;
						break;
					}
					else if(j == i1|| j == 0)
						continue;
				}
			}
			else {
				double num = i[i1] % modulo_value;
				for(int j = 0; j < i.length; j++)
				{
					if(i[j] == num)
					{
						count++;
						break;
					}
					else if(j == i1|| j == i1+1)
						continue;
				}
			}
		}
		if(count == i.length)
		{
			System.out.println("The set is closed under modulus");
			b = true;
		}
		count = 0;
		return b;
	}
	/**
	 * Checks whether the array list is a group or not.
	 * @param d - the group to be verified.
	 * @param group_name - for labeling purposes.
	 * @param operations - operations to be performed.<br>
	 * How the function will check for group validity:<br>
	 * Applies any preliminary operation and then applies the actual operation to check for 
	 * group validity<br>
	 * ex:- +2*1 applies operation +2 on the group and then checks whether the set is a group 
	 * with respect to *1.<br>
	 * Supported operations : + * %<br>
	 * If the 2nd operation is a '%' the first operation is applied and then, applies a modulus 
	 * using the number provided..</p>
	 * @return a boolean value that is true if the array list is a group with respect to the second
	 * operation and false if it is not.
	 */
	boolean verify_whether_group(ArrayList<Double> d,char group_name,String operations)
	{
		String symbols[] = operations.split("[0-9]+");
		String numbers[] = operations.split("[+*-/%]+");
		boolean b = false;
		if(numbers.length >1 && symbols.length >1 && symbols.length == numbers.length)
		{
			double[] temp_array = new double[d.size()];
			switch(symbols[0])
			{
			case "+": for(int i = 0; i < d.size(); ++i)//Apply addition
			          {
				          double number = d.get(i);
				          number  += Double.parseDouble(numbers[0]);
				          temp_array[i] = number;
			          }
			          d.clear();
			          for (int i = 0; i < temp_array.length; ++i)
			        	  d.add(temp_array[i]);
					  break;
			case "-": for(int i = 0; i <d.size(); ++i)//Apply subtraction
			          {
		                   double number = d.get(i);
		                   number  -= Double.parseDouble(numbers[0]);
		                   temp_array[i] = number;
	                   }
			           d.clear();
			           for (int i = 0; i < temp_array.length; ++i)
			        	   d.add(temp_array[i]);
			           break;
			case "*": for(int i = 0; i < d.size(); ++i)//Apply multiplication
	                  {
		                  double number = d.get(i);
		                  number  *= Double.parseDouble(numbers[0]);
		                  temp_array[i] = number;
	                  }
				      d.clear();
				      for (int i = 0; i < temp_array.length; ++i)
				    	  d.add(temp_array[i]);
			          break;
			case "/": for(int i = 0; i < d.size(); ++i)//Apply Division
                      {
                         double number = d.get(i);
                         number  /= Double.parseDouble(numbers[0]);
                         temp_array[i] = 0;
                      }
			          d.clear();
			          for (int i = 0; i < temp_array.length; ++i)
			        	  d.add(temp_array[i]);
			          break;
			case "^": for(int i = 0; i < d.size(); ++i)//Apply Exponentiation
                      {
                         double number = d.get(i);
                         number  = Math.pow(number, Double.parseDouble(numbers[0]));
                         temp_array[i] = number;
                      }
			          break;
			case "%": for (int i = 0; i < d.size(); ++i)
			          {
				           double number = d.get(i);
				           int modulus_result = (int) number % Integer.parseInt(numbers[0]);
				           temp_array[i] = (double) modulus_result;
			          }
			          d.clear();
		              for (int i = 0; i < temp_array.length; ++i)
		            	  d.add(temp_array[i]);
		              break;
			default: System.out.println("Invalid operation");
			         break;
			}
			for (int i = 0; i < temp_array.length; ++i)
				temp_array[i] = 0;
			switch(symbols[1])
			{
			case "+": b = verify_closure_with_respect_to_addition(d);
			              if (b == true)
			            	  b = check_against_addition(d,group_name);
			          break;
			case "*": b = verify_closure_with_respect_to_multiplication(d);
			             if(b == true)
			            	 b = check_against_multiplication(d,group_name);
			          break;
			case "^": b = verify_closure_with_respect_to_exponentiation(d);
			             if(b == true)
			            	 b = check_against_exponentiation(d,group_name);
			          break;
			case "+%":
			case "*%":
			case "-%":
			case "^%": ArrayList<Integer> temp_list= new ArrayList<Integer>();
     	               for (int i = 0; i < d.size(); ++i)
     	               {
     	            	   double number = d.get(i);
     	                   int number1 = (int) number;
     		               temp_list.add(number1);
     	               }
				       b = verify_closure_with_respect_to_modulo(temp_list, Integer.parseInt(numbers[1]));
			           if (b == true)
			           {
			        	   b = check_against_modulo(temp_list, group_name, symbols[1].charAt(0), Integer.parseInt(numbers[1]));
			        	   temp_list.clear();
			        	   temp_list = null;
			           }
			           temp_list.clear();
			           temp_list = null;
			           break;
			default: System.out.println("Unsupported operation");
			         break;
			}
		}
		for(int i = 0 ; i <symbols.length;i++)
			symbols[i] = "\0";
		symbols = null;
		for(int i = 0 ; i <numbers.length; i++)
			numbers[i] = "\0";
		numbers = null;
		return b;
	}
	/**
	 * Verifies whether the subset is a subgroup or not.
	 * @param d - the group to be verified.
	 * @param group_name - for labeling purposes.
	 * @param operations - operations to be performed.
	 * How the function will check for group validity:<br>
	 * Applies any preliminary operations and then apply the operations to check for group validity
	 * with respect to that operation.<br>
	 * ex:- +2*1 applies operation +2 on the group and then checks whether the set is a group 
	 * with respect to >=1.<br>
	 * Supported operations : + * (multiplication) ^ (exponentiation) % (modulus).<br>
	 * If the 2nd operation is a '%' the first operation is applied and then, a modulus is applied 
	 * using the number provided.</p>
	 * @return a boolean value that is true if the array list is a group with respect to the second 
	 * operation and false if it is not.
	 */
	boolean verify_whether_subgroup(ArrayList<Double> d, char group_name, String operations)
	{
		boolean b = false;
		String symbols[] = operations.split("[0-9]+");
		String numbers[] = operations.split("[-+*^/%]+");
		array_list_tools alt = new array_list_tools();
		array_tools at = new array_tools();
		switch(symbols[0])
		{
		case "+": alt.apply_addition(d, Double.parseDouble(numbers[0]));
		          break;
		case "*": alt.apply_multiplication(d, Double.parseDouble(numbers[0]));
		          break;
		case "-": alt.apply_subtraction(d, Double.parseDouble(numbers[0]));
		          break;
		case "/": alt.apply_division(d, Double.parseDouble(numbers[0]));
		          break;
		case "%": int array[] = new int[d.size()];
		          for(int i = 0; i < d.size(); ++i)
		          {
		        	  double d1 = d.get(i);
		        	  array[i] = (int) d1;
		          }
		          switch(symbols[0].charAt(0))
		          {
		          case '+': at.apply_addition(array, Integer.parseInt(numbers[0]));
		                    break;
		          case '-': at.apply_subtraction(array, Integer.parseInt(numbers[0]));
		                    break;
		          case '*': at.apply_multiplication(array, Integer.parseInt(numbers[0]));
		                    break;
		          case '^': at.apply_exponentiation(array, Integer.parseInt(numbers[0]));
		                    break;
		          default: System.out.println("Unsupported operation");
		                   break;
		          }
		          at.apply_modulus(array, Integer.parseInt(numbers[0]));
		          d.clear();
		          for (int i = 0; i < array.length; ++i)
		          {
		        	  double d1 = (double) array[i];
		        	  d.add(d1);
		          }
		          break;
		default: System.out.println("Operation not supported");
		         break;
		}
		if(b == true)
		{
			switch(operations)
			{
			case "+": b = verify_closure_with_respect_to_addition(d);
			          if (b == true)
			        	  b = check_against_addition(d,group_name);
			          break;
			case "*": b = verify_closure_with_respect_to_multiplication(d);
			          if (b == true)
			        	  b = check_against_multiplication(d,group_name);
			          break;
			case "^": b = verify_closure_with_respect_to_exponentiation(d);
			          if (b == true)
			        	  b = check_against_exponentiation(d,group_name);
			          break;
			case "%": ArrayList<Integer> i1 = new ArrayList<Integer>();
			          for(int i = 0 ; i < d.size();i++)
			        	  i1.add((int)Math.round(d.get(i)));
			          b = verify_closure_with_respect_to_modulo(i1, Integer.parseInt(numbers[1]));
			          if (b == true)
			        	  b = check_against_modulo(i1, group_name, symbols[1].charAt(0), Integer.parseInt(numbers[1]));        
			          break;
			default: System.out.println("Unsupported operation");
			         break;
			}
		}
		at = null;
		return b;
	}
	/**
	 * Verfies whether Zn is a group or not.
	 * @param n - The maximum number of positive elements.
	 * @param operations - The operations to be performed on the array. <br>Leave 
	 * operations[0] as '\0' if you don't want to do any preliminary operations.
	 * @param number1 - The first number associated with the first operation.
	 * @param number2 - The second number associated with the second operation.
	 * @param group_name - The name of the group.
	 * @return A boolean value that is true if Zn is a group. False if Zn is not a group.
	 */
	public boolean verify_subgroup_for_Zn(int n, char operations[], int number1, int number2, char group_name)
	{
		int Zn[] = new int[n+1];
		for (int i = 0; i <= n; i++)
			Zn[i] = i;
		array_tools at = new array_tools();
		boolean b = false;
		if (operations[0] == '\0')
		{
			switch(operations[1])
			{
			case '+': b = verify_closure_with_respect_to_addition(Zn);
			          if(b == true)
			        	  b = check_against_addition(Zn, group_name);
			          break;
			case '*': b = verify_closure_with_respect_to_multiplication(Zn);
			             if (b == true)
			            	 b = check_against_addition(Zn, group_name);
			          break;
			case '^': b = verify_closure_with_respect_to_exponentiation(Zn);
			             if (b == true)
			            	 b = check_against_exponentiation(Zn, group_name);
			          break;
			case '%': b = verify_closure_with_respect_to_modulo(Zn, number2);
			             if (b == true)
			            	 b = check_against_modulo(Zn, group_name, operations[2], number2);
			          break;
			default: System.out.println("Unsupported operation");
			         break;
			}
		}
		else 
		{
			switch(operations[0])
			{
			case '+': at.apply_addition(Zn, number1);
			          break;
			case '*': at.apply_multiplication(Zn, number1);
			          break;
			case '^': at.apply_exponentiation(Zn, number1);
			          break;
			case '%': at.apply_modulus(Zn, number1);
			          break;
			case '-': at.apply_subtraction(Zn, number1);
			          break;
			case '/': at.apply_division(Zn, number1);
			          break;
			default: System.out.println("Unsupported operation");
			         break;
			}
			switch(operations[1])
			{
			case '+': b = verify_closure_with_respect_to_addition(Zn);
			          if (b == true)
			        	  b = check_against_addition(Zn, group_name);
			          break;
			case '*': b = verify_closure_with_respect_to_multiplication(Zn);
			          if (b == true)
			        	  b = check_against_multiplication(Zn, group_name);
			          break;
			case '^': b = verify_closure_with_respect_to_exponentiation(Zn);
			          if (b == true)
			        	  b = check_against_exponentiation(Zn, group_name);
			          break;
			case '%': b = verify_closure_with_respect_to_modulo(Zn, number2);
			          if (b == true)
			        	  b = check_against_modulo(Zn, group_name, operations[2], number2);
			          break;
			default: System.out.println("Unsupported operation");
			         break;
			}
		}
		return b;
	}
}