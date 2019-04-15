package com.cnu.realcoding.LeagueOfLegend.service;

import com.cnu.realcoding.LeagueOfLegend.api.encryptedAPI;
import com.cnu.realcoding.LeagueOfLegend.api.leagueOfLegendAPI;
import com.cnu.realcoding.LeagueOfLegend.domain.requestSummonerID;
import com.cnu.realcoding.LeagueOfLegend.repository.summonerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class summonerIDService {
    private List<requestSummonerID> summonerIDList = new ArrayList<>();

    @Autowired
    private leagueOfLegendAPI leagueOfLegendAPI;

    @Autowired
    private encryptedAPI encryptedAPI;

    @Autowired
    private summonerRepository summonerRepository;

    public requestSummonerID getSummonerID(String name){
        requestSummonerID summonerBody = leagueOfLegendAPI.getSummerID(name);
        requestSummonerID encryptedbody = encryptedAPI.getencryptedSummerID(summonerBody.getId());
        summonerRepository.insertsummonerIDBody(encryptedbody);
        return encryptedbody;

    }

    public List<requestSummonerID> getAllSUmmoner(){
        return summonerIDList;
    }

}
