package demo;


import javax.annotation.Resource;

/**
 * SonarDemo
 * <p>
 *    Sonar检查场景十一
 *    return的问题
 * </p>
 */
public class Demo12 {


    @Resource
    HpMapper hpMapper;

    public String getString(String name){

        String str = hpMapper.query(name);

        return str;
    }


}
