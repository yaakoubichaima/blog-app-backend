package com.app.blogapp.controller;

import com.app.blogapp.model.Blog;
import com.app.blogapp.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http:/ localhost:8081")
@RequestMapping("/blogs")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/")
    public List<Blog> getAllBlogs(){
        return blogService.getAllBlogs();
    }

    @GetMapping("/{id}")
    public Blog findBlogById(@PathVariable("id") int id){
        return blogService.findBlogById(id);
    }

    @PostMapping("/")
    public Blog saveBlog(@RequestBody Blog blog){
        return blogService.saveBlog(blog);
    }

    @PutMapping("/{id}")
    public Blog updateBlog(@PathVariable("id") int id, @RequestBody Blog blog){
        return blogService.updateBlog(id,blog);
    }
    @DeleteMapping("/{id}")
    public void deleteBlogBygId(@PathVariable("id") int id){
        blogService.deleteBlogById(id);
    }

}
