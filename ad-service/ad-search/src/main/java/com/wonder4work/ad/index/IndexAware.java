package com.wonder4work.ad.index;

/**
 * @author <a href="https://github.com/haidilaohotpot">wonder4work</a>
 * @since 1.0.0 2020/2/1
 */
public interface IndexAware<K,V> {


    V get(K key);

    void add(K key, V value);

    void update(K key, V value);

    void delete(K key, V value);


}
