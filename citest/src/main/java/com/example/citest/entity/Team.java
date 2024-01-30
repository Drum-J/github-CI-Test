package com.example.citest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
public class Team {

    @Id @GeneratedValue(strategy = IDENTITY)
    @Column(name = "team_id")
    private Long id;

    private String teamName;

    @OneToMany
    private List<Member> members = new ArrayList<>();

    public Team(Long id, String teamName) {
        this.id = id;
        this.teamName = teamName;
    }
}
