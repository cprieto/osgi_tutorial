package tutorial.example1

import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import org.osgi.framework.ServiceEvent
import org.osgi.framework.ServiceListener

class KotlinActivator: BundleActivator, ServiceListener {
    override fun serviceChanged(event: ServiceEvent?) {
        val svc_class = event?.serviceReference?.getProperty("objectClass")
        when (event?.type) {
            ServiceEvent.REGISTERED -> println("Service of type $svc_class registered.")
            ServiceEvent.UNREGISTERING -> println("Service of type $svc_class unregistered.")
            ServiceEvent.MODIFIED -> println("Service of type $svc_class modified.")
        }
    }

    override fun start(context: BundleContext?) {
        println("Hi from Kotlin (in OSGi)!")
    }

    override fun stop(context: BundleContext?) {
        println("Oh kntx.")
    }
}
