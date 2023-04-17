public class chapter3
{
    private int x;
    
    public chapter3()
    {
        x = 7;
        System.out.println("into constructor");
    }
    
    public String toString()
    {
//        return "" + x;
        return  Integer.toString(x);
    }
    
    public static void main(String[] args)
    {
        chapter3 c = new chapter3();
        System.out.println("into main " + c);

    }
}