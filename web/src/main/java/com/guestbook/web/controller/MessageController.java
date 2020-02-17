package com.guestbook.web.controller;

import com.guestbook.service.dto.MessageDto;
import com.guestbook.service.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MessageController {

    private final MessageService messageService;

    @GetMapping("/guestbook")
    public String getGuestbookPage(Model model) {
        model.addAttribute("messages", messageService.getAll());
        model.addAttribute("message", MessageDto.builder().build());
        return "guestbook";
    }

    @PostMapping("/guestbook")
    public String saveMessage(Model model, MessageDto message) {
        messageService.save(message);
        model.addAttribute("messages", messageService.getAll());
        model.addAttribute("message", MessageDto.builder().build());

        return "guestbook";
    }
}
