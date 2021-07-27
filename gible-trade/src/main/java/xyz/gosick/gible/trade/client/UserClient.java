package xyz.gosick.gible.trade.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "gible-user")
public interface UserClient {
	@RequestMapping(method = RequestMethod.GET, value ="/users/{id}")
	String getById(@PathVariable("id") long id);
}
