package com.Lslen.service;

import com.Lslen.entity.contactMessage;

import java.util.List;

public interface contactMessageService {
    List<contactMessage> getAllMessages();
    contactMessage getMessageById(Integer id);
    void insertMessage(contactMessage m);
    void deleteMessage(Integer id);
}
