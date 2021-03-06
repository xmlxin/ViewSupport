/*
 * Copyright 2016 GcsSloop
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Last modified 2016-12-03 22:55:55
 *
 */

package com.gcssloop.test.viewsupport;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;

import com.gcssloop.test.base.BaseActivity;
import com.gcssloop.view.CustomView;

public class TestCustomViewActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
    }

    public class MyView extends CustomView{

        public MyView(Context context) {
            super(context);
            mDeafultPaint.setColor(Color.GRAY);             // 获得一个默认的画笔
            mDeafultPaint.setTextSize(42);
            mDeafultPaint.setTextAlign(Paint.Align.CENTER);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.translate(mViewWidth/2,mViewHeight/2);   // 获得视图宽高

            canvas.drawCircle(0, -100, 100, mDeafultPaint);
            canvas.drawText("用默认画笔绘制一个圆", 0, 60, mDeafultPaint);
        }
    }

}
