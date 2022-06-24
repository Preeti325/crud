package com.api.crud.controller;

import com.api.crud.model.Topic;
import com.api.crud.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;


@RestController
public class Controller {
	@Autowired
	public TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> gettopic(){
		return topicService.getalltopics();
		
	}
	
	@RequestMapping("/topic/{id}")
	public Stream<Topic> gettopicname(@PathVariable  Integer id) {
		return topicService.gettopicbyid(id);
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public String addtopicbyname(@RequestBody Topic t) {
		topicService.addtopic(t);
	return "successfully added " + t.getName();
	} 	
	
	
	@RequestMapping(method = RequestMethod.PUT, value = "/update/{id}")
	public String updatetopicbyname(@PathVariable Integer id, @RequestBody Topic t) {
		topicService.updatetopic(id, t);
		return "successfully update " + t.getName();  
		
	}
	
	@RequestMapping(method= RequestMethod.DELETE, value="/delete/{id}")
	public String deltopic(@PathVariable Integer id) {
		topicService.deletetopic(id);
		return "sucessfully deleted ";
	}
	
}

