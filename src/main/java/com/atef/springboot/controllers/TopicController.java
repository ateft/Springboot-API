package com.atef.springboot.controllers;

import com.atef.springboot.model.Topic;
import com.atef.springboot.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * Created by Atef on 29/04/2017.
 */
@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAll();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        Optional<Topic> topicOpt = topicService.getTopic(id);
        if(topicOpt.isPresent()){
            return topicOpt.get();
        } else {
            return null;
        }
    }
}
