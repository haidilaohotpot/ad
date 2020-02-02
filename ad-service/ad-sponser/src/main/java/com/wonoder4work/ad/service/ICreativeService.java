package com.wonoder4work.ad.service;


import com.wonoder4work.ad.vo.CreativeRequest;
import com.wonoder4work.ad.vo.CreativeResponse;

public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
