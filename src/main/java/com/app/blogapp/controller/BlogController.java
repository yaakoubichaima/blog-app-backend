package com.app.blogapp.controller;

import com.app.blogapp.model.Blog;
import com.app.blogapp.service.BlogService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/blogs")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/")
    public List<Blog> getAllBlogs(){
        return blogService.getAllBlogs();
    }

    @GetMapping("/{id}")
    public Blog findBlogById(@PathVariable("id") ObjectId _id){
        return blogService.findBlogById(_id) ;
    }

    @PostMapping("/")
    public Blog saveBlog(@RequestBody Blog blog){
        return blogService.saveBlog(blog);
    }

    @PutMapping("/{id}")
    public Blog updateBlog(@PathVariable("id") ObjectId _id, @RequestBody Blog blog){
        return blogService.updateBlog(_id,blog);
    }
    @DeleteMapping("/{id}")
    public void deleteBlogBygId(@PathVariable("id") ObjectId _id){
        blogService.deleteBlogById(_id);
    }

}
