package com.cnu.realcoding.LeagueOfLegend.controller;

import com.cnu.realcoding.LeagueOfLegend.domain.requestSummonerID;
import com.cnu.realcoding.LeagueOfLegend.service.summonerIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class summonerIDController {

    @Autowired
    private summonerIDService summonerIDService;

   /* @PostMapping("/summonerid")
    public void insertDog(@RequestBody requestSummonerID summonerID){
        summonerIDService.insertSummonerID(summonerID);
    }*/

    @GetMapping("/summonerid")
   public List<requestSummonerID> getAllSummonerID(){
    return summonerIDService.getAllSUmmoner();
    }

    @GetMapping("/{name}")
    public requestSummonerID getSummonerIDBody(@PathVariable String name){
        return summonerIDService.getSummonerID(name);
    }
}
