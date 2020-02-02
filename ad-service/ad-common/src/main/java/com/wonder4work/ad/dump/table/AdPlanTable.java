package com.wonder4work.ad.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author <a href="https://github.com/haidilaohotpot">cheng</a>
 * @since 1.0.0 2020/2/1
 */
@NoArgsConstructor
@Data
@AllArgsConstructor
public class AdPlanTable {

    private Long id;

    private Long userId;

    private Integer planStatus;

    private Date startDate;

    private Date endDate;

}
