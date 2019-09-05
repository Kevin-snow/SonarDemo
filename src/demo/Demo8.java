package demo;

import java.util.*;

/**
 * SonarDemo
 * <p>
 *    Sonar检查场景八，使用集合的问题.
 *
 * </p>
 */
public class Demo8 {


    public HashMap<String , Object> getMap(String name, int code){
        HashMap<String, Object> map = new HashMap();
        return map;
    }


    public List<String> getList(){
        //
        Collection strings = new ArrayList<>();

        if (strings == null){
            // 做一些处理。
            return null;

            //return Collections.emptyList();
        }

        return null;
    }

    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        //判断list是否为空
        if (listString.size() > 0 || listString != null){
            // 做一些处理。
            //listString.isEmpty();
        }




    }




}
