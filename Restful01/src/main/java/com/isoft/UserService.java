package com.isoft;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * �û�����ӿ�
 * @author Ickes
 */
@Path("/restFul")
public interface UserService {
	/**
	 * ����GET���������˶�����ͨ���������ض���
	 * 
	 */
	@GET
	@Path("/get")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public User get(@QueryParam("id") String id);
	
	
	/**
	 * ����PUT���������˶�����ͨ���������ض���
	 * id��Դ��url����Ĳ���
	 * @param user
	 * @return
	 */
	@PUT
	@Path("/put/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public User put(@PathParam("id")String id,User u);
	
	
	/**
	 * ����POST���������˶�����ͨ���������ض���
	 * 
	 */
	@POST
	@Path("/post/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public User post(@PathParam("id") String id,User u);
	
	
	/**
	 * ����DELETE���� ,������ͨ���������ض���
	 */
	@DELETE
	@Path("/delete/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public User delete(@PathParam("id") String id);
	
}