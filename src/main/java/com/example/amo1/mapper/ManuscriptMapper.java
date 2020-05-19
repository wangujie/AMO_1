package com.example.amo1.mapper;

import com.example.amo1.model.Manuscript;
import java.util.List;

public interface ManuscriptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Manuscript record);

    Manuscript selectByPrimaryKey(Integer id);

    List<Manuscript> selectAll();

    int updateByPrimaryKey(Manuscript record);

    List<Manuscript> selectFive();

    List<Manuscript> selAll(Integer userId);

    int addLoveOne(Integer id);

    int cancelLove(Integer id);
}