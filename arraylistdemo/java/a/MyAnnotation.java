package arraylistdemo.java.a;

import java.lang.annotation.*;
@Inherited
@Documented
@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	public String key() default "LOL";
	public String[] url();
}
