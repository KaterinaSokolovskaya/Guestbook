package com.guestbookJS.service.service;

import com.guestbookJS.database.model.Message;
import com.guestbookJS.database.repository.MessageRepository;
import com.guestbookJS.service.dto.MessageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MessageService {

    private final MessageRepository messageRepository;

    public List<MessageDto> getAll() {
        return messageRepository.findAll().stream()
                .map(it -> new MessageDto(it.getName(), it.getText()))
                .collect(Collectors.toList());
    }

    public Integer save(MessageDto messageDto) {
        return messageRepository
                .save(new Message(messageDto.getName(), messageDto.getText()))
                .getId();
    }
}
