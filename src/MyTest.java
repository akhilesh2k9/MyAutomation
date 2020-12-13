import java.util.Scanner;

public class MyTest extends ParentClass {

	public static void main(String []args) {
		
		String test= new String();
		String test2= new String();
		char test3[] = null;
		Scanner sc = new Scanner(System.in);
		test=sc.nextLine();
		int l= test.length();
		int j=0;
		for(int i=l;i<=0;i--) {
		test3[j] =test.charAt(i);
			j++;
		}
		System.out.println("Input String is "+test);
		System.out.println("Reversed String is "+test3);
		test2=test3.toString();
		if(test2.equals(test)) {
			System.out.println("String is equal"+"");
			System.out.println();
		}
		else
			System.out.println("String is not equal");
		
	}
}
A
- id, name , salary

B- id, deptname, phoneno, managername

select a.id, a.name, a.salary, b.deptname, b.phoneno, b.managername 
from A a, B b where a.id=b.id  and name like '%Akhilesh%';


