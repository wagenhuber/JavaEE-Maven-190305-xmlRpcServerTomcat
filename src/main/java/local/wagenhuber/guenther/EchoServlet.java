package local.wagenhuber.guenther;

import local.wagenhuber.guenther.AbstractXmlRpcServlet;
import local.wagenhuber.guenther.Echo;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;

public class EchoServlet extends AbstractXmlRpcServlet {


    @Override
    public void addHandlers(PropertyHandlerMapping phm) throws XmlRpcException {
        phm.addHandler("echo", Echo.class);
    }
}
