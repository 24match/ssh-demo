package com.liang.dao;

import com.liang.model.UserEntity;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.io.Serializable;

/**
 * @Author
 * @Date
 */
public class UserDao extends HibernateDaoSupport {

    public UserEntity getUser(int id) {
        return this.getHibernateTemplate().get(UserEntity.class, id);
    }

    public Serializable saveUser(UserEntity userEntity) {
        userEntity.setName("admin");
        userEntity.setPassword("admin");
        userEntity.setRemark("Test!");
        return this.getSession().save(userEntity);

    }

}
