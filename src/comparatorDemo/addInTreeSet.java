package comparatorDemo;

import java.util.Set;
import java.util.TreeSet;

public class addInTreeSet {
	
void addByName()
{
	nameComparator comparator=new nameComparator();
	Set< student> set=new TreeSet<student>(comparator) ;
	set.add(new student("sapna", 1));
	set.add(new student("sapna", 2));
	set.add(new student("shalini", 1));
	set.add(new student("jyothi", 2));
	
	for(student o:set)
	{
		System.out.println(o);
	}
}
	void addById()
	{
		idComparator comparator=new idComparator();
		Set< student> set=new TreeSet<student>(comparator) ;
		set.add(new student("sapna", 1));
		set.add(new student("sapna", 2));
		set.add(new student("shalini", 1));
		set.add(new student("jyothi", 2));
		
		for(student o:set)
		{
			System.out.println(o);
		}
	
	
}
}
