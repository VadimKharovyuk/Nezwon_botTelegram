package com.example.nezwon_bot.entity;

import com.example.nezwon_bot.entity.contract.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter

@Entity
@Table(name = "Notifications")
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor

public class Notification  extends AbstractEntity {



    @Column(name = "title")
    String title;
    @Column(name = "description")
    String description ;

    @Enumerated(EnumType.STRING)
    Status status ;

    @Column(name = "seconds")
    Long seconds ;



    @ManyToOne
    @JoinColumn(name = "user_id")
    User user ;

}
