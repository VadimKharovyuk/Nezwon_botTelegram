package com.example.nezwon_bot.entity.contract;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Entity
@Getter
@Component

public abstract class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    protected UUID id ;
}
