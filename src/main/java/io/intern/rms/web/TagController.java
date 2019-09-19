package io.intern.rms.web;

import io.intern.rms.domain.Tag;
import io.intern.rms.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class TagController {
    @Autowired
    private TagService tagService;

    @GetMapping("{/tagName}")
    public Iterable<Tag> getAllTags(@PathVariable String tagName){
        return tagService.findAllTag(tagName);
    }
}
