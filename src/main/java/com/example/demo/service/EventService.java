package com.example.demo.service;

import com.example.demo.common.DataNotFoundException;
import com.example.demo.dao.BaseDao;
import com.example.demo.entity.Event;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EventService implements BaseService<Event> {
    @Autowired
    private BaseDao<Event> dao;

    @Override
    public List<Event> findAll() {
        return dao.findAll();
    }

    @Override
    public Event findById(Integer id) throws DataNotFoundException {
        return dao.findById(id);
    }

    @Override
    public void save(Event event) {
        dao.save(event);
    }

    @Override
    public void deleteById(Integer id) {
        dao.deleteById(id);
    }
}
