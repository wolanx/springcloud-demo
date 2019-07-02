import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Component
public class Play {

    public static void main(String[] args) {

        Play p = new Play();
        Class<? extends Play> aClass = p.getClass();
        Annotation[] a = aClass.getAnnotations();

        try {
            Method heh = aClass.getMethod("heh");

            Object qwe = heh.invoke("qwe");

            System.out.println("qwe = " + qwe);

        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }

        for (Annotation annotation : a) {
            System.out.println("annotation = " + annotation);
        }

    }

}
