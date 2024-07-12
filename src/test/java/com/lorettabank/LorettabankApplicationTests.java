package com.lorettabank;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
@AutoConfigureMockMvc
public class LorettabankApplicationTests {

	/*
	@Autowired
	private UserService userService;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private MockMvc mockMvc;

	@Test
	@WithMockUser(username = "user", roles = { "USER" })
	public void testProtectedEndpoint() throws Exception {
		mockMvc.perform(get("/protected"))
				.andExpect(status().isOk());
	}

	@Test
	void contextLoads() {
		// Test the context loading
	}

	@Test
	void testUserCreation() {
		User user = new User("7irelo", "password", "7irelo@gmail.com", "Eric Ncube", Collections.singleton(""));
		userService.save(user);
		User foundUser = userRepository.findByUsername("7irelo");
		assert foundUser != null;
		assert foundUser.getUsername().equals("7irelo");
	}
	*/
}
