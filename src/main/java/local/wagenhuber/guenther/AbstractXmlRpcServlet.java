package local.wagenhuber.guenther;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.XmlRpcServletServer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class AbstractXmlRpcServlet extends HttpServlet {

    private XmlRpcServletServer server;

    public final void init(ServletConfig config) throws ServletException {
        super.init(config);

        try {
            PropertyHandlerMapping phm = new PropertyHandlerMapping();
            addHandlers(phm);
            server = new XmlRpcServletServer();
            server.setHandlerMapping(phm);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public abstract void addHandlers(PropertyHandlerMapping phm) throws XmlRpcException;

    public final void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        server.execute(request,response);
    }

}
