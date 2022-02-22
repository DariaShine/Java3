package lesson7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Start {
    public static void start(Class testClass) {
        List<Method> methods = new ArrayList<>();
        Method[] testClassMethods = testClass.getDeclaredMethods();

        for (Method m: testClassMethods) {
            if(m.isAnnotationPresent(Test.class)){
                methods.add(m);
            }
        }

        methods.sort(Comparator.comparingInt((Method i) -> i.getAnnotation(Test.class).prior()).reversed());

        int countBeforeSuite = 0;
        int countAfterSuite = 0;

        for (Method m: testClassMethods) {
            if(m.isAnnotationPresent(BeforeSuite.class)){
                methods.add(0,m);
                countBeforeSuite ++;
            }
        }

        for (Method m: testClassMethods) {
            if(m.isAnnotationPresent(AfterSuite.class)){
                methods.add(m);
                countAfterSuite ++;
            }
        }

        if(countAfterSuite>1 || countBeforeSuite >1){
            throw new RuntimeException("несколько методов AfterSuite или BeforeSuite");
        }

        for (Method m: methods) {
            try {
                m.invoke(null);
            } catch ( InvocationTargetException | IllegalAccessException e){
                e.printStackTrace();
            }
        }
    }
}
