package xyz.gosick.gible.trade.client;

import org.springframework.cloud.openfeign.FeignClient;
import xyz.gosick.gible.user.api.UserApi;

@FeignClient(name = "gible-user", contextId = "gible-user-api")
public interface UserClient extends UserApi {

}
