package com.example.nezwon_bot.repository;

import com.example.nezwon_bot.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NotificationRepository  extends JpaRepository<Notification, UUID> {
}
