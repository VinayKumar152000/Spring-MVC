package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.User;
import payload.UserPayload;
import services.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

	private UserService userService;

	@PostMapping
	public User addUser(@RequestBody UserPayload user) {
		return userService.addUser(user);
	}
}
