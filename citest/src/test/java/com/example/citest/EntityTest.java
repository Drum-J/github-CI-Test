package com.example.citest;

import com.example.citest.entity.Member;
import com.example.citest.entity.Team;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class EntityTest {

    @Test
    void memberTest() throws Exception {
        //given
        Team test1 = new Team(1L, "Test1");

        //when
        Member member1 = new Member("승호", 28, test1);

        //then
        assertThat(member1.getTeam()).isEqualTo(test1);
        assertThat(test1.getMembers().get(0)).isEqualTo(member1);
    }
}
