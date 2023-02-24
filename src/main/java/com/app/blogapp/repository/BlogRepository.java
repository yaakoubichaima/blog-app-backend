package com.app.blogapp.repository;

import com.app.blogapp.model.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface BlogRepository extends MongoRepository<Blog, Integer> {

    Blog findBlogById(int id);

    //Blog updateBlog(int id, Blog blog);

    void deleteBlogById(int id);
}
