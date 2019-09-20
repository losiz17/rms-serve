package io.intern.rms.services;

import io.intern.rms.domain.Tag;
import io.intern.rms.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TagService {
    @Autowired
    private TagRepository tagRepository;

    public Iterable<Tag> findListByTagName(String tagName){
        return tagRepository.findListByTagName(tagName);
    }

    @PostConstruct
    public void init() {

        Tag d1 = new Tag("Java");
        tagRepository.save(d1);

        Tag d2 = new Tag("Python");
        tagRepository.save(d2);

        Tag d3 = new Tag("Go");
        tagRepository.save(d3);
    }

}
