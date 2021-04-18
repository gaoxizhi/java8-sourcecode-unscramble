package site.gaox;

import java.util.ArrayList;
import java.util.List;

/**
 * <p> 小试牛刀 </p>
 *
 * @author gaox·Eric
 * @date 2021/4/19 00:06
 */
public class Test {
    public static void main(String[] args) {
        List list = new ArrayList<String>();
        list.add("handsome");
        list.add("natural");
        list.add("spirited");
        list.add("spirited man");
        list.forEach(System.out::println);
    }
}
