package com.guestbookJS.web.controller;

import com.guestbookJS.service.dto.MessageDto;
import com.guestbookJS.service.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MessageController {

    private final MessageService messageService;

    @GetMapping("/guestbook")
    public String getGuestbookPage() {
        return "guestbook";
    }

    @GetMapping(value = "/messages", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<MessageDto> getAllMessages() {
        return messageService.getAll();
    }

    @PostMapping(value = "/message", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<MessageDto> saveMessage(@RequestBody MessageDto messageDto) {
        messageService.save(messageDto);
        return messageService.getAll();
    }
}
