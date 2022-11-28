package com.revature.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "accounts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double balance;

//    @Lob
    private String description;
    private Date creationDate;

    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    @JsonIgnore
    private User user;

    public Account(String name, String description, Date creationDate, User user) {
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
        this.user = user;
    }
}
