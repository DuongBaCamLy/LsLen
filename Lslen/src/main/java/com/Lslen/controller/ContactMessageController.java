package com.Lslen.controller;

import com.Lslen.entity.contactMessage;
import com.Lslen.service.contactMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact-messages")
public class ContactMessageController {

    @Autowired
    private contactMessageService contactMessageService;

    @GetMapping
    public List<contactMessage> getAllMessages() {
        return contactMessageService.getAllMessages();
    }

    @GetMapping("/{id}")
    public contactMessage getMessageById(@PathVariable Integer id) {
        return contactMessageService.getMessageById(id);
    }

    @PostMapping
    public void insertMessage(@RequestBody contactMessage m) {
        contactMessageService.insertMessage(m);
    }

    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable Integer id) {
        contactMessageService.deleteMessage(id);
    }
}
