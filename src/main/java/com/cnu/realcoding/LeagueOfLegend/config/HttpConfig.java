package com.cnu.realcoding.LeagueOfLegend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HttpConfig {

    @Bean//spring이 실행할떄 bean이 붙은거는 내부를 실행한다. 리턴받은 객체를 contatiner에 넣는다.
    public RestTemplate createRestTemplate(){
        return new RestTemplate();
    }
}
