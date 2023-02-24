package com.app.blogapp.repository;

import com.app.blogapp.model.Blog;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface BlogRepository extends MongoRepository<Blog, ObjectId> {

    Blog findBlogBy_id(ObjectId _id);

    //Blog updateBlog(int id, Blog blog);

    void deleteBlogBy_id(ObjectId _id);
}
