
package com.example.gitprac.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(nullable = false)
    private String account;  // 로그인 아이디

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String nickname;  // 서비스 내 사용하는 닉네임

    @Column
    private String imageUrl;





}

