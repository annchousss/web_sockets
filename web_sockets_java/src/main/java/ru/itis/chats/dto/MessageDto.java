package ru.itis.chats.dto;

import lombok.Data;

@Data
public class MessageDto {
    private String from;
    private String text;
}
