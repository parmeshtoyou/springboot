package com.param.sprinbootdemo.app.controller.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topicList = new ArrayList<Topic>(Arrays.asList(
			new Topic("11", "First Topic/=]", "This is the First Topic"),
			new Topic("22", "Second Topic", "This is the Second Topic"),
			new Topic("33", "Third Topic", "This is the Third Topic")));

	public List<Topic> getAllTopics() {
		return topicList;
	}
	
	public Topic getTopic(String id) {
		return topicList.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topicList.add(topic);
	}
}
