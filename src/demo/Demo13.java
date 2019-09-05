package demo;

/**
 * SonarDemo
 * <p>
 *    Sonar检查场景十一
 *    敏感词的定义
 * </p>
 */
public class Demo13 {


    public static void main(String[] args) {


        JSONObject json = new JSONObject();

        //Sonar认为定义的这个PWD是一个敏感词汇，不建议硬编码在程序里。
        json.put("PWD", "1234");



    }


}
