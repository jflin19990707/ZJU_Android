package com.bytedance.clockapplication;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bytedance.clockapplication.widget.Clock;

public class MainActivity extends AppCompatActivity {

    private Handler mHandler;
    private View mRootView;
    private Clock mClockView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHandler = new Handler();
        mRootView = findViewById(R.id.root);
        mClockView = findViewById(R.id.clock);



        mRootView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mClockView.setShowAnalog(!mClockView.isShowAnalog());
            }
        });
        mHandler.post(tickRunnable);

    }
    private Runnable tickRunnable = new Runnable() {
        @Override
        public void run() {
            mClockView.invalidate();
            mHandler.postDelayed(tickRunnable,1000);
        }
    };

}
