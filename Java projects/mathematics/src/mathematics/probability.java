/*
 * TO DO:- 1) Test the functions.
 */
package mathematics;

import java.util.Scanner;
import java.util.ArrayList;

public class probability{
	Scanner in = new Scanner(System.in);
	array_list_tools a = new array_list_tools();
	/**
	 * Calculates the probability of an event occurring but only with respect to numbers and 
	 * with respect to a given set of numbers.
	 * @param set - array containing the numbers on which the function is going to operate on.
	 * Supported operations: < > <= >= = !
	 * @return the probability of the event occurring with the supplied condition.
	 */
	public float vanilla_probability(int set[]) //Computes P(A)
	{
		System.out.print("What condition do you want to check against?: ");
    	String condition = in.nextLine();
		System.out.print("What number do you want to check against?: ");
    	int number = in.nextInt();
		float result = 0;
    	ArrayList<Integer> i  = a.get_integer_subset(set, condition, number);
    	result = (float) i.size()/set.length;
		i.clear();
		i = null;
    	return result;
	}
	/**
	 * Calculates the probability of an event occurring but only with respect to numbers 
	 * and with respect to a given set of numbers.
	 * @param set - array containing the numbers on which the function is going to operate on.
	 * Supported operations: < > <= >= = !
	 * @return the probability of the event occurring with the supplied condition.
	 */
	public float vanilla_probability(double set[]) //Computes P(A)
	{
		System.out.print("What condition do you want to check against?: ");
    	String condition = in.nextLine();
		System.out.print("What number do you want to check against?: ");
    	double number = in.nextDouble();
		float result = 0;
    	ArrayList<Double> d  = a.get_double_subset(set, condition, number);
    	result = (float) d.size()/set.length;
		d.clear();
		d = null;
		return result;
	}
	/**
	 * Calculates the probability of an event occurring but only with respect to numbers 
	 * and with respect to a given set of numbers.
	 * @param set - array containing the numbers on which the function is going to operate on.
	 * Supported operations: < > <= >= = !
	 * @return the probability of the event occurring with the supplied condition.
	 */
	public float vanilla_probability(float set[]) //Computes P(A)
	{
		System.out.print("What condition do you want to check against?: ");
    	String condition = in.nextLine();
		System.out.print("What number do you want to check against?: ");
    	float result = 0;
		float number = in.nextFloat();
		ArrayList<Float> f  = a.get_float_subset(set, condition, number);
    	result = (float) f.size()/set.length;
		f.clear();
		f = null;
		return result;
	}
	/**
	 * Calculates the probability of an event occurring but only with respect to numbers 
	 * and with respect to a given set of numbers.
	 * @param set - array containing the numbers on which the function is going to operate on.
	 * Supported operations: < > <= >= = !
	 * @return the probability of the event occurring with the supplied condition.
	 */
	public float vanilla_probability(long set[]) //Computes P(A)
	{
		System.out.print("What condition do you want to check against?: ");
    	String condition = in.nextLine();
		System.out.print("What number do you want to check against?: ");
    	float result = 0;
		long number = in.nextLong();
		ArrayList<Long> l  = a.get_long_subset(set, condition, number);
    	result = (float) l.size()/set.length;
		l.clear();
		l = null;
		return result;
	}
	/**
	 * Calculates conditional probability with respect to a single set.
	 * @param set - the array containing all the outcomes.
	 * @return a float value that represents P(A|B).
	 */
	public float conditional_probability(int set[])
	{	
		float result = 0;
		System.out.print("What is the first condition you want to check against?: ");
		String condition = in.nextLine();
		System.out.print("What is the first number you want to check against?: ");
		int number = in.nextInt();
		ArrayList<Integer> first_list = a.get_integer_subset(set, condition, number);
		int array[] = new int[first_list.size()];
		for(int i = 0; i < first_list.size(); ++i)
			array[i] = first_list.get(i);
		first_list.clear();
		System.out.print("What is the second condition you want to check against?: ");
		condition = in.nextLine();
		System.out.print("What is the second number you want to check against?: ");
		number = in.nextInt();
		first_list = a.get_integer_subset(array, condition, number);
		ArrayList<Integer> second_list = a.get_integer_subset(set, condition, number);
		result = (first_list.size()/set.length)/(second_list.size()/set.length); //P(A intersection B)/P(B)
		first_list.clear();
		first_list = null;
		second_list.clear();
		second_list = null;
		number = 0;
		for(int i = 0 ; i < array.length; ++i)
			array[i] = 0;
		array = null;
		return result;
	}
	/**
	 * Calculates conditional probability with respect to a single set.
	 * @param set - the array containing all the outcomes.
	 * @return a float value that represents P(A|B).
	 */
	public float conditional_probability(double set[])
	{	
		float result = 0;
		System.out.print("What is the first condition you want to check against?: ");
		String condition = in.nextLine();
		System.out.print("What is the first number you want to check against?: ");
		int number = in.nextInt();
		ArrayList<Double> first_list = a.get_double_subset(set, condition, number);
		double array[] = new double[first_list.size()];
		for(int i = 0; i < first_list.size(); ++i)
			array[i] = first_list.get(i);
		first_list.clear();
		System.out.print("What is the second condition you want to check against?: ");
		condition = in.nextLine();
		System.out.print("What is the second number you want to check against?: ");
		number = in.nextInt();
		first_list = a.get_double_subset(array, condition, number);
		ArrayList<Double> second_list = a.get_double_subset(set, condition, number);
		result = (first_list.size()/set.length)/(second_list.size()/set.length); //P(A intersection B)/P(B)
		first_list.clear();
		first_list = null;
		second_list.clear();
		second_list = null;
		number = 0;
		for(int i = 0 ; i < array.length; ++i)
			array[i] = 0;
		array = null;
		return result;
	}
	/**
	 * Calculates conditional probability with respect to a single set.
	 * @param set - the array containing all the outcomes.
	 * @return a float value that represents P(A|B).
	 */
	public float conditional_probability(long set[])
	{	
		float result = 0;
		System.out.print("What is the first condition you want to check against?: ");
		String condition = in.nextLine();
		System.out.print("What is the first number you want to check against?: ");
		int number = in.nextInt();
		ArrayList<Long> first_list = a.get_long_subset(set, condition, number);
		long array[] = new long[first_list.size()];
		for(int i = 0; i < first_list.size(); ++i)
			array[i] = first_list.get(i);
		first_list.clear();
		System.out.print("What is the second condition you want to check against?: ");
		condition = in.nextLine();
		System.out.print("What is the second number you want to check against?: ");
		number = in.nextInt();
		first_list = a.get_long_subset(array, condition, number);
		ArrayList<Long> second_list = a.get_long_subset(set, condition, number);
		result = (first_list.size()/set.length)/(second_list.size()/set.length); //P(A intersection B)/P(B)
		first_list.clear();
		first_list = null;
		second_list.clear();
		second_list = null;
		number = 0;
		for(int i = 0 ; i < array.length; ++i)
			array[i] = 0;
		array = null;
		return result;
	}
	/**
	 * Calculates conditional probability with respect to a single set.
	 * @param set - the array containing all the outcomes.
	 * @return a float value that represents P(A|B).
	 */
	public float conditional_probability(float set[])
	{	
		float result = 0;
		System.out.print("What is the first condition you want to check against?: ");
		String condition = in.nextLine();
		System.out.print("What is the first number you want to check against?: ");
		int number = in.nextInt();
		ArrayList<Float> first_list = a.get_float_subset(set, condition, number);
		float array[] = new float[first_list.size()];
		for(int i = 0; i < first_list.size(); ++i)
			array[i] = first_list.get(i);
		first_list.clear();
		in.nextLine();
		System.out.println("What is the second condition you want to check against?: ");
		condition = in.nextLine();
		System.out.println("What is the second number you want to check against?: ");
		number = in.nextInt();
		first_list = a.get_float_subset(array, condition, number);
		ArrayList<Float> second_list = a.get_float_subset(set, condition, number);
		result = (first_list.size()/set.length)/(second_list.size()/set.length); //P(A intersection B)/P(B)
		first_list.clear();
		first_list = null;
		second_list.clear();
		second_list = null;
		number = 0;
		for(int i = 0 ; i < array.length; ++i)
			array[i] = 0;
		array = null;
		return result;
	}
	/**
	 * Calculates P(B|A) with respect to a single set.
	 * @param set - the array containing all the outcomes.
	 * @return a float value that represents P(B|A) after calculating the probability using baye's theorem.
	 */
	public float bayes_theorem(int[] set)
	{
		float P_A = vanilla_probability(set); //P(A)
		in.nextLine();
		float P_B = vanilla_probability(set); //P(B)
		in.nextLine();
		float P_B_given_A = conditional_probability(set); //P(B|A)
    	return ((P_B_given_A*P_A)/P_B);//Returns P(A|B)
	}
	public void release_class_resources()
	{
		in.close();
		a = null;
	}
}