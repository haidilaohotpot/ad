package com.wonder4work.ad.search;


import com.wonder4work.ad.search.vo.SearchRequest;
import com.wonder4work.ad.search.vo.SearchResponse;

/**
 * Created by Qinyi.
 */
public interface ISearch {

    SearchResponse fetchAds(SearchRequest request);
}
