/* 
 * TO DO:- 1) Make a working implementation of quick sort that takes a user defined number as the pivot element and partitions and sorts the set if the number was found in the set.
 */
package mathematics;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;



/**
 * A class that creates a binary tree node.
 * @author k. tarun kumar reddy.
 */
class binary_tree_node{
	int data;
	String symbol;
	binary_tree_node left,right,prev;
}

/**
 * A class implementing the binary tree data sturcture.
 * @author k. tarun kumar reddy.
 */
class binary_tree{
	Scanner in = new Scanner(System.in);
	public binary_tree_node create_root(String symbol, int data)
	{
		binary_tree_node root = new binary_tree_node();
		root.symbol = symbol;
		root.data = data;
		root.left = root.right = root.prev = null;
		return root;
	}
	public void insert (binary_tree_node root)
	{
		binary_tree_node prev, cur;
		cur = root;
	}
}

/**
 * A class containing tools for calculating things.
 * @author k. tarun kumar reddy.
 */
class calculation_tools{
	/*
	 * To format the number to include decimal places only when showing the number if the number is 
	 * a float or double data type.
	 */
    DecimalFormat df = new DecimalFormat("#.##");
    /**
     * Computes the sigmoid gradient of a number.
     * @param d - the value to be normalized
     * @return the sigmoid gradient of the number.
     */
    public float sigmoid_gradient(double d)
    {
    	float f = sigmoid(d)*(1-sigmoid(d));
    	return f;
    }
    /**
     * Computes the sigmoid gradient of a number.
     * @param d - the value to be normalized
     * @return the sigmoid gradient of the number.
     */
    public float sigmoid_gradient(float d)
    {
    	float f = sigmoid(d)*(1-sigmoid(d));
    	return f;
    }
    /**
     * Computes the sigmoid gradient of a number.
     * @param d - the value to be normalized
     * @return the sigmoid gradient of the number.
     */
    public float sigmoid_gradient(long d)
    {
    	float f = sigmoid(d)*(1-sigmoid(d));
    	return f;
    }
    /**
     * Computes the factorial of a number.
     * @param number - the value whose factorial is to be computed.
     * <p> The number limit for this function is 31 after which all it gives is zeroes.</p>
     * @return the factorial of the number.
     */
	public int factorial(int number) throws WillCauseOverflowException // limit - 31
    {
		int number1 = 1;
		if (number > 31)
			throw new WillCauseOverflowException();
        for(int i = 2; i <= number; ++i)
            number1 = number1 * i;
        return number1;
    }
	/**
     * Computes the factorial of a number.
     * @param number - the value whose factorial is to be computed.
     * <p> Creates negative integers sporadically after 31 till 65 after which, all it gives is 0s.
     * </p>
     * @return the factorial of the number.
     */
	public long factorial(long number) throws WillCauseOverflowException
	{
		long number1 = 1;
		if (number > 65)
			throw new WillCauseOverflowException();
		for (long l = 1; l <= number; ++l)
			number1 = number1*l;
		return number1;
	}
	/**
	 * Computes the sigmoid of a number and additionally normalizes the number within sigmoid limits.
	 * @param x - the value whose sigmoid is to be computed.
	 * @return the sigmoid of the number.
	 */
    public float sigmoid(double x)//Sigmoid function for double values
    {
        float res = (float) (1/(1 + Math.pow(Math.E, -x)));
        String s1 = df.format(res);
        res = Float.parseFloat(s1);
        return res;
    }
    /**
	 * Computes the sigmoid of a number and additionally normalizes the number within sigmoid limits.
	 * @param x - the value whose sigmoid is to be computed.
	 * @return the sigmoid of the number.
	 */
    public float sigmoid(float x)//Sigmoid function for float values
    {
        float res = (float) (1/(1 + Math.pow(Math.E, -x)));
        String s1 = df.format(res);
        res = Float.parseFloat(s1);
        return res;
    }
    /**
	 * Computes the sigmoid of a number and additionally normalizes the number within sigmoid limits.
	 * @param x - the value whose sigmoid is to be computed.
	 * @return the sigmoid of the number.
	 */
    public float sigmoid(long x)//Sigmoid function for long values
    {
        float res = (float) (1/(1 + Math.pow(Math.E, -x)));
        String s1 = df.format(res);
        res = Float.parseFloat(s1);
        return res;
    }
    /**
	 * Computes the sigmoid of a number and additionally normalizes the number within sigmoid limits.
	 * @param x - the value whose sigmoid is to be computed.
	 * @return the sigmoid of the number.
	 */
    public float sigmoid (int x)
    {
    	float res = (float) (1/(1 + Math.pow(Math.E, -x)));
    	String s = df.format(res);
    	res = Float.parseFloat(s);
    	return res;
    }
    /**
     * Solves the expression given as a parameter to the function and returns the result with respect to the value of the variable. Currently is limited to a single variable.
     * @param expression - the expression to be solved.
     * @param point - the value to be given as input to the expression.
     * @return the resultant value after solving the expression.
     */
    double get_x0(String expression,double point)//for a one variable equation (Incomplete)
    {
    	double res = 0;
    	return res;
    }
}

/**
 * A class containing tools that can be used in conjunction with array lists.
 * @author k. tarun kumar reddy.
 */
class array_list_tools{
	/**
	 * Applies addition on an array list.
	 * @param d - the array list to apply addition on. 
	 * @param value_to_add - the value to add to the array list.
	 */
	void apply_addition (ArrayList<Double>d , double value_to_add)
	{
		for(int i = 0; i <d.size();i++)
		{
			double number = d.get(i);
			number  += value_to_add;
			d.remove(i);
			d.add(i, number);
		}
	}
	/** 
	 * Applies subtraction on each member of the array list.
	 * @param d - the array list to apply subtraction on. 
	 * @param value_to_add - the value to subtract from each of the elements in the array list.
	 */
	void apply_subtraction (ArrayList<Double>d , double value_to_subtract)
	{
		for(int i = 0; i <d.size();i++)
		{
			double number = d.get(i);
			number  -= value_to_subtract;
			d.remove(i);
			d.add(i, number);
		}
	}
	/** 
	 * Applies multiplication on each member of the array list.
	 * @param d - the array list to apply multiplication on. 
	 * @param value_to_add - the value to multiply the elements of the array list with.
	 */
	void apply_multiplication (ArrayList<Double>d , double value_to_multiply)
	{
		for(int i = 0; i <d.size();i++)
		{
			double number = d.get(i);
			number  *= value_to_multiply;
			d.remove(i);
			d.add(i, number);
		}
	}
	/** 
	 * Applies division on each member of the array list.
	 * @param d - the array list to apply division on. 
	 * @param value_to_add - the value to divide each member of the array list with.
	 */
	void apply_division (ArrayList<Double>d , double value_to_divide)
	{
		for(int i = 0; i <d.size();i++)
		{
			double number = d.get(i);
			number  /= value_to_divide;
			d.remove(i);
			d.add(i, number);
		}
	}
	/**
	 * Applies exponentiation on each member of the array list.
	 * @param d - the array list to apply multiplication on. 
	 * @param value_to_add - the value to subtract from the array list.
	 */
	void apply_exponentiation(ArrayList<Double>d , double exponent)
	{
		for(int i = 0; i <d.size();i++)
		{
			double number = d.get(i);
			number  = Math.pow(number, exponent);
			d.remove(i);
			d.add(i, number);
		}
	}
	/**
	 * Applies modulus on each member of the array list.
	 * @param i1 the array list containing the members to reduce using modulus.
	 * @param value_to_mod_against the value that will be used to reduce the value of the members of the array list or the number with which the 
	 */
	void apply_modulus(ArrayList<Integer>i1 ,int value_to_mod_against)
	{
		for(int i = 0; i <i1.size();i++)
		{
			int number = i1.get(i);
			number  %= value_to_mod_against;
			i1.remove(i);
			i1.add(i, number);
		}
	}
	/**
	 * Applies a condition on the array list and returns a subset in the form of an array list of corresponding type.
	 * @param set - the list of numbers to get the subset from.
	 * @param condition - the condition with which the subset will be created. Supported conditions: <, >, =. <=, >=, !.
	 * @param number - the number the condition is accompanied with.
	 * @return the array list subset with the condition applied.
	 * <p>For example: <7 will return a subset containing all the numbers less than 7 in the array list with the same datatype as the input array.</p>
     */
	public ArrayList<Integer> get_integer_subset(int[] set, String condition, int number)
    {
    	ArrayList<Integer> subset = new ArrayList<Integer>();
    	switch(condition)
    	{
    	case "<": for(int i = 0;i<set.length;i++)
    	         {
    		       if(set[i]<number)
				      subset.add(set[i]);
    	         }
    	         break;
    	case ">": for(int i = 0;i<set.length;i++)
                 {
	                if(set[i]>number)
		               subset.add(set[i]);
                 }
                 break;
    	case "=": for(int i = 0; i < set.length; ++i)
    	          {
    		           if(set[i] == number)
    		        	subset.add(set[i]);   
    	          }
    	          break;
    	case "<=": for(int i = 0; i < set.length; ++i)
                  {
	                  if(set[i] <= number)
	        	        subset.add(set[i]);   
                  }
                  break;
    	case ">=": for(int i = 0; i < set.length; ++i)
                   {
                        if(set[i] >= number)
  	                       subset.add(set[i]);   
                   }
                   break;
    	case "!": for(int i = 0; i < set.length; ++i)
                  {
                       if(set[i] == number)
  	                      subset.add(set[i]);   
                  }
                  break;
        default: System.out.println("Operation unsupported");
    	}
    	return subset;
    }
	/** 
	 * Applies a condition on the array list and returns a subset in the form of an array list of corresponding type.
	 * @param set - the list of numbers to get the subset from.
	 * @param condition - the condition with which the subset will be created. Supported conditions: <, >, =. <=, >=, !.
	 * @param number - the number the condition is accompanied with.
	 * @return the array list subset with the condition applied.
	 * <p>For example: <7 will return a subset containing all the numbers less than 7 in the array list with the same datatype as the input array.</p>
     */
	public ArrayList<Double> get_double_subset(double[] set, String condition, double number)
    {
    	ArrayList<Double> subset = new ArrayList<Double>();
    	switch(condition)
    	{
    	case "<": for(int i = 0;i<set.length;i++)
    	         {
    		       if(set[i]<number)
				      subset.add(set[i]);
    	         }
    	         break;
    	case ">": for(int i = 0;i<set.length;i++)
                 {
	                if(set[i]>number)
		               subset.add(set[i]);
                 }
                 break;
    	case "=": for(int i = 0; i < set.length; ++i)
    	          {
    		           if(set[i] == number)
    		        	subset.add(set[i]);   
    	          }
    	          break;
    	case "<=": for(int i = 0; i < set.length; ++i)
                  {
	                  if(set[i] <= number)
	        	        subset.add(set[i]);   
                  }
                  break;
    	case ">=": for(int i = 0; i < set.length; ++i)
                   {
                        if(set[i] >= number)
  	                       subset.add(set[i]);   
                   }
                   break;
    	case "!": for(int i = 0; i < set.length; ++i)
                  {
                       if(set[i] == number)
  	                      subset.add(set[i]);   
                  }
                  break;
        default: System.out.println("Operation unsupported");
    	}
    	return subset;
    }
	/** 
	 * Applies a condition on the array list and returns a subset in the form of an array list of corresponding type.
	 * @param set - the list of numbers to get the subset from.
	 * @param condition - the condition with which the subset will be created. Supported conditions: <, >, =. <=, >=, !.
	 * @param number - the number the condition is accompanied with.
	 * @return the array list subset with the condition applied.
	 * <p>For example: <7 will return a subset containing all the numbers less than 7 in the array list.</p>
     */
	public ArrayList<Float> get_float_subset(float[] set, String condition, float number)
    {
    	ArrayList<Float> subset = new ArrayList<Float>();
    	switch(condition)
    	{
    	case "<": for(int i = 0;i<set.length;i++)
    	         {
    		       if(set[i]<number)
				      subset.add(set[i]);
    	         }
    	         break;
    	case ">": for(int i = 0;i<set.length;i++)
                 {
	                if(set[i]>number)
		               subset.add(set[i]);
                 }
                 break;
    	case "=": for(int i = 0; i < set.length; ++i)
    	          {
    		           if(set[i] == number)
    		        	subset.add(set[i]);   
    	          }
    	          break;
    	case "<=": for(int i = 0; i < set.length; ++i)
                  {
	                  if(set[i] <= number)
	        	        subset.add(set[i]);   
                  }
                  break;
    	case ">=": for(int i = 0; i < set.length; ++i)
                   {
                        if(set[i] >= number)
  	                       subset.add(set[i]);   
                   }
                   break;
    	case "!": for(int i = 0; i < set.length; ++i)
                  {
                       if(set[i] == number)
  	                      subset.add(set[i]);   
                  }
                  break;
        default: System.out.println("Operation unsupported");
    	}
    	return subset;
    }
	/** 
	 * Applies a condition on the array list and returns a subset in the form of an array list of corresponding type.
	 * @param set - the list of numbers to get the subset from.
	 * @param condition - the condition with which the subset will be created. Supported conditions: <, >, =. <=, >=, !.
	 * @param number - the number the condition is accompanied with.
	 * @return the array list subset with the condition applied.
	 * <p>For example: <7 will return a subset containing all the numbers less than 7 in the array list with the same datatype as the input array.</p>
     */
	public ArrayList<Long> get_long_subset(long[] set, String condition, long number)
    {
    	ArrayList<Long> subset = new ArrayList<Long>();
    	switch(condition)
    	{
    	case "<": for(int i = 0;i<set.length;i++)
    	         {
    		       if(set[i]<number)
				      subset.add(set[i]);
    	         }
    	         break;
    	case ">": for(int i = 0;i<set.length;i++)
                 {
	                if(set[i]>number)
		               subset.add(set[i]);
                 }
                 break;
    	case "=": for(int i = 0; i < set.length; ++i)
    	          {
    		           if(set[i] == number)
    		        	subset.add(set[i]);   
    	          }
    	          break;
    	case "<=": for(int i = 0; i < set.length; ++i)
                  {
	                  if(set[i] <= number)
	        	        subset.add(set[i]);   
                  }
                  break;
    	case ">=": for(int i = 0; i < set.length; ++i)
                   {
                        if(set[i] >= number)
  	                       subset.add(set[i]);   
                   }
                   break;
    	case "!": for(int i = 0; i < set.length; ++i)
                  {
                       if(set[i] == number)
  	                      subset.add(set[i]);   
                  }
                  break;
        default: System.out.println("Operation unsupported");
    	}
    	return subset;
    }
}
/**
 * A class that implements sorting algorithms with respect to various types of objects.
 * @author k.tarun kumar reddy.
 *
 */
class sorting_algorithms{
	/**
	 * Partitions the array according to the quick sort algorithm.
	 * @param array - the array on whom partitioning is to be performed.
	 * @param low - the starting index.
	 * @param high - end index.
	 * @param pivot - the pivot element.
	 * @return index of smaller element.
	 */
	private int partition(double array[], int low, int high, double pivot)
	{
		double temp = 0;
		int index = low;
		for(int i = index; i <= high; ++i)
		{
			if(array[i] < pivot)
			{
			    index++;
				temp = array[index];
				array[index] = array[i];
				array[i] = temp;
			}
		}
		temp = array[index];
		array[index] = array[high];
		array[high] = temp;
		temp = 0;
		return (index);
	}
	/**
	 * Implements quick sort for an array of double datatypes.
	 * @param array - the array to sort.
	 * @param low - starting index.
	 * @param high - end index.
	 * @param pivot - the number around which the array will be sorted.
	 * @param pivot_index - the index of the pivot element in the array.
	 */
	public void quick_sort(double[]array, int low, int high, double pivot, int pivot_index)//Untested
	{
		if(low < high)
		{
			int partition_index = partition(array,low,pivot_index,pivot);
			quick_sort(array,low,partition_index-1,pivot,pivot_index);
			quick_sort(array,partition_index+1,high,pivot,pivot_index);
		}
	}
	public int[] quick_sort;
	/**
	 * Implements quick sort for an array list of double datatypes.
	 * @param d - the array list to sort.
	 * @param start - the first index number of the array. Please initialize it to 1 as I am considering a 1-indexed array.
	 * @param end - the length of the array.
	 * @param pivot - the number around which the array is going to sorted.
	 * @return a sorted array list containing double datatypes.
	 */
	public ArrayList<Double> quick_sort_array_list(ArrayList<Double>d,int start,int end,double pivot)
	{
		
		return d;
	}
}
/**
 * A class that implements search algorithms and various transformations to the encapsulated object array.
 * @author k.tarun kumar reddy.
 */
class search_algorithms{
	Object object_array[] = new Object[2];
	/**
	 * Implements linear search for an integer array.
	 * @param array - the array where the number is to be searched in. 
	 * @param element_to_find - the element to look for in the array.
	 * @return an object array with the following format:
	 * <ul>
	 * <li> index 0: the index in the array where the number was found. This number is filled with the number that is 1 more than the length of the array if the number was not found.</li>
	 * <li> index 1: a boolean value indicating whether the number was found or not.</li>
	 * </ul>
	 */
	public Object[] linear_search(int array[], int element_to_find)
	{
		for(int i=0; i<array.length;++i)
		{
			if(array[i] == element_to_find)
			{
				Integer index = i;
				object_array[0] = index;
				object_array[1] = true;
			}
			else if(object_array[1] == null && i == array.length-1) 
			{
				object_array[0] = array.length+1;
				object_array[1] = false;
			}
		}
		return object_array;
	}
	/**
	 * Implements linear search for an integer array.
	 * @param array - the array where the number is to be searched in. 
	 * @param element_to_find - the element to look for in the array.
	 * @return an object array with the following format:
	 * <ul>
	 * <li> index 0: the index in the array where the number was found. This number is filled with the number that is 1 more than the length of the array if the number was not found.</li>
	 * <li> index 1: a boolean value indicating whether the number was found or not.</li>
	 * </ul>
	 */
	public Object[] linear_search(double array[], double element_to_find)
	{
		for(int i=0; i<array.length; ++i)
		{
			if(array[i] == element_to_find)
			{
				object_array[0] = i;
				object_array[1] = true;
			}
			else if(object_array[1] == null && i == array.length-1) 
			{
				object_array[0] = array.length+1;
				object_array[1] = false;
			}
		}
		return object_array;
	}
	/**
	 * Clears the object array encapsulated in the class.
	 */
	public void clear_object_array()
	{
		object_array[0] = 0;
		object_array[0] = null;
		object_array[1] = null;
	}
	/**
	 * Implements binary search for an integer array.
	 * @param array - the array where the number is to be searched in. 
	 * @param element_to_search_for - the element to look for in the array.
	 * @return an object array with the following format:
	 * <ul>
	 * <li> index 0: the index in the array where the number was found. This number is filled with the number that is 1 more than the length of the array if the number was not found.</li>
	 * <li> index 1: a boolean value indicating whether the number was found or not.</li>
	 * </ul>
	 */
	/*public Object[] binary_search(int array[], int element_to_search_for)
	{
		int start_point=0,end_point=array.length-1, mid_point;
		sorting_algorithms soa = new sorting_algorithms();
		double double_array[] = new double[array.length];
		for(int i=0; i < array.length; ++i)
			double_array[i] = (double) array[i];
		soa.quick_sort(double_array, array[Math.toIntExact(Math.round(end_point/2))]);
		while(start_point!=end_point)
		{
			mid_point = Math.toIntExact(Math.round((start_point+end_point)/2));
			if (double_array[mid_point]==element_to_search_for)
			{
				object_array[0] = mid_point;
				object_array[1] = true;
				return object_array;
			}
			else if(element_to_search_for < array[(int)mid_point])
				start_point = mid_point+1;
			else if(element_to_search_for < array[(int)mid_point])
				start_point = mid_point-1;
		}
		object_array[0] = array.length+1;
		object_array[1] = false;
		soa = null;
		return object_array;
	}*/
	/**
	 * Implements binary search for an integer array.
	 * @param array - the array where the number is to be searched in. 
	 * @param element_to_search_for - the element to look for in the array.
	 * @return an object array with the following format:
	 * <ul>
	 * <li> index 0: the index in the array where the number was found. This number is filled with the number that is 1 more than the length of the array if the number was not found.</li>
	 * <li> index 1: a boolean value indicating whether the number was found or not.</li>
	 * </ul>
	 */
	/*public Object[] binary_search(double array[], double element_to_search_for)
	{
		int start_point=0,end_point=array.length-1, mid_point;
		sorting_algorithms soa = new sorting_algorithms();
		soa.quick_sort(array, array[Math.toIntExact(Math.round(end_point/2))]);
		while(start_point!=end_point)
		{
			mid_point = Math.toIntExact(Math.round((start_point+end_point)/2));
			if (array[mid_point]==element_to_search_for)
			{
				object_array[0] = mid_point;
				object_array[1] = true;
				return object_array;
			}
			else if(element_to_search_for < array[mid_point])
				start_point = mid_point+1;
			else if(element_to_search_for < array[mid_point])
				start_point = mid_point-1;
		}
		soa = null;
		return object_array;
	}*/
}
class miscellaneous{
	double array[];
	sorting_algorithms soa = new sorting_algorithms();
	/**
	 * Finds the least number among the numbers in the array.
	 * @param array_list - the unsorted array in which the minimum is to be found
	 * @return the least number in the array after sorting.
	 */
	/*double find_min_number(ArrayList<Double> array_list)
	{
		double min;
		array = new double[array_list.size()];
		for (long l = 0; l < array.length; ++l)
			array[(int)l] = array_list.get((int)l);
		soa.quick_sort(array, array[Math.round(array.length/2)]);
		min = array[0];
		for (long l = 1; l < array.length; ++l)
		{
			if(min > array[(int)l])
				min = array[(int)l];
		}
		for (int i = 0; i < array.length;++i)
			array[i] = 0;
		array = null;
		return min;
	}*/
	/**
	 * Finds the biggest number among the numbers in an unsorted array.
	 * @param array_list - the unsorted array in which the minimum is to be found
	 * @return the biggest number in the array after sorting.
	 */
	/*double find_max_number(ArrayList<Double> array_list)
	{
		array = new double[array_list.size()];
		for(int i = 0; i < array_list.size(); ++i)
			array[i] = array_list.get(i);
		soa.quick_sort(array, array[Math.round(array.length/2)]);
		double max = array[array.length-1];
		for (int i = 0; i < array.length; ++i)
			array[i] = 0;
		return max;
	}*/
	/**
	 * Converts a number into it's binary equivalent with fractions not representing the actual fraction.
	 * @param number - the number whose binary equivalent is to be found.
	 * @return an approximate binary equivalent if the number consists of a fractional part or an exact representation if the number dosen't have a fractional part.
	 */
	public String convert_number_to_binary(long number)
	{
		String s = "";
		double fractional_part = number - Math.floor(number);
		if(fractional_part > 0&& Float.isFinite((float)fractional_part)==true)
		{
			long num = (long)Math.floor(number);
			s+= Long.toBinaryString(num);
			String temp = Double.toString(fractional_part);
			int number_of_decimal_places = temp.length()-2;
			for(int i = 0; i < number_of_decimal_places;i++)
				fractional_part *= 10;
			num = (long)fractional_part;
			s+="."+Long.toBinaryString(num);
		}
		else
		{
			long num = (long)Math.floor(number);
			s+= Long.toBinaryString(num);
		}
		return s;
	}
}