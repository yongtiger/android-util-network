package cc.brainbook.android.study.networkbroadcast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import cc.brainbook.android.study.networkbroadcast.util.ConnectivityUtil;

/**
 * 利用广播监听设备网络连接的变化情况
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", "onCreate: isOnline: " + ConnectivityUtil.getNetworkInfo(this));
    }
}
