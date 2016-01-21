package tutorial.example1;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Hey, I am active now.");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Ok, I am out.");
    }
}
