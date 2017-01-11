package com.test.retrofit.inter;

/**
 * Created by Administrator on 2017/1/11.
 */
public interface ResultCallBack<T> {
    void success(T t);
    void error(Throwable t);
}
