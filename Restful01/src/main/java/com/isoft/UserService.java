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
 * 用户服务接口
 * @author Ickes
 */
@Path("/restFul")
public interface UserService {
	/**
	 * 测试GET方法，传人对象、普通参数；返回对象
	 * 
	 */
	@GET
	@Path("/get")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public User get(@QueryParam("id") String id);
	
	
	/**
	 * 测试PUT方法，传人对象、普通参数；返回对象
	 * id来源于url后面的参数
	 * @param user
	 * @return
	 */
	@PUT
	@Path("/put/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public User put(@PathParam("id")String id,User u);
	
	
	/**
	 * 测试POST方法，传人对象、普通参数；返回对象
	 * 
	 */
	@POST
	@Path("/post/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public User post(@PathParam("id") String id,User u);
	
	
	/**
	 * 测试DELETE方法 ,传人普通参数；返回对象
	 */
	@DELETE
	@Path("/delete/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public User delete(@PathParam("id") String id);
	
}