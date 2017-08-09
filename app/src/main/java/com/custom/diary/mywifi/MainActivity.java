package com.custom.diary.mywifi;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.net.wifi.ScanResult;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private ArrayAdapter<String> mAdapter;
    private WifiManager mWifiManager;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        final List<ScanResult> scanResultList = mWifiManager.getScanResults();
        String[] mSList=new String[scanResultList.size()];

        tv = (TextView) findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("" + scanResultList.size());
            }
        });

/*        for (int i = 0; i <= scanResultList.size(); i++) {

        }*/

        /*lv = (ListView) findViewById(R.id.lv);
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, new String[]{"aaa", "bbb"}
        );
        lv.setAdapter(mAdapter);*/
    }
}
