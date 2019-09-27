package io.intern.rms.services;

import io.intern.rms.domain.Tag;
import io.intern.rms.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TagService {
    @Autowired
    private TagRepository tagRepository;

    public Iterable<Tag> findAllTag(String tagName){
        return tagRepository.findAllByTagName(tagName);
    }


}
