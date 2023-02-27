package com.app.blogapp.service;

import com.app.blogapp.model.Blog;
import com.app.blogapp.repository.BlogRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    public List<Blog> getAllBlogs(){
        return blogRepository.findAll();
    }

    public Blog findBlogById(ObjectId _id){
        return blogRepository.findBlogBy_id(_id);
    }

    public Blog saveBlog(Blog blog){
        return blogRepository.save(blog);
    }

    public Blog updateBlog(ObjectId _id, Blog blog){
        Blog updatedBlog= blogRepository.findBlogBy_id(_id);
        updatedBlog.setBlogTitle(blog.getBlogTitle());
        updatedBlog.setBlogAuthor(blog.getBlogAuthor());
        updatedBlog.setBlogContent(blog.getBlogContent());
        updatedBlog.setUpVotes(blog.getUpVotes());
        updatedBlog.setDownVotes(blog.getDownVotes());
        return blogRepository.save(updatedBlog);
    }
    public void deleteBlogById(ObjectId _id){
        blogRepository.deleteBlogBy_id(_id);
    }
}

