package xyz.gosick.gible.user.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/user")
public interface UserApi {
	@RequestMapping(method = RequestMethod.GET, value ="/{id}")
	String getById(@PathVariable("id") long id);
}
