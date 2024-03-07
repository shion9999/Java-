package com.example.demo.service;

import com.example.demo.common.DataNotFoundException;
import com.example.demo.dao.BaseDao;
import com.example.demo.entity.Event;
import com.example.demo.entity.EventUser;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EventUserService implements BaseService<EventUser> {
    @Autowired
    private BaseDao<EventUser> dao;

    @Override
    public List<EventUser> findAll() {
        return dao.findAll();
    }

    @Override
    public EventUser findById(Integer id) throws DataNotFoundException {
        return dao.findById(id);
    }

    @Override
    public void save(EventUser eventUser) {
        dao.save(eventUser);
    }

    @Override
    public void deleteById(Integer id) {
        dao.deleteById(id);
    }
}
