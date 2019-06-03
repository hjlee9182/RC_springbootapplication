package com.cnu.realcoding.LeagueOfLegend.api;

import com.cnu.realcoding.LeagueOfLegend.domain.requestSummonerID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class leagueOfLegendAPI {

    @Autowired
    private RestTemplate restTemplate;

    private String requestUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summonername}?api_key={apiKey}";

    public requestSummonerID getSummerID(String summonerid){
        return restTemplate.exchange(requestUrl, HttpMethod.GET,null, requestSummonerID.class, summonerid,"RGAPI-47f1400a-880a-4139-a72c-625cc6e7a266")
                .getBody();


    }


}
