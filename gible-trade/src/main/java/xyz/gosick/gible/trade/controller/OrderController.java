package xyz.gosick.gible.trade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.gosick.gible.trade.client.UserClient;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/trade")
public class OrderController {
	@Resource
	private UserClient userClient;

	@GetMapping("/test")
	public void test() {
		String user = userClient.getById(1);
		System.out.println(user);
	}
}
