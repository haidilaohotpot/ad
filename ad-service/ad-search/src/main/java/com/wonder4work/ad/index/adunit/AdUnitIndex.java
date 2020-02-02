package com.wonder4work.ad.index.adunit;

import com.wonder4work.ad.index.IndexAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author <a href="https://github.com/haidilaohotpot">cheng</a>
 * @since 1.0.0 2020/2/1
 */
@Slf4j
@Component
public class AdUnitIndex implements IndexAware<Long, AdUnitObject> {

    private static Map<Long,AdUnitObject> objectMap;

    static {

        objectMap = new ConcurrentHashMap<>();

    }

    public Set<Long> match(Integer positionType){

        Set<Long> adUnitIds = new HashSet<>();
        objectMap.forEach((k,v)->{
            if (AdUnitObject.isAdSlotTypeOk(positionType, v.getPositionType())) {
                adUnitIds.add(k);
            }
        });
        return adUnitIds;
    }

    public List<AdUnitObject> fetch(Collection<Long> adUnitIds) {
        if (CollectionUtils.isEmpty(adUnitIds)) {
            return Collections.emptyList();
        }
        List<AdUnitObject> result = new ArrayList<>();
        adUnitIds.forEach(u ->{
            AdUnitObject object = get(u);
            if (object == null) {
                log.error("AdUnitObject not found:{}",u);
                return;
            }
            result.add(object);
        });
        return result;
    }




    @Override
    public AdUnitObject get(Long key) {
        return objectMap.get(key);
    }

    @Override
    public void add(Long key, AdUnitObject value) {

        log.info("before add : {}", objectMap);
        objectMap.put(key, value);
        log.info("after add : {}",objectMap);
    }

    @Override
    public void update(Long key, AdUnitObject value) {

        log.info("before update :{}",objectMap);

        AdUnitObject old = objectMap.get(key);
        if (null == old) objectMap.put(key, value);
        else old.update(value);

        log.info("after update :{}",objectMap);


    }

    @Override
    public void delete(Long key, AdUnitObject value) {
        log.info("before delete:{}", objectMap);
        objectMap.remove(key);
        log.info("after delete：{}",objectMap);
    }


}
