package com.dexlin.testsdk.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.TextView;

import com.buka.sdk.utils.LogUtils;

/**
 * Created by DexLin on 17/6/12.
 */

public class MyTestView extends TextView {

    public MyTestView(Context context) {
        super(context);
        LogUtils.e("一个参数");
    }
    public MyTestView(Context context, AttributeSet attrs) {
        super(context,attrs);
        LogUtils.e("两个参数："+attrs.getAttributeCount());

    }
    public MyTestView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LogUtils.e("三个参数");

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width=MeasureSpec.getSize(widthMeasureSpec);
        int height=MeasureSpec.getSize(heightMeasureSpec);
        int mode=MeasureSpec.getMode(widthMeasureSpec);
        LogUtils.e(width+","+height+","+mode);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setColor(Color.BLUE);

        Path path=new Path();


        canvas.drawPath(path,paint);




    }
}
