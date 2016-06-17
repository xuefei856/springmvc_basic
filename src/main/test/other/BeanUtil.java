package other;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1q on 2016/5/10.
 */
public class BeanUtil {
    public static void main(String args[]) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {

        List list = new ArrayList<>();
        list = null;
        if (list.size()>0) {
            System.out.println("abc");
        }
    }

    public void abc() {
        System.out.println(new BeanUtil());
        System.out.println(this);
    }
}
