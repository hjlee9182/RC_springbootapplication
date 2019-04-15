package com.cnu.realcoding.LeagueOfLegend.service;

import com.cnu.realcoding.LeagueOfLegend.domain.requestSummonerID;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class summonerIDService {
    private List<requestSummonerID> summonerIDList = new ArrayList<>();

    public void insertSummonerID(requestSummonerID summonerID){
        summonerIDList.add(summonerID);
    }

    public List<requestSummonerID> getAllSUmmoner(){
        return summonerIDList;
    }

}
