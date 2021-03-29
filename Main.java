//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class Main
{
	public static void main ( String[] args )
	{
		//add test cases	
    IteratorRemover ir = new IteratorRemover("a b c a b c a","a");
    ir.remove();
    System.out.println(ir);
    ir.setTest("a b c d e f g h i j x x x x","x");
    ir.remove();
    System.out.println(ir);
    ir.setTest("1 2 3 4 5 6 a b c a b c","b");
    ir.remove();
    System.out.println(ir);
	}
}
