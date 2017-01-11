package com.test.retrofit.request.api;

import com.test.retrofit.request.entity.TestBean;
import com.test.retrofit.response.LoginBean;

import java.util.Map;

import retrofit2.Call;
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
    Observable<TestBean>  getTestData();
    @GET("top250")
    Observable<String>  getTestDataForString();

    @FormUrlEncoded
    @POST("mobile/login")
    Observable<String>  login(@FieldMap Map<String,String> map);

    @FormUrlEncoded
    @POST("mobile/cust/addCustomerdelMobile")
    Observable<String>  addInfo(@FieldMap Map<String,String> map);

    @FormUrlEncoded
    @POST("mobile/login")
    Call<String> generalLogin(@FieldMap Map<String,String> map);
    @FormUrlEncoded
    @POST("mobile/login")
    Call<LoginBean> generalLoginObj(@FieldMap Map<String,String> map);
}
