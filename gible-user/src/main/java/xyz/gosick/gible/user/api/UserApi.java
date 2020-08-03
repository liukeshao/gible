package xyz.gosick.gible.user.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xyz.gosick.gible.user.model.User;

@RestController
@RequestMapping("/api/user")
public class UserApi {

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public User getById(@PathVariable Long id) {
		var user = new User();
		user.setId(id);
		user.setAge(16);
		user.setName("Kotori");
		return user;
	}
}
