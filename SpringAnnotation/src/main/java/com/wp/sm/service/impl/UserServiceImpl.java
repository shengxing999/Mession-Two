package com.wp.sm.service.impl;

import com.wp.sm.beans.User;
import com.wp.sm.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Service;

import java.util.List;
//@Service
public class UserServiceImpl extends SqlSessionDaoSupport implements UserService {
    @Override
    public int insertUser(User user) throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        int insert = sqlSession.insert("test.insertUser", user);
        return insert;
    }

    @Override
    public boolean updateUser(User user) throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        int update = sqlSession.update("test.updateUser", user);
        return update > 0;
    }

    @Override
    public boolean deleteUser(int id) throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        int del = sqlSession.delete("test.deleteUser", id);
        return del > 0;
    }

    @Override
    public User selectUserById(int id) throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        User user = sqlSession.selectOne("test.selectUserById", id);
        return user;
    }

    @Override
    public List<User> selectAllUser() throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        List<User> user = sqlSession.selectList("test.selectAllUser");
        return user;
    }

    @Override
    public String selectUserByName(User user) throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        String link = sqlSession.selectOne("test.selectUserByName", user);
        return link;
    }
}
