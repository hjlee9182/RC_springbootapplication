package com.cnu.realcoding.LeagueOfLegend.domain;

import lombok.Data;

@Data
public class requestSummonerID {
    private int profileIconId;
    private String name;
    private String puuid;
    private long summonerLevel;
    private String accountID;
    private String Id;
    private long revisionDate;
}
