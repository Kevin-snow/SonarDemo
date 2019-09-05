package demo;

import javax.annotation.Resource;


/**
 * SonarDemo
 * <p>
 *    Sonar检查场景十一
 *    业务逻辑中增加判空处理。
 * </p>
 */
public class Demo16 {

    @Resource
    HpMapper hpMapper;

    public void getPh(String name, String ph){

        Thp thp = hpMapper.query(name);

        if (thp.getPh()){

            //省略后边业务逻辑
        }


    }



}
