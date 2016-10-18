package com.email;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
@WebIntegrationTest
public class HistoryControllerWebIntegrationTest {
	@Test
	public void testListAll() throws IOException{
		//rest template programmatically call apis
		RestTemplate restTemplate = new TestRestTemplate();
		//move to application properties or point to test environment
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/api/v1/histories", String.class);
		
		//get the 200 okay back
		assertThat( response.getStatusCode(), equalTo(HttpStatus.OK));
		
		//convert response to json object and perform assertions on json makes sense
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode reponseJson = objectMapper.readTree(response.getBody());
		
		//should be an empty array since there is no histories in the database
		assertThat( reponseJson.isMissingNode(), is(false));
//		assertThat( reponseJson.toString(), equalTo("[]"));
		
		//test will fail if you have something saved in the history page since it is looking for a blank string
		
	}

	
}
