package lambda;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by mingxin on 16/9/18.
 */
public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(3);
        Map<String,String> map = list.stream().sorted((x, y) -> {
            if (x > y) return 1;
            else if (x < y) return -1;
            else return 0;
        }).filter(e->e<4).collect(Collectors.toMap(e->"key"+e,e->" value"+e));
        map.forEach((k,v)->{
            System.out.println("key:"+k+"value:"+v);
        });

    }

}
