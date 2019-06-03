package com.cnu.realcoding.LeagueOfLegend.service;

import com.cnu.realcoding.LeagueOfLegend.api.encryptedAPI;
import com.cnu.realcoding.LeagueOfLegend.api.leagueOfLegendAPI;
import com.cnu.realcoding.LeagueOfLegend.domain.requestSummonerBody;
import com.cnu.realcoding.LeagueOfLegend.domain.requestSummonerID;
import com.cnu.realcoding.LeagueOfLegend.repository.summonerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class summonerIDService {
    private List<requestSummonerBody> summonerIDList = new ArrayList<>();

    @Autowired
    private leagueOfLegendAPI leagueOfLegendAPI;

    @Autowired
    private encryptedAPI encryptedAPI;

    @Autowired
    private summonerRepository summonerRepository;

    public requestSummonerBody getSummonerID(String name){
        requestSummonerID summonerBody = leagueOfLegendAPI.getSummerID(name);
        List<requestSummonerBody> encryptedbody = encryptedAPI.getencryptedSummerID(summonerBody.getId());
        summonerRepository.insertsummonerIDBody(encryptedbody.get(0));
        return encryptedbody.get(0);

    }

    public List<requestSummonerBody> getAllSUmmoner(){
        return summonerIDList;
    }

}
