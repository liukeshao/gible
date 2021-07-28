package xyz.gosick.gible.user.service;

import org.springframework.web.bind.annotation.RestController;
import xyz.gosick.gible.user.api.UserApi;

@RestController
public class UserServiceImpl implements UserApi {


	@Override
	public String getById(long id) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "null";
	}
}
