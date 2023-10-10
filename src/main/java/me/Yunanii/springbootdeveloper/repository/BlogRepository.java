package me.Yunanii.springbootdeveloper.repository;

import me.Yunanii.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
