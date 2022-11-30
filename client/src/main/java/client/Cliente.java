package client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

import pkg.HelloWorld;


public class Cliente{
	public static void main(String args[]) throws MalformedURLException{
		ExampleService servicio = new ExampleService(new URL("http://localhost:8080/HelloServer-0.0.1-SNAPSHOT/HelloWorldWS?wsdl"),
		new QName("http://pkg/", "HelloWorldImplService"));
			HelloWorld variable = servicio.getinit();
			System.out.println(variable.add("Alex"));
			System.out.println(variable.addnumber(5, 7));
			System.out.println(variable.restnumber(7, 5));
			System.out.println(variable.dividenumber(10, 2));
			System.out.println(variable.multiplynumber(3, 8));	
	}
}

@WebServiceClient(targetNamespace="http://localhost:8080/", wsdlLocation="http://localhost:8080/HelloServer-0.0.1-SNAPSHOT/HelloWorldWS?wsdl", name="HelloWorldImplService")
class ExampleService extends Service {

    protected ExampleService(URL wsdlDocumentLocation, QName serviceName) {
        super(wsdlDocumentLocation, serviceName);
        // TODO Auto-generated constructor stub
    }
    
    @WebEndpoint(name = "HelloWorld")
    public HelloWorld getinit() {
    	return super.getPort(new QName("http://pkg/", "HelloWorldImplPort"), HelloWorld.class);
    }
}