package mathematics;

/**
 * A class that contains methods to transform matrices.
 * @author K. Tarun Kumar Reddy.
 */
class matrix_transformation_tools{
	/**
	 * A method to transpose a 2D matrix of double type.
	 * @param d - the matrix to transpose.
	 * @return The transposed version of the array.
	 */
    public double[][] transpose_2D_matrix_of_double_type(double d[][]) //Transposes a 2D double matrix
    {
    	int size[] = new int[2];
    	size[0] = d.length;//row
    	size[1] = d[0].length;//column
    	double new_array[][] = new double[size[1]][size[0]];
    	for(int i =0; i < size[0];++i)
    		for(int j=0; j < size[1];++j)
    			new_array[j][i] = d[i][j];
    	return new_array;
    }
    /**
     * A method to transpose a 2D matrix of long type.
     * @param d - The matrix to transpose.
     * @return The transposed version of the array.
     */
    public long[][] transpose_2D_long(long d[][]) //Transposes a 2D long matrix
    {
    	int size[] = new int[2];
    	size[0] = d.length;//row
    	size[1] = d[0].length;//column
    	long new_array[][] = new long[size[1]][size[0]];
    	for(int i =0; i < size[0];++i)
    		for(int j=0; j < size[1];++j)
    			new_array[j][i] = d[i][j];
    	return new_array;
    }
    /**
     * A method to transpose a 2D array of int type.
     * @param d - The matrix to transpose.
     * @return The transposed version of the array.
     */
    public int[][] transpose_2D_int(int d[][]) //Transposes a 2D Integer matrix
    {
    	int size[] = new int[2];
    	size[0] = d.length;//row
    	size[1] = d[0].length;//column
    	int new_array[][] = new int[size[1]][size[0]];
    	for(int i =0; i < size[0];++i)
    		for(int j=0; j < size[1];++j)
    			new_array[j][i] = d[i][j];
    	return new_array;
    }
    /**
     * A method to transpose a 2D array consisting of strings.
     * @param d - The matrix to transpose.
     * @return The transposed version of the matrix.
     */
    public String[][] transpose_2D_String(String d[][]) //Transposes a 2D String matrix
    {
    	int size[] = new int[2];
    	size[0] = d.length;//row
    	size[1] = d[0].length;//column
    	String new_array[][] = new String[size[1]][size[0]];
    	for(int i =0; i < size[0];++i)
    		for(int j=0; j < size[1];++j)
    			new_array[j][i] = d[i][j];
    	return new_array;
    }
    /**
     * A method to transpose a 2D array of float type.
     * @param d - The matrix to transpose.
     * @return The transposed version of the matrix.
     */
    public float[][] transpose_2D_float(float d[][]) //Transposes a 2D float matrix (Haven't tested)
    {
    	int size[] = new int[2];
    	size[0] = d.length;//row
    	size[1] = d[0].length;//column
    	float new_array[][] = new float[size[1]][size[0]];
    	for(int i =0; i < size[0];++i)
    		for(int j=0; j < size[1];++j)
    			new_array[j][i] = d[i][j];
    	return new_array;
    }
}
/**
 * A class to calculate new matrices by using matrix multiplication and the like.
 * @author K. Tarun Kumar Reddy.
 */
class new_matrix_calculation_tools{
	/**
	 * A method to perform matrix multiplication.
	 * @param matrix1 - The first matrix.
	 * @param matrix2 - The second matrix.
	 * @return The product matrix
	 */
	public double [][] matrix_multiplication(int matrix1[][], int matrix2[][])
    {
    	if(matrix1[0].length != matrix2.length)
    		System.out.println("Number of columns in the first matrix is not equal to the number of rows in the second matrix");
    	else {
    		double result[][] = new double[matrix1.length][matrix2[0].length];
    		for (int i = 0; i < matrix1.length;i++)
        		for (int j = 0 ; j < matrix2[0].length;j++)
        			for (int k = 0; k < matrix2.length;k++)
        				result[i][j] = result[i][j]+(matrix1[i][k]*matrix2[k][j]);
    		return result;
    	}
    	return null;
    }
}
/**
 * A class for applying applying addition, multiplication, subtraction, 
 * division, modulus on 1D arrays.
 * @author ktkr
 */
class array_tools{
	/**
	 * Adds a number to the array's elements.
	 * @param i - The array to whose elements are to be increased.
	 * @param value_to_add_with - The number with which the array's elements are to be added 
	 * with.
	 */
	public void apply_addition(int i[], int value_to_add_with)
	{
		for (int i1 = 0; i1 < i.length; ++i1)
			i[i1] = i[i1] + value_to_add_with;
	}
	/**
	 * Multiplies an array's elements with a number.
	 * @param i - The array whose elements are to be multiplied.
	 * @param value_to_multiply_with - The number with which the array's elements will be
	 * multiplied with.
	 */
	public void apply_multiplication(int i[], int value_to_multiply_with)
	{
		for (int i1 = 0; i1 < i.length; ++i1)
			i[i1] = i[i1] * value_to_multiply_with;
	}
	/**
	 * Subtracts from the array's elements by a number.
	 * @param i - The array whose elements are to be subtracted.
	 * @param value_to_subtract_from - The value that is to be subtracted from 
	 * the array's elements.
	 */
	public void apply_subtraction(int i[], int value_to_subtract_from)
	{
		for (int i1 = 0 ; i1 < i.length; ++i1)
			i[i1] = i[i1] - value_to_subtract_from;
	}
	/**
	 * Divides elements of an array by a number.
	 * @param i - The array whose elements are to be divided.
	 * @param value_to_divide_with - The divisor.
	 * @return A new array of double type that contains the quotients.
	 */
	public double[] apply_division(int i[], int value_to_divide_with)
	{
		double new_array[] = new double[i.length];
		for (int i1 = 0; i1 < i.length; ++i1)
			new_array[i1] = i[i1]/value_to_divide_with;
		return new_array;
	}
	/**
	 * Raises the elements of an array by a number.
	 * @param i - The array whose elements are to be raised.
	 * @param value_of_exponent - The power.
	 * @return A new array of double type that contains the results of the exponentiation.
	 */
	public double[] apply_exponentiation(int i[], double value_of_exponent)
	{
		double new_array[] = new double[i.length];
		for (int i1 = 0; i1 < i.length; ++i1)
		{
			double number = (double) i[i1];
			new_array[i1] = Math.pow(number, value_of_exponent);
		}
		return new_array;
	}
	/**
	 * Raises the elements of an array by a number.
	 * @param i - The array whose elements are to be raised.
	 * @param value_of_exponent - The power.
	 * @return A new array of double type that contains the results of the exponentiation.
	 */
	public double[] apply_exponentiation(int i[], int value_of_exponent)
	{
		double new_array[] = new double[i.length];
		for (int i1 = 0; i1 < i.length; ++i1)
		{
			double number = (double) i[i1];
			new_array[i1] = Math.pow(number, value_of_exponent);
		}
		return new_array;
	}
	/**
	 * Applies a modulus to the elements of an array.
	 * @param i - The array whose elements are to be moduloed.
	 * @param value_of_modulus - The value of the modulus.
	 */
	public void apply_modulus(int i[], int value_of_modulus)
	{
		for (int i1 = 0; i1 < i.length; ++i1)
			i[i1] = i[i1] % value_of_modulus;
	}
	/**
	 * Adds a number to the elements of an array.
	 * @param d - The array whose elements are to be increased.
	 * @param value_to_add_with - The value with which the array's elements are going to be
	 * added with.
	 */
	public void apply_addition(double d[], int value_to_add_with)
	{
		for (int i = 0; i < d.length; ++i)
			d[i] = d[i] + value_to_add_with;
	}
	/**
	 * Multiplies an array's elements with a number.
	 * @param d - The array whose elements are to be multiplied.
	 * @param value_to_multiply_with - The value with which the array's elements will be
	 * multiplied with.
	 */
	public void apply_multiplication(double d[], int value_to_multiply_with)
	{
		for (int i = 0; i < d.length; ++i)
			d[i] = d[i] * value_to_multiply_with;
	}
	/**
	 * Subtracts a value from the array's elements.
	 * @param d - The array whose elements are to be multiplied.
	 * @param value_to_subtract_from - The value to subtract from the array's elements.
	 */
	public void apply_subtraction(double d[], int value_to_subtract_from)
	{
		for (int i = 0 ; i < d.length; ++i)
			d[i] = d[i] - value_to_subtract_from;
	}
	/**
	 * Divides the elements of an array.
	 * @param d - The array whose elements are to be divided.
	 * @param value_to_divide_with - The divisor.
	 */
	public void apply_division(double d[], int value_to_divide_with)
	{
		for (int i = 0; i < d.length; ++i)
			d[i] = d[i]/value_to_divide_with;
	}
	/**
	 * Raises the elements of an array by a number.
	 * @param d - The array whose elements are to be raised.
	 * @param value_of_exponent - The value of the exponent.
	 */
	public void apply_exponentiation(double d[], double value_of_exponent)
	{
		for (int i = 0; i < d.length; ++i)
			d[i] = Math.pow(d[i], value_of_exponent);
	}
	/**
	 * Adds a number to the elements of an array.
	 * @param d - The array whose elements are to be increased.
	 * @param value_to_add_with - The value with which the array's elements are going to be
	 * added with.
	 */
	public void apply_addition(double d[], double value_to_add_with)
	{
		for (int i = 0; i < d.length; ++i)
			d[i] = d[i] + value_to_add_with;
	}
	/**
	 * Multiplies an array's elements with a number.
	 * @param d - The array whose elements are to be multiplied.
	 * @param value_to_multiply_with - The value with which the array's elements will be
	 * multiplied with.
	 */
	public void apply_multiplication(double d[], double value_to_multiply_with)
	{
		for (int i = 0; i < d.length; ++i)
			d[i] = d[i] * value_to_multiply_with;
	}
	/**
	 * Subtracts a value from the array's elements.
	 * @param d - The array whose elements are to be multiplied.
	 * @param value_to_subtract_from - The value to subtract from the array's elements.
	 */
	public void apply_subtraction(double d[], double value_to_subtract_from)
	{
		for (int i = 0 ; i < d.length; ++i)
			d[i] = d[i] - value_to_subtract_from;
	}
	/**
	 * Divides the elements of an array.
	 * @param d - The array whose elements are to be divided.
	 * @param value_to_divide_with - The divisor.
	 */
	public void apply_division(double d[], double value_to_divide_with)
	{
		for (int i = 0; i < d.length; ++i)
			d[i] = d[i]/value_to_divide_with;
	}
	/**
	 * Adds the elements of an array with a number.
	 * @param d - The array whose elements are to be increased.
	 * @param value_to_add_with - The value to add the array's elements with.
	 */
	public void apply_addition(double d[], float value_to_add_with)
	{
		for (int i = 0; i < d.length; ++i)
			d[i] = d[i] + value_to_add_with;
	}
	/**
	 * Multiplies the elements of an array.
	 * @param d - The array whose elements are to be multiplied.
	 * @param value_to_multiply_with - The value that is to be used to multiply the elements of
	 * the array by.
	 */
	public void apply_multiplication(double d[], float value_to_multiply_with)
	{
		for (int i = 0; i < d.length; ++i)
			d[i] = d[i] * value_to_multiply_with;
	}
	/**
	 * Subtracts from the elements of an array.
	 * @param d - The array whose elements are to be subtracted.
	 * @param value_to_subtract_from - The value that is to be subtracted from 
	 * the array's elements.
	 */
	public void apply_subtraction(double d[], float value_to_subtract_from)
	{
		for (int i = 0 ; i < d.length; ++i)
			d[i] = d[i] - value_to_subtract_from;
	}
	/**
	 * Divides the elements of an array by a number.
	 * @param d - The array whose elements are to be divided by.
	 * @param value_to_divide_with - The value to divide the elements of the array with.
	 */
	public void apply_division(double d[], float value_to_divide_with)
	{
		for (int i = 0; i < d.length; ++i)
			d[i] = d[i]/value_to_divide_with;
	}
	/**
	 * Raises the elements of an array by a number.
	 * @param d - The array whose elements are to be raised.
	 * @param value_of_exponent - The value of the exponent.
	 */
	public void apply_exponentiation(double d[], float value_of_exponent)
	{
		for (int i = 0; i < d.length; ++i)
			d[i] = Math.pow(d[i], value_of_exponent);
	}
	/**
	 * Adds the elements of an array by a number.
	 * @param f - The array whose elements are to be increased.
	 * @param value_to_add_with - The value to increase by.
	 */
	public void apply_addition(float f[], float value_to_add_with)
	{
		for (int i = 0; i < f.length; ++i)
			f[i] = f[i] + value_to_add_with;
	}
	/**
	 * Applies multiplication on the elements of an array.
	 * @param f - The array whose elements are to be multiplied by.
	 * @param value_to_multiply_with - The multiplier.
	 */
	public void apply_multiplication(float f[], float value_to_multiply_with)
	{
		for (int i = 0; i < f.length; ++i)
			f[i] = f[i] * value_to_multiply_with;
	}
	/**
	 * Subtracts from the elements of an array.
	 * @param f - The array whose elements are to be subtracted.
	 * @param value_to_subtract_from - The value that is to be subtracted from 
	 * the array's elements.
	 */
	public void apply_subtraction(float f[], float value_to_subtract_from)
	{
		for (int i = 0 ; i < f.length; ++i)
			f[i] = f[i] - value_to_subtract_from;
	}
	/**
	 * Divides the elements of an array by a number.
	 * @param f - The array whose elements are to be divided by.
	 * @param value_to_divide_with - The value to divide the elements of the array with.
	 */
	public void apply_division(float f[], float value_to_divide_with)
	{
		for (int i = 0; i < f.length; ++i)
			f[i] = f[i]/value_to_divide_with;
	}
	/**
	 * Raises the elements of an array by a number.
	 * @param f - The array whose elements are to be raised.
	 * @param value_of_exponent - The value of the exponent.
	 */
	public void apply_exponentiation(float f[], float value_of_exponent)
	{
		for (int i = 0; i < f.length; ++i)
		{
			double d = (double) f[i];
			f[i] = (float) Math.pow(d, value_of_exponent);
		}
	}
	/**
	 * Adds the elements of an array by a number.
	 * @param l - The array whose elements are to be increased.
	 * @param value_to_add_with - The value to increase by.
	 */
	public void apply_addition(long l[], int value_to_add_with)
	{
		for (int i = 0; i < l.length; ++i)
			l[i] = l[i] + value_to_add_with;
	}
	/**
	 * Applies multiplication on the elements of an array.
	 * @param l - The array whose elements are to be multiplied by.
	 * @param value_to_multiply_with - The multiplier.
	 */
	public void apply_multiplication(long l[], int value_to_multiply_with)
	{
		for (int i = 0; i < l.length; ++i)
			l[i] = l[i] * value_to_multiply_with;
	}
	/**
	 * Subtracts from the elements of an array.
	 * @param l - The array whose elements are to be subtracted.
	 * @param value_to_subtract_from - The value that is to be subtracted from 
	 * the array's elements.
	 */
	public void apply_subtraction(long l[], int value_to_subtract_from)
	{
		for (int i = 0 ; i < l.length; ++i)
			l[i] = l[i] - value_to_subtract_from;
	}
	/**
	 * Divides the elements of an array by a number.
	 * @param l - The array whose elements are to be divided by.
	 * @param value_to_divide_with - The value to divide the elements of the array with.
	 */
	public void apply_division(long l[], int value_to_divide_with)
	{
		for (int i = 0; i < l.length; ++i)
			l[i] = l[i]/value_to_divide_with;
	}
	/**
	 * Raises the elements of an array by a number.
	 * @param l - The array whose elements are to be raised.
	 * @param value_of_exponent - The value of the exponent.
	 */
	public void apply_exponentiation(long l[], int value_of_exponent)
	{
		for (int i = 0; i < l.length; ++i)
		{
			double d = (double) l[i];
			l[i] = (long) Math.pow(d, value_of_exponent);
		}
	}
	/**
	 * Applies modulus on the elements of an array.
	 * @param l - The array whose elements are to be moduloed.
	 * @param value_of_modulus - The value of the modulus.
	 */
	public void apply_modulus(long l[], int value_of_modulus)
	{
		for (int i = 0; i < l.length; ++i)
			l[i] = l[i] % value_of_modulus;
	}
	/**
	 * Adds the elements of an array with a number. 
	 * @param l - The array whose elements are to be increased.
	 * @param value_to_add_with - The value to increase by.
	 */
	public void apply_addition(long l[], long value_to_add_with)
	{
		for (int i = 0; i < l.length; ++i)
			l[i] = l[i] + value_to_add_with;
	}
	/**
	 * Applies multiplication on the elements of an array.
	 * @param l - The array whose elements are to be multiplied by.
	 * @param value_to_multiply_with - The multiplier.
	 */
	public void apply_multiplication(long l[], long value_to_multiply_with)
	{
		for (int i = 0; i < l.length; ++i)
			l[i] = l[i] * value_to_multiply_with;
	}
	/**
	 * Subtracts from the elements of an array.
	 * @param l - The array whose elements are to be subtracted.
	 * @param value_to_subtract_from - The value that is to be subtracted from 
	 * the array's elements.
	 */
	public void apply_subtraction(long l[], long value_to_subtract_from)
	{
		for (int i = 0 ; i < l.length; ++i)
			l[i] = l[i] - value_to_subtract_from;
	}
	/**
	 * Divides the elements of an array by a number.
	 * @param l - The array whose elements are to be divided by.
	 * @param value_to_divide_with - The value to divide the elements of the array with.
	 */
	public void apply_division(long l[], long value_to_divide_with)
	{
		for (int i = 0; i < l.length; ++i)
			l[i] = l[i]/value_to_divide_with;
	}
	/**
	 * Raises the elements of an array by a number.
	 * @param l - The array whose elements are to be raised.
	 * @param value_of_exponent - The value of the exponent.
	 */
	public void apply_exponentiation(long l[], long value_of_exponent)
	{
		for (int i = 0; i < l.length; ++i)
		{
			double d = (double) l[i];
			l[i] = (long) Math.pow(d, value_of_exponent);
		}
	}
	/**
	 * Applies modulus on the elements of an array.
	 * @param l - The array whose elements are to be moduloed.
	 * @param value_of_modulus - The value of the modulus.
	 */
	public void apply_modulus(long l[], long value_of_modulus)
	{
		for (int i = 0; i < l.length; ++i)
			l[i] = l[i] % value_of_modulus;
	}
}