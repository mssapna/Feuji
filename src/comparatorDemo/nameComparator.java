package comparatorDemo;

import java.util.Comparator;

public class nameComparator implements Comparator<student> {
public int compare(student s1,student s2){
	return s1.getName().compareTo(s2.getName());
}
}
