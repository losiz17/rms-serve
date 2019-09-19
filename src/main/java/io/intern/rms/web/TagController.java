package io.intern.rms.web;

import io.intern.rms.domain.Tag;
import io.intern.rms.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TagController {
    @Autowired
    private TagService tagService;

    @PostMapping("/test")
    public Iterable<Tag> createTagList(@RequestBody Tag tag){
        return tagService.findAllTag(tag.getTagName());
    }
}
