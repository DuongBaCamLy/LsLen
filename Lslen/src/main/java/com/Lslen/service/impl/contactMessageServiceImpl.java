package com.Lslen.service.impl;

import com.Lslen.entity.contactMessage;
import com.Lslen.repository.contactMessageRepository;
import com.Lslen.service.contactMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class contactMessageServiceImpl implements contactMessageService {

    @Autowired
    private contactMessageRepository contactMessageRepository;

    @Override
    public List<contactMessage> getAllMessages() {
        return contactMessageRepository.findAll();
    }

    @Override
    public contactMessage getMessageById(Integer id) {
        return contactMessageRepository.findById(id).orElse(null);
    }

    @Override
    public void insertMessage(contactMessage m) {
        contactMessageRepository.save(m);
    }

    @Override
    public void deleteMessage(Integer id) {
        contactMessageRepository.deleteById(id);
    }
}
