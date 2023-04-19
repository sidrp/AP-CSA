public class SelectionSort
{
    private int[] a;
    
    public SelectionSort(int[] arr)
    {
        a = arr;
    }
    
    private void swap(int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    private int findMin(int[] a, int index)
    {
        int min = a[index];
        int minPos = index;
        
        for (int j = index + 1; j < a.length; j++)
            {
                if (min > a[j])
                {
                    min = a[j];
                    minPos = j;
                }
            }
            
        return minPos;
    }
    
    public void selectionSort()
    {
        int minPos;
        
        for (int i = 0; i < a.length - 1; i++)
        {
            minPos = findMin(a, i);
            
            if (i != minPos)
            {
                swap(i, minPos);
            }
        }
    }
    
    public String toString()
    {
        String returnedString = "";
        for (int i = 0; i < a.length; i++)
        {
            returnedString += a[i] + " ";
        }
        
        return returnedString;
    }
    
    public static void main(String[] args)
    {
        int[] array = {4, 5, 1, 4, 3, 9, 0};
	    
	    SelectionSort s = new SelectionSort(array);
	    
	    System.out.println(s);
	    
	    s.selectionSort();
	    
	    System.out.println(s); 
    }
}