package me.ohheeseok.springbootdeveloper.repository;

import me.ohheeseok.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}