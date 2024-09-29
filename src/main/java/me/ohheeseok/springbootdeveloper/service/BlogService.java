package me.ohheeseok.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.ohheeseok.springbootdeveloper.domain.Article;
import me.ohheeseok.springbootdeveloper.dto.AddArticleRequest;
import me.ohheeseok.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService{

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}