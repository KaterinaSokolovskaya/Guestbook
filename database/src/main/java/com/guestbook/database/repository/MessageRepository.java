package com.guestbook.database.repository;

import com.guestbook.database.model.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Integer> {

    List<Message> findAll();

    Message save(Message message);
}
