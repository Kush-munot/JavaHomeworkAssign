
public class GenericMethodTest
{   
   public static < E > void printArray( E[] inputArray )
   {
            for ( E element : inputArray )
           {        
                        System.out.printf( "%s ", element );
            }
         System.out.println();
    }
}