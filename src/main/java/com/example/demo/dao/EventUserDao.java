package com.example.demo.dao;

import com.example.demo.common.DataNotFoundException;
import com.example.demo.entity.EventUser;
import com.example.demo.repository.EventUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EventUserDao implements BaseDao<EventUser> {
    @Autowired
    EventUserRepository repository;

    @Override
    public List<EventUser> findAll() {
        return repository.findAll();
    }

    @Override
    public EventUser findById(Integer id) throws DataNotFoundException {
        return repository.findById(id).orElseThrow(() -> new DataNotFoundException());
    }

    @Override
    public void save(EventUser eventUser) {
        this.repository.save(eventUser);
    }

    @Override
    public void deleteById(Integer id) {
        try {
            EventUser eventUser = this.findById(id);
            this.repository.deleteById(eventUser.getId());
        } catch (DataNotFoundException e) {
            System.out.println("no data");
        }
    }
}
