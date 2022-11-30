package pkg;

import javax.jws.WebService;


@WebService(endpointInterface = "pkg.HelloWorld")
public class HelloWorldImpl implements HelloWorld {


	public String add (String name) {
		return  "Welcome "+ name;
	}

	public int addnumber(int value1, int value2) {
		return value1 + value2;
	}
	
	public int restnumber(int value1, int value2) {
		return value1 - value2;
	}
	
	public int multiplynumber(int value1, int value2) {
		return value1 * value2;
	}
	
	public int dividenumber(int value1, int value2) {
		return value1 / value2;
	}
	

}