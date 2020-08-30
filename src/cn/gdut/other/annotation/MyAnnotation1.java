package cn.gdut.other.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName MyAnnotation1
 * @Desctiption TODO
 * @Date 2020/7/4 19:48
 */
@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation1 {

    String studentName() default "";

    int age() default 0;

    String[] schools() default {"清华大学", "北京大学"};
}














