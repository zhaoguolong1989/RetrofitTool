package com.test.retrofit;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.github.retrofitutil.MyLog;
import com.github.retrofitutil.NoNetworkException;
import com.github.rxjava.rxbus.MySubscriber;
import com.test.retrofit.request.api.ApiRequest;
import com.test.retrofit.request.entity.TestBean;

import java.util.HashMap;
import java.util.Map;

import rx.Subscriber;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView request,content,clear,request_string,login,addinfo;
    CheckBox iscach;
    boolean withCach=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        initView();
    }

    private void initView() {
        iscach= (CheckBox) findViewById(R.id.iscach);
        iscach.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                iscach.setText(isChecked+"");
                withCach=isChecked;
            }
        });
        request= (TextView) findViewById(R.id.request);
        login= (TextView) findViewById(R.id.login);
        login.setOnClickListener(this);
        addinfo= (TextView) findViewById(R.id.addinfo);
        addinfo.setOnClickListener(this);
        request_string= (TextView) findViewById(R.id.request_string);
        content= (TextView) findViewById(R.id.content);
        clear= (TextView) findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                content.setText(null);
            }
        });
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String,String>map=new HashMap<String, String>();
                ApiRequest.getData(withCach, map).subscribe(new Subscriber<TestBean>() {
                    @Override
                    public void onCompleted() {
                        MyLog.i("onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        content.setText(e.getMessage());
                        MyLog.i("onError");
                    }

                    @Override
                    public void onNext(TestBean o) {
                        MyLog.i(o.toString());
                        content.setText(o.toString());
                    }
                });
            }
        });
        request_string.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ApiRequest.getDataForString(withCach).subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted() {
                        MyLog.i("onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        MyLog.i("onError");
                        if (e instanceof NoNetworkException) {
                            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                            content.setText("onError-NoNetworkException");
                        } else {
                            content.setText("onError" + e.getMessage());
                        }

                    }

                    @Override
                    public void onNext(String o) {
                        content.setText(o);
                    }
                });
            }
        });
    }

    @Override
    public void onClick(View v) {
        Map<String,String>map;
        switch (v.getId()){
            case R.id.addinfo:
                map=new HashMap<String,String>();
                map.put("price","0-800");
                map.put("other","sf阿里打发生");
//                map.put("area","");
                map.put("fromToRoom","1-2");
                map.put("token","删除内部接口防止外部调用");
                map.put("custCode","C38170000048");
                map.put("reqType","rent");
                map.put("acreage","0-50");
                ApiRequest.addInfo(map).subscribe(new MySubscriber<String>() {
                    @Override
                    public void onMyNext(String obj) {
                        content.setText(obj);
                    }
                    @Override
                    public void onResult(boolean isCompleted) {
                        super.onResult(isCompleted);
                        if (!isCompleted) {
                            content.setText("error");
                        }
                    }
                });
                break;
            case R.id.login:
                map=new HashMap<String,String>();
                map.put("equipmentName","HUAWEI%20HN3-U01");
                //此处内部接口删除，无法使用
                ApiRequest.login(map).subscribe(new MySubscriber<String>() {
                    @Override
                    public void onMyNext(String obj) {
                        content.setText(obj);
                    }
                    @Override
                    public void onResult(boolean isCompleted) {
                        super.onResult(isCompleted);
                        if (!isCompleted) {
                            content.setText("error");
                        }
                    }
                });
            break;
        }
    }

}
