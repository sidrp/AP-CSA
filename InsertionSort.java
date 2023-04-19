public class InsertionSort
{
    int[] arr;
    
    public InsertionSort(int[] array)
    {
        arr = array;
    }
    
    private void swap(int j, int k)
    {
        int temp = arr[k];
        arr[k] = arr[j];
        arr[j] = temp;
    }
    
    private void move(int index)
    {
        while ((index > 0) && (arr[index - 1] > arr[index]))
        {
            swap(index - 1, index);
            index--;
        }
    }
    
    public void insertionSort()
    {
        for (int i = 1; i < arr.length; i++)
        {
            move(i);
        }
    }
    
    public String toString()
    {
        String returnedString = "";
        for (int i = 0; i < arr.length; i++)
        {
            returnedString += arr[i] + " ";
        }
        
        return returnedString;
    }
    
    public static void main(String[] args)
    {
        int[] newArr = {4, 9, 0, 1, 3, 9, 8};
        
        InsertionSort i = new InsertionSort(newArr);
        
        System.out.println(i);
        
        i.insertionSort();
        
        System.out.println(i);
    }
}