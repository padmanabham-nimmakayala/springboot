package com.infotech.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infotech.topic.Topic;


@RestController
public class TopicController {
	
	
	@RequestMapping("/hyd")
	public List<Topic> getAllTopics() {
		return Arrays.asList(

		new Topic("spring"	,"spring framework"	,"spring framework description"	),
		new Topic("java"	,"java framework"	,"java framework description"),
		new Topic("javascript"	,"javascript"	,"java script description"	)			
				);
	
}
}