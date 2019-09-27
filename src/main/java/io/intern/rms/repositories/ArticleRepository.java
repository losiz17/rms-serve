package io.intern.rms.repositories;

import io.intern.rms.domain.Articles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArticleRepository extends JpaRepository<Articles, Long> {
    public Optional<Articles> findById(Long id);
}
