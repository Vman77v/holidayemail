package com.email;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.email.model.History;
import com.email.repository.HistoryRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class HistoryRepositoryIntegrationTest {
	
	@Autowired
	private HistoryRepository historyRepository;
	
	@Test
	public void testFindAll(){
		List<History> hist = historyRepository.findAll();
		//hamcrest below
		assertThat(hist.size(), is(greaterThanOrEqualTo(0)));
	}


}
