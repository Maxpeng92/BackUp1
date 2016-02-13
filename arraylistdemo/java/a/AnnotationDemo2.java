package arraylistdemo.java.a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationDemo2 {

	public static void main(String[] args) throws Exception 
	{
		Class<?> cls = Class.forName("Info");
		Method toStringMethod = cls.getMethod("toString");
		Annotation ans[] = toStringMethod.getAnnotations();
		
		for (int i=0;i<ans.length;i++)
		{
			if (toStringMethod.isAnnotationPresent(MyAnnotation.class))
			{
				MyAnnotation my = null;
				my = toStringMethod.getAnnotation(MyAnnotation.class);
				String k = my.key();
				String[] u = my.url();
				System.out.println(k+": "+u);
			}
		}
	}
}
