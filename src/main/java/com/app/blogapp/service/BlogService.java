package com.app.blogapp.service;

import com.app.blogapp.model.Blog;
import com.app.blogapp.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    public List<Blog> getAllBlogs(){
        return blogRepository.findAll();
    }

    public Blog findBlogById(int id){
        return blogRepository.findBlogById(id);
    }

    public Blog saveBlog(Blog blog){
        return blogRepository.save(blog);
    }

    public Blog updateBlog(int id,Blog blog){
        Blog updatedBlog= blogRepository.findBlogById(id);
        updatedBlog.setBlogTitle(blog.getBlogTitle());
        updatedBlog.setBlogAuthor(blog.getBlogAuthor());
        updatedBlog.setBlogContent(blog.getBlogContent());
        return blogRepository.save(updatedBlog);
    }
    public void deleteBlogById(int id){
        blogRepository.deleteBlogById(id);
    }
}
