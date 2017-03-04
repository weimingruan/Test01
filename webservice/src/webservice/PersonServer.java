package webservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import domain.Person;

	@WebService
	public class PersonServer {
	
	List<Person> pList = new ArrayList<Person>();
	
	/**
	 * 添加人
	 * @param person
	 */
	public List<Person> addPerson(Person person){
		pList.add(person);
		System.out.println(person.toString());
		return pList;
	}
	/**
	 * 获得所有的人
	 * @return
	 */
	public List<Person> getPersonAll(){
		return pList;
	}
}
