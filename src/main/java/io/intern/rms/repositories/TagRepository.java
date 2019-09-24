package io.intern.rms.repositories;

import io.intern.rms.domain.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {
    Iterable<Tag> findAllByTagName(String tagName);
}
