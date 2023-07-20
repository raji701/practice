package package2;

import java.util.HashSet;
import java.util.Set;

public class Employee {



public static void main(String []args)
{
	
	Set<Integer> set2 = new HashSet<Integer>();
	set2.add(4);
	set2.add(5);
	set2.add(6);
	
	
Set<Integer> set1 = new HashSet<Integer>();

set1.add(1);
set1.add(2);
set1.add(3);	
set1.addAll(set2);
System.out.println(set1.containsAll(set2));
System.out.println(set1);
boolean empty =set1.isEmpty();
System.out.println(empty);
set1.remove(1);
System.out.println(set1);
set1.removeAll(set2);
System.out.println(set1);
set1.removeIf(number-> number%2==0);
System.out.println(set1);
}
}
