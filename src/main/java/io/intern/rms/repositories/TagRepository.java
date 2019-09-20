package io.intern.rms.repositories;

import io.intern.rms.domain.Tag;
import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag, Long> {
    Iterable<Tag> findListByTagName(String tagName);
}
