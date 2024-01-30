package com.example.citest.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
public class Member {

    @Id @GeneratedValue(strategy = IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String name;
    private int age;

    @ManyToOne
    private Team team;

    // 연관관계 메서드
    private void joinTeam(Team team) {
        this.team = team;
        team.getMembers().add(this);
    }

    public Member(String name, int age, Team team) {
        this.name = name;
        this.age = age;
        joinTeam(team);
    }
}
