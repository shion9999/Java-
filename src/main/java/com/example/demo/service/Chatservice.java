package com.example.demo.service;

import com.example.demo.common.DataNotFoundException;
import com.example.demo.dao.BaseDao;
import com.example.demo.entity.Category;
import com.example.demo.entity.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Chatservice implements BaseService<Chat> {
    @Autowired
    private BaseDao<Chat> dao;

    @Override
    public List<Chat> findAll() {
        return dao.findAll();
    }

    @Override
    public Chat findById(Integer id) throws DataNotFoundException {
        return dao.findById(id);
    }

    @Override
    public void save(Chat chat) {
        dao.save(chat);
    }

    @Override
    public void deleteById(Integer id) {
        dao.deleteById(id);
    }
}
