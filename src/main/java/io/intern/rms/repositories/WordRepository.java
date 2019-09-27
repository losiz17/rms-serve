package io.intern.rms.repositories;

import io.intern.rms.domain.Word2s;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends CrudRepository<Word2s, Long> {
    Iterable<Word2s> findAllByWord(String word);
}
