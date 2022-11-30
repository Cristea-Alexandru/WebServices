package pkg;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.WebParam;

@WebService
public interface HelloWorld {
	@WebMethod
	public int addnumber(@WebParam(name = "value1") int value1, @WebParam(name = "value2") int value2);
	
	@WebMethod
	public int restnumber(@WebParam(name = "value1") int value1, @WebParam(name = "value2") int value2);

	@WebMethod
	public int multiplynumber(@WebParam(name = "value1") int value1, @WebParam(name = "value2") int value2);
	
	@WebMethod
	public int dividenumber(@WebParam(name = "value1") int value1, @WebParam(name = "value2") int value2);
	
	@WebMethod
	public String add(@WebParam(name = "name") String name);

}
