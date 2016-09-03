/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hossam.user.dao.impl;

import com.hossam.user.dao.UserServiceDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Hossam ElDeen
 */
@Repository
public class UserServiceDaoImpl extends UserServiceDao {

    @Autowired
    public UserServiceDaoImpl(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }
}
