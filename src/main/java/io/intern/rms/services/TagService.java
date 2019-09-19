package io.intern.rms.services;

import io.intern.rms.domain.Tag;
import io.intern.rms.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class TagService {
    @Autowired
    private TagRepository tagRepository;

    public Iterable<Tag> findAllTag(String tagName){
        return tagRepository.findAllByTagName(tagName);
    }

    @PostConstruct
    public void init() {
        Tag d1 = new Tag();
        d1.setTagName("Java");
        tagRepository.save(d1);

        Tag d2 = new Tag();
        d2.setTagName("Python");
        tagRepository.save(d2);

        Tag d3 = new Tag();
        d1.setTagName("Ruby");
        tagRepository.save(d3);
    }

}
