/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.ArrayList;

public class Arrays
{
    public static void changeEvenToEmpty(ArrayList<String> strList)
    {
        for(int i = 0; i < strList.size(); i+=2)
        {
            strList.set(i, "");
        }
        
    }
    
    
    /**
     * Creates a new array with the products of the elements of the 
     * ArrayList and array, and then the remaining elements of the longer 
     * list.
     */ 
    public static int[] getProducts(ArrayList<Integer> list, int[] arr)
    {
        int[] prodArr;
        int length = Math.max(list.size(), arr.length);
        int smallLength = Math.min(list.size(), arr.length);
        
        prodArr = new int[length];
        
        // Gets the common elements
        for (int i = 0; i < smallLength; i++)
        {
            prodArr[i] = list.get(i) * arr[i];
        }
        
        for (int k = smallLength; k < length; k++)
        {
            if (list.size() >= arr.length)
            {
                prodArr[k] = list.get(k);
            } else
            {
                prodArr[k] = arr[k];
            }
        }
        
        /*
        for (int i = 0; i < length; i++) {
            if (i < list.size() && i < arr.length) {
                prodArr[i] = list.get(i) * arr[i];
            } else if (list.size() > arr.length) {
                prodArr[i] = list.set(i);
            } else {
                prodArr[i] = arr[i];
            }
        }
        */
        
        return prodArr;
    }
    
	public static void main(String[] args) {
	    ArrayList<String> list = new ArrayList<String>();
	    list.add("Hi");
	    list.add("Hi");
	    list.add("Hi");
	    list.add("Hi");
	    list.add("Hi");
	    list.add("Hi");
	    list.add("Hi");
	    list.add("Hi");
	    System.out.print(list + "\n");
	    
	    changeEvenToEmpty(list);
	    System.out.println("List after replazing even: " + list);
	    
	    // #2
	    ArrayList<Integer> intList = new ArrayList<Integer>();
	    intList.add(4);
	    intList.add(5);
	    intList.add(6);
	    intList.add(1);
	    intList.add(0);

	    int[] intArr = {10, 3, 2, 1, 5, 45};
	    
	    int[] newArr = getProducts(intList, intArr);
	    
	    for (int i = 0; i < newArr.length; i++)
	    {
	        System.out.print(newArr[i] + ", ");
	    }
	    
	}
}
