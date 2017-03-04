package webservice;

import javax.jws.WebService;

@WebService
public class MyHelloServer {
	public String sayHello(String name,String password,String sex,String address){
		return name+"-"+password+"-"+sex+"-"+address + " hello!";
	}
}


