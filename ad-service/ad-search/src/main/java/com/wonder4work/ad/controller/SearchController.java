package com.wonder4work.ad.controller;

import com.alibaba.fastjson.JSON;

import com.wonder4work.ad.annotation.IgnoreResponseAdvice;
import com.wonder4work.ad.client.SponsorClient;
import com.wonder4work.ad.client.vo.AdPlan;
import com.wonder4work.ad.client.vo.AdPlanGetRequest;
import com.wonder4work.ad.search.ISearch;
import com.wonder4work.ad.search.vo.SearchRequest;
import com.wonder4work.ad.search.vo.SearchResponse;
import com.wonder4work.ad.vo.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Qinyi.
 */
@Slf4j
@RestController
public class SearchController {

    private final ISearch search;

    private final SponsorClient sponsorClient;

    @Autowired
    public SearchController(SponsorClient sponsorClient, ISearch search) {
        this.sponsorClient = sponsorClient;
        this.search = search;
    }

    @PostMapping("/fetchAds")
    public SearchResponse fetchAds(@RequestBody SearchRequest request) {

        log.info("ad-search: fetchAds -> {}",
                JSON.toJSONString(request));
        return search.fetchAds(request);
    }

    @IgnoreResponseAdvice
    @PostMapping("/getAdPlans")
    public CommonResponse<List<AdPlan>> getAdPlans(
            @RequestBody AdPlanGetRequest request
    ) {
        log.info("ad-search: getAdPlans -> {}",
                JSON.toJSONString(request));
        return sponsorClient.getAdPlans(request);
    }


}
