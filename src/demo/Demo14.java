package demo;

/**
 * SonarDemo
 * <p>
 *    Sonar检查场景十一
 *    字符串拼接的场景。
 * </p>
 */
public class Demo14 {


    public static void main(String[] args) {


        /**
         * Sonar建议使用StringBuilder
         *
         *
         * 程序中使用StringBuffer的也建议换成StringBuilder,是出于性能的考虑
         */

        String str = "";

        int num = 20;
        if(num % 2 == 0){
            str = str + "," + "a";
        } else {
            str = str + "b";
        }

    }



}
