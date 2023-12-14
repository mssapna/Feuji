package comparatorDemo;

import java.util.Comparator;

public class idComparator implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}

}
