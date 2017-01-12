###RetrofitTool
这个工具类主要封装了Retrofit的基本用法(其实官网已经说得很详细了)

```
首先在Application里面初始化

NetWorkManager.init(Context ctx,String baseUrl);
NetWorkManager.init(Context ctx, String url,int cachTime, String noNetworkMsg, boolean debugFlag)
ctx-->上下文
baseUrl-->ip+端口号之类的前缀,以/结尾
cachTime-->请求接口设置有效的缓存时间(默认为60秒)
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

[ ![Download](https://api.bintray.com/packages/zhongrui/customview/RetrofitTool/images/download.svg) ](https://bintray.com/zhongrui/customview/RetrofitTool/_latestVersion)
```
dependencies{
    compile 'com.github:retrofitutil:最新版本号看上面的蓝色小图片'
}
```
---
以下传参以map为例(还可以传对象,具体用法可以参考Retrofit官网)
####不结合Rxjava使用方法
IRequest.java
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
        call.enqueue(callBack);
}
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
####结合Rxjava使用方法
IRequest.java
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
