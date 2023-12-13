package com.ll.medium.global.init;

import com.ll.medium.domain.member.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class NotProd {
    private final MemberService memberService;

    @Bean
    public ApplicationRunner initNotProd() {
        return args -> {
            if (memberService.count() > 0) return;

            // 문제: ddl-auto가 update 일 때, 아래 코드들이 앱 실행시마다 실행된다.
            // 해결: 이미 샘플 데이터가 생성되었다면 추가로 샘플 데이터를 생성하지 않도록
            // 위 코드에서 count()로 회원 수를 확인하고 그것이 오직 0일 경우에만 아래 코드들을 실행하도록 한다.

            memberService.join("system", "1234");
            memberService.join("admin", "1234");
            memberService.join("user1", "1234");
            memberService.join("user2", "1234");
        };
    }
}