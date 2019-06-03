package com.cnu.realcoding.LeagueOfLegend.api;

import com.cnu.realcoding.LeagueOfLegend.domain.requestSummonerBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class encryptedAPI {

    @Autowired
    private RestTemplate restTemplate;

    private String requestUrl = "https://kr.api.riotgames.com/lol/league/v4/positions/by-summoner/{id}?api_key={apikey}";

    public List<requestSummonerBody> getencryptedSummerID(String summonerId){
        return restTemplate.exchange(requestUrl, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<requestSummonerBody>>() {},summonerId,"RGAPI-47f1400a-880a-4139-a72c-625cc6e7a266").getBody();
    }


}
