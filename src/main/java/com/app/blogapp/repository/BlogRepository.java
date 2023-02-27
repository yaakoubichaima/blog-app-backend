package com.app.blogapp.repository;

import com.app.blogapp.model.Blog;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

//@Repository
public interface BlogRepository extends MongoRepository<Blog, ObjectId> {

    Blog findBlogBy_id(ObjectId _id);

    void deleteBlogBy_id(ObjectId _id);
}
