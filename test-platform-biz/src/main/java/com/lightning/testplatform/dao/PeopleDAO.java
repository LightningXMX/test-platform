package com.lightning.testplatform.dao;

import com.lightning.testplatform.domain.People;
import com.lightning.testplatform.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by mingxin on 16/8/20.
 */
@Component
public class PeopleDAO {
    @Autowired
    PeopleMapper peopleMapper;

    public People getPeopleById(Long id) {
        return peopleMapper.selectById(id);
    }
}
