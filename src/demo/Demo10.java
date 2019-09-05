package demo;

import java.util.Date;
import java.util.logging.Logger;

/**
 * SonarDemo
 * <p>
 *    Sonar检查场景十，使用log的问题.
 * </p>
 */
public class Demo10 {

    Logger logger = Logger.getLogger(Demo10.class);

    public static void main(String[] args) {


        try {

            //省略前边的业务逻辑

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            /**
             * 此处不能直接输出到堆栈
             */
            e.printStackTrace();

            /**
             * 应该输出到日志文件
             */
            logger.info("XXXX出现异常",e);


            /**
             * 在使用Log输出日志时，不要写成下边这样，Sonar会提示要格式化。
             */
            logger.info("XXXX出现异常" + new Date());

            /**
             * 要写成下边这样.
             */
            logger.info("XXXX出现异常{}", new Date());

        }

    }

}
