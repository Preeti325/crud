package com.api.crud.service;

import com.api.crud.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service
public class TopicService {
    private List<Topic> topicList = new ArrayList<Topic>(Arrays.asList(
            new Topic(1, "java", "spring", "springboot"),
            new Topic(2, "angular", "frontend", "developer")

    ));

    public List<Topic> getalltopics() {
        return topicList;
    }

    public Stream<Topic> gettopicbyid(Integer id) {
        return topicList.stream().filter(t -> t.getId().equals(id));
    }

    public void addtopic(Topic t) {
        topicList.add(t);

    }

    public void updatetopic(Integer id, Topic t) {
        for (int i = 0; i < topicList.size(); i++) {
            Topic n = topicList.get(i);
            if (n.getId().equals(id)) {
                topicList.set(i, t);
                return;
            }

        }

    }

	public void deletetopic(Integer id) {
        topicList.removeIf(t -> t.getId().equals(id));
    }

}
