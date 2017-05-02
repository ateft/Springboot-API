package com.atef.springboot.services;

import com.atef.springboot.model.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Atef on 29/04/2017.
 */
@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(new Topic("id123456", "Programming", "Programming related courses"),
            new Topic("id123457", "Front", "Front related courses"),
            new Topic("id123458", "Back", "Back related courses"));

    public List<Topic> getAll(){
        return topics;
    }

    public Optional<Topic> getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst();
    }
}
