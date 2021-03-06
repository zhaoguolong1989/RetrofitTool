###RetrofitTool
这个工具类主要封装了Retrofit的基本用法(其实官网已经说得很详细了)

```
首先在Application里面初始化

NetWorkManager.init(Context ctx,String baseUrl);
NetWorkManager.init(Context ctx,String baseUrl,int cachTime, String noNetworkMsg, boolean debugFlag)
ctx-->上下文
baseUrl-->ip+端口号之类的前缀,以/结尾
cachTime-->设置数据的有效缓存时间(默认为60秒)
noNetworkMsg-->无网络连接时的文字提示(默认为“无网络连接,请检查之后再试”)
debugFlag-->是否是debug模式(true:debug)主要在debug模式下打印请求的参数以及请求头和返回结果(默认为true)

```
	NetWorkManager.getCommonClient();返回对象或者集合无缓存
    NetWorkManager.getCommonWithCacheClient();返回对象或者集合有缓存
    NetWorkManager.getStringClient();返回String无缓存
    NetWorkManager.getStringWithCacheClient();返回String有缓存
    ---------------↑结合Rxjava使用的客户端----------------------------------------
    
    ---------------↓不结合Rxjava使用的客户端--------------------------------------
    NetWorkManager.getGeneralClient();返回对象或者集合无缓存
    NetWorkManager.getGeneralWithCachClient();返回对象或者集合有缓存
    NetWorkManager.getGeneralStringClient();返回String无缓存
    NetWorkManager.getGeneralStringWithCachClient();返回String有缓存
    
    至于这里为什么提供这么多客户端,动态设置不行吗?之前我也想过,具体不多做解释,实践之后就会了解的

[ ![Download](https://api.bintray.com/packages/zhongrui/customview/RetrofitTool/images/download.svg) ](https://bintray.com/zhongrui/customview/RetrofitTool/_latestVersion)
```
dependencies{
    compile 'com.github:retrofitutil:最新版本号看上面的蓝色小图片'
}
```
---
以下传参以map为例(还可以传对象,具体用法可以参考Retrofit官网)
####不结合Rxjava使用方法(没提供请求之前检查网络连接的功能,和Rxjava结合的有提供)
IRequest.java(注意,这是一个接口,所以没有方法体)
```
@FormUrlEncoded
@POST("mobile/login")
Call<LoginBean> generalLogin(@FieldMap Map<String,String> map);

@GET("mobile/login")
Call<LoginBean> generalLogin(@QueryMap Map<String,String> map);
```
ApiRequest.java
```
public static void login(Map<String,String> map,final Callback<LoginBean> callBack){
        Call<LoginBean> call =  NetWorkManager.getGeneralClient()
	                 			.create(IRequest.class)
	                 			.generalLogin(map);
        call.enqueue(callBack);//异步请求
}
call.enqueue(callBack);		 //异步请求
call.execute().body();		 //同步请求-返回对象
call.execute().body().toString();//同步请求-返回String
```
Activity
```
ApiRequest.login(map, new RetrofitCallBack<T>() {
     @Override
     protected void onSuccess(T response) {
         
     }
     @Override
     protected void onError(Throwable t) {
         
     }
});
```
---
####结合Rxjava使用方法(提供了请求之前检查网络连接的功能)
IRequest.java(注意,这是一个接口,所以没有方法体)
```
@FormUrlEncoded
@POST("mobile/login")
Observable<T> generalLogin(@FieldMap Map<String,String> map);
```
ApiRequest.java
```
public static Observable<T> login(Map<String,String> map){
     return NetWorkManager.getCommonClient()
	        .create(IRequest.class)
            .generalLogin(map)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread());
}
```
Activity
```
ApiRequest.login(map).subscribe(new Subscriber<T>() {
	    @Override
	    public void onCompleted() {
	    }
	    @Override
	    public void onError(Throwable e) {
	    }
	    @Override
	    public void onNext(T response) {
	    }
})
```
