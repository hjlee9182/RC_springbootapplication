package com.cnu.realcoding.LeagueOfLegend.repository;


import com.cnu.realcoding.LeagueOfLegend.domain.requestSummonerBody;
import com.cnu.realcoding.LeagueOfLegend.domain.requestSummonerID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class summonerRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void insertsummonerIDBody(requestSummonerBody requestSummonerBOdy){

        mongoTemplate.insert(requestSummonerBOdy);

    }
}
