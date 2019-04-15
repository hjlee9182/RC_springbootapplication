package com.cnu.realcoding.LeagueOfLegend.service;

import com.cnu.realcoding.LeagueOfLegend.api.leagueOfLegendAPI;
import com.cnu.realcoding.LeagueOfLegend.domain.requestSummonerID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class summonerIDService {
    private List<requestSummonerID> summonerIDList = new ArrayList<>();

    @Autowired
    private leagueOfLegendAPI leagueOfLegendAPI;


    public requestSummonerID getSummonerID(String name){
        requestSummonerID summonerid = leagueOfLegendAPI.getSummerID(name);
        return summonerid;
        //summonerIDList.add(summonerID);
    }

    public List<requestSummonerID> getAllSUmmoner(){
        return summonerIDList;
    }

}
