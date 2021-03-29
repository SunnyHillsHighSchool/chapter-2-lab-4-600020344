//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemover
{
	private ArrayList<String> list;
	private String toRemove;

	public IteratorRemover(String line, String rem)
	{
    String[] words = line.split(" ");   
    list = new ArrayList<String>(Arrays.asList(words));
    toRemove = rem;
	}

	public void setTest(String line, String rem)
	{
    String[] words = line.split(" ");   
    list = new ArrayList<String>(Arrays.asList(words));
    toRemove = rem;
	}

	public void remove()
	{
    Iterator i = list.iterator();
    while (i.hasNext())
    {
      if (i.next().equals(toRemove))
        i.remove();
    }
	}

	public String toString()
	{
		return list.toString();
	}
}
