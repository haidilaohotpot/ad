package com.wonder4work.ad.search.vo.media;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @since 1.0.0 2020/2/1
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class App {

    // 应用编码
    private String appCode;

    //应用名称
    private String appName;

    //应用报名
    private String packageName;

    // activityName
    private String activityName;

}
