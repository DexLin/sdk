package com.dexlin.mylibrary;
import android.content.Context;
import android.widget.Toast;

import com.buka.sdk.BKUserCenter;

/**
 * Created by DexLin on 17/4/14.
 */

public class TestLibrary {

     public void test(Context context){
         Toast.makeText(context,"测试登录",Toast.LENGTH_LONG).show();
         BKUserCenter.getInstance().login(context);
     }
}
