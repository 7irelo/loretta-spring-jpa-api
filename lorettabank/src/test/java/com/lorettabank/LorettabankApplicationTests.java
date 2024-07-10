package com.lorettabank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ActiveProfiles("test")
@SpringBootTest
@AutoConfigureMockMvc
public class LorettabankApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	@WithMockUser(username = "user", roles = { "USER" })
	public void testProtectedEndpoint() throws Exception {
		mockMvc.perform(get("/protected"))
				.andExpect(status().isOk());
	}
}
