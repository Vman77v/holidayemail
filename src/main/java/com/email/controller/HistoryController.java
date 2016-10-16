package com.email.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.email.model.History;
import com.email.repository.HistoryRepository;

@RestController
@RequestMapping("api/v1/")

public class HistoryController {
	
	@Autowired
	private HistoryRepository historyRepository;
	
	@RequestMapping(value = "histories", method = RequestMethod.GET)
	public List<History> list() {
		return historyRepository.findAll();
	}
	
	//added a second get request so I can initialize a new get on the home screen instead of the histories page
	@RequestMapping(value = "history", method = RequestMethod.GET)
	public List<History> list1() {
		return historyRepository.findAll();
	}
	
	//CRUD operations below
	
	//CREATE
	@RequestMapping(value = "histories", method = RequestMethod.POST)
	public History create(@RequestBody History history) {
		return historyRepository.saveAndFlush(history);
	}
	
	//READ
	@RequestMapping(value = "histories/{id}", method =  RequestMethod.GET)
	public History get(@PathVariable Long id) {
		return historyRepository.findOne(id);
	}
	
	//UPDATE
	@RequestMapping(value = "histories/{id}", method = RequestMethod.PUT)
	public History update(@PathVariable Long id, @RequestBody History history) {
		History existingHistory = historyRepository.findOne(id);
		BeanUtils.copyProperties(history, existingHistory);
		return historyRepository.saveAndFlush(existingHistory);
	}
	
	//DELETE
	@RequestMapping(value = "histories/{id}", method = RequestMethod.DELETE)
	public History delete(@PathVariable Long id) {
		History existingHistory = historyRepository.findOne(id);
		historyRepository.delete(existingHistory);
		return existingHistory;
	}
}
