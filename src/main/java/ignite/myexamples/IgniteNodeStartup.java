package ignite.myexamples;

import org.apache.ignite.IgniteException;
import org.apache.ignite.Ignition;

public class IgniteNodeStartup {

    public static void main(String[] args) throws IgniteException {
        Ignition.start("/Users/prachig/myexamples/config/cluster-config.xml");

    }
}