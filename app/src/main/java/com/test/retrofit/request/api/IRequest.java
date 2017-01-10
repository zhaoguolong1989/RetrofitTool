package com.test.retrofit.request.api;

import com.test.retrofit.request.entity.DataBean;

import java.util.Map;

import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;
/**
 * Created by Administrator on 2017/1/9.
 */
public interface IRequest {
    @GET("top250")//top250-chart
    Observable<DataBean>  getTestData();
    @GET("top250")
    Observable<String>  getTestDataForString();

    @FormUrlEncoded
    @POST("mobile/login")
    Observable<String>  login(@FieldMap Map<String,String> map);

    @FormUrlEncoded
    @POST("mobile/cust/addCustomerdelMobile")
    Observable<String>  addInfo(@FieldMap Map<String,String> map);
}
