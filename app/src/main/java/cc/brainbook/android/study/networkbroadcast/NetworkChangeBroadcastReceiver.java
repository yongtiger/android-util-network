package cc.brainbook.android.study.networkbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

import cc.brainbook.android.study.networkbroadcast.util.ConnectivityUtil;

public class NetworkChangeBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        ///改为使用network util
//        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
//        if (connectivityManager != null) {
//            NetworkInfo[] networkInfos = connectivityManager.getAllNetworkInfo();
//            for (NetworkInfo networkInfo : networkInfos) {
//                NetworkInfo.State state = networkInfo.getState();
//                if (NetworkInfo.State.CONNECTED == state) {
//                    Log.d("TAG", "onReceive: ------------> Network is CONNECTED");
//                    return;
//                }
//            }
//        }
//
//        ///当前无网络连接
//        Log.d("TAG", "onReceive: ------------> Network is DISCONNECTED");


        Log.d("TAG", "onReceive: isConnectedWifi: " + ConnectivityUtil.isConnectedWifi(context));
        Log.d("TAG", "onReceive: isConnectedMobile: " + ConnectivityUtil.isConnectedMobile(context));
    }
}
