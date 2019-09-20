package io.intern.rms.web;

import io.intern.rms.domain.Tag;
import io.intern.rms.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/api/v1/tags")
public class TagController {
    @Autowired
    private TagService tagService;

    @PostMapping("/search")
    public Iterable<Tag> findTagByName(@RequestBody Tag tag){
        return tagService.findAllTag(tag.getTagName());
    }
}
