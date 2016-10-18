package com.email;

//import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations; 
import static org.mockito.Mockito.*;

import com.email.controller.HistoryController;
import com.email.model.History;
import com.email.repository.HistoryRepository;

public class HistoryControllerTest {
	@InjectMocks
	private HistoryController hc;
	
	@Mock
	private HistoryRepository historyRepository;
	
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testShipwreckGet(){
//	mockito handles it now instead of calling the class directly
//	HistoryController hc = new HistoryController();
		
	History h = new History();
	h.setId(1L);
	when(historyRepository.findOne(1L)).thenReturn(h);
	
	History hist = hc.get(1L);
	
	verify(historyRepository).findOne(1L);
	
//	assertEquals(1L, wreck.getId().longValue());	
	assertThat(hist.getId(), is(1L));
	}
	
}
