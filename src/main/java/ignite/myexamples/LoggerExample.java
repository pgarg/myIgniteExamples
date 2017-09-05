package ignite.myexamples;

import org.apache.ignite.*;

public class LoggerExample {

    public static void main(String[] args) throws IgniteException {
        try (Ignite ignite = Ignition.start("/Users/prachig/logger-example/config/cluster-config.xml")) {
            ignite.log().info("Info Message 1 Logged !!!");
            ignite.log().info("Info Message 2 Logged !!!");

            System.out.println(ignite.log().getClass());
        }
    }
}
