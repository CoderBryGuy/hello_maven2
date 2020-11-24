package bryan;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class hello_maven_world {

    private final static Logger log = LoggerFactory.getLogger(hello_maven_world.class);

    public static void main(String[] args) {
//        System.out.println("hi momma");

        log.info("Hello Info");
        log.info("Hello Debug");

    }
}
