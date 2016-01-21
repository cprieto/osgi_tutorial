package tutorial.sample1

import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext

public class Activator : BundleActivator {
    override fun start(context: BundleContext?) {
        println("Starting to listen for service events and stuff.")
    }

    override fun stop(context: BundleContext?) {
        println("Stopped listening for service events and stuff.")
    }
}