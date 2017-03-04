package webservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import domain.Person;

	@WebService
	public class PersonServer {
	
	List<Person> pList = new ArrayList<Person>();
	
	/**
	 * �����
	 * @param person
	 */
	public List<Person> addPerson(Person person){
		pList.add(person);
		System.out.println(person.toString());
		return pList;
	}
	/**
	 * ������е���
	 * @return
	 */
	public List<Person> getPersonAll(){
		return pList;
	}
}
