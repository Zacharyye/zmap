package com.example.zachary.zachary;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageButton;

import com.tencent.tencentmap.mapsdk.maps.MapView;

/**
 * Created by Zachary on 2018/3/17.
 */

public class TencentMapActivity extends Activity {
    //界面属性
    private ImageButton mShowMap;
    private MapView mTTMap;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tencentmap);
    }

    private void initView(){
        mShowMap = (ImageButton) findViewById(R.id.ibtn_show_map);
        mTTMap = (MapView) findViewById(R.id.mv_ttmp);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
