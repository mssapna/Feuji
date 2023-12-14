package comparatorDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class lambdaExpression {
//void lambdaExpressionDemo()
//{
//	List list=new ArrayList<>();
//	list.add(90);
//	list.add("shreya");
//	list.add(98.78);
//	list.forEach((n)->{
//		System.out.println(n);
//	});
//}
	
//	void lambdaExpression1()
//	{
//		List<Integer> list=new ArrayList<>();
//		list.add(9);
//		list.add(89);
//		list.add(878);
//		Consumer<Integer> method=(n)->{
//			System.out.println(n);
//		};
//		list.forEach(method);
//	}
	
	
	
	void withOutlambdaExpression2()
	{
		int side=4;
		lambda_Interface interface1=new lambda_Interface() {
			
			@Override
			public void area() {
				System.out.println("the area of square is:"+side*side);
				
			}
		};
		interface1.area();
	}
	
	void withLambdaExpression()
	{
		int side=3;
		lambda_Interface interface1=()->{
			System.out.println("the area of square is:"+side*side);
		};
		interface1.area();
	}
}
