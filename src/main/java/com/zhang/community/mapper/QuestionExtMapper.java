package com.zhang.community.mapper;

import com.zhang.community.model.Question;
import com.zhang.community.model.QuestionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface QuestionExtMapper {
    int incView(Question record);
}