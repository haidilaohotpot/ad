package com.wonder4work.ad.client;


import com.wonder4work.ad.client.vo.AdPlan;
import com.wonder4work.ad.client.vo.AdPlanGetRequest;
import com.wonder4work.ad.vo.CommonResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SponsorClientHystrix implements SponsorClient {

    @Override
    public CommonResponse<List<AdPlan>> getAdPlans(
            AdPlanGetRequest request) {
        return new CommonResponse<>(-1,
                "eureka-client-ad-sponsor error");
    }
}
