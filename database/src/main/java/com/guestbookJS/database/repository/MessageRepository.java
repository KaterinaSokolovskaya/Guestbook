package com.guestbookJS.database.repository;

import com.guestbookJS.database.model.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Integer> {

    List<Message> findAll();

    Message save(Message message);
}
