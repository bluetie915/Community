package com.zhang.community.service;

import com.zhang.community.exception.CustomizeErrorCode;
import com.zhang.community.exception.CustomizeException;
import com.zhang.community.model.Comment;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    public void insert(Comment comment) {
        if(comment.getParentId() == null || comment.getParentId() == 0){
            throw new CustomizeException(CustomizeErrorCode.TARGET_PARAM_NOT_FOUND);
        }
    }
}
