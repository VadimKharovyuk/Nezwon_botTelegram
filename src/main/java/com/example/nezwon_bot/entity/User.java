package com.example.nezwon_bot.entity;

import com.example.nezwon_bot.entity.contract.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "bot_users")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter

@NoArgsConstructor

public class User  extends AbstractEntity {
    @Column(name = "chat_id", unique = true, nullable = false)
    Long chatId;
    @Column(name = "first_name", nullable = false)
    String firsName;
    @Column(name = "registered_at")
    LocalDateTime registeredAt;
    @OneToMany
    Set<Notification> notifications;


}
