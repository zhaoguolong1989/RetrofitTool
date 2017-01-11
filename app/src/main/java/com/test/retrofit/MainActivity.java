package com.test.retrofit;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.github.retrofitutil.MyLog;
import com.github.retrofitutil.NoNetworkException;
import com.github.retrofitutil.RetrofitCallBack;
import com.github.rxjava.rxbus.MySubscriber;
import com.test.retrofit.request.api.ApiRequest;
import com.test.retrofit.request.entity.TestBean;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import rx.Subscriber;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView request, content, clear, request_string, login, addinfo;
    CheckBox iscach;
    boolean withCach = false;

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
        iscach = (CheckBox) findViewById(R.id.iscach);
        iscach.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                iscach.setText(isChecked + "");
                withCach = isChecked;
            }
        });
        request = (TextView) findViewById(R.id.request);
        login = (TextView) findViewById(R.id.login);
        login.setOnClickListener(this);
        addinfo = (TextView) findViewById(R.id.addinfo);
        addinfo.setOnClickListener(this);
        request_string = (TextView) findViewById(R.id.request_string);
        content = (TextView) findViewById(R.id.content);
        clear = (TextView) findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                content.setText(null);
            }
        });
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, String> map = new HashMap<String, String>();
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
        Map<String, String> map;
        switch (v.getId()) {
            case R.id.addinfo:
                map = new HashMap<String, String>();
                map.put("price", "0-800");
                map.put("other", "sf阿里打发生");
//                map.put("area","");
                map.put("fromToRoom", "1-2");
                map.put("token", "dcbe7e75834a48938845fc3c540e15a8");
                map.put("custCode", "C38170000048");
                map.put("reqType", "rent");
                map.put("acreage", "0-50");
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
                map = new HashMap<String, String>();
                map.put("equipmentName", "HUAWEI%20HN3-U01");
                map.put("username", "qinqi02");
                map.put("appSys", "android");
                map.put("source", "agencyApp");
                map.put("appModel", "864572010933342");
                map.put("password", getSuperPwd());
                map.put("version", "28.0");
                /*ApiRequest.generalLoginObj(map, new RetrofitCallBack<LoginBean>() {
                    @Override
                    protected void onSuccess(LoginBean response) {
                        content.setText(response.getContent().getAvatarUrl());
                    }
                    @Override
                    protected void onError(Throwable t) {
                        content.setText("error");
                    }
                });*/
               ApiRequest.generalLog(map, new RetrofitCallBack<String>() {
                   @Override
                   protected void onSuccess(String response) {
                       content.setText(response);
                   }

                   @Override
                   protected void onError(Throwable t) {
                       content.setText("error");
                   }
               });

                /*ApiRequest.login(map).subscribe(new MySubscriber<String>() {
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
                });*/
                break;
        }
    }

    private String getSuperPwd() {
        String trim = "qinqi02";
        String year = Calendar.getInstance().get(Calendar.YEAR) + "";
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String m = month + "";
        if (month < 10) {
            m = "0" + month;
        }
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        String datStr = day + "";
        if (day < 10) {
            datStr = "0" + day;
        }
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        String h = hour + "";
        if (hour < 10) {
            h = "0" + hour;
        }
        String pwd = trim.substring(0, 1).toUpperCase() + "n1need" + year + m + datStr + h;
        Log.i("pwd", "pwd---" + pwd);
        return pwd;
    }
}
