package com.lightning.testplatform.mapper;

import com.lightning.testplatform.domain.People;

/**
 * Created by mingxin on 16/8/8.
 */
//@Mapper
public interface PeopleMapper {
    People selectById(long id);

}
