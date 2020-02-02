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
public class Device {

    // 设备id
    private String deviceCode;

    // mac
    private String mac;

    // ip
    private String ip;

    // 机型
    private String model;

    private String displaySize;

    private String screenSize;

    private String serialName;

}
