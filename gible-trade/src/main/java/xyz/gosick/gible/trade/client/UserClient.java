package xyz.gosick.gible.trade.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.gosick.gible.trade.client.model.User;

@FeignClient("gible-user")
public interface UserClient {
	/**
	 *
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
	User getById(@PathVariable("id") Long id);
}
