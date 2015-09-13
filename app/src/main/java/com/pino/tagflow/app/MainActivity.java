package com.pino.tagflow.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.pino.tagflow.app.customview.FlowView;


public class MainActivity extends AppCompatActivity {

    private String[] mVals = new String[]
            {"Chinese", "Android", "hongyang ", "guolin", "luoshengyang", "aige",
                    "Android", "renyugang", "nongminbobo", "TextView", "Helloworld",
                    "Android", "51Cto", "csdn", "github"};

    private FlowView mFlowLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFlowLayout = (FlowView) findViewById(R.id.id_flowlayout);

        initData();
    }

    public void initData() {
        // for (int i = 0; i < mVals.length; i++)
        // {
        // Button btn = new Button(this);
        //
        // MarginLayoutParams lp = new MarginLayoutParams(
        // MarginLayoutParams.WRAP_CONTENT,
        // MarginLayoutParams.WRAP_CONTENT);
        //
        // btn.setText(mVals[i]);
        // mFlowLayout.addView(btn, lp);
        // }
        LayoutInflater mInflater = LayoutInflater.from(this);
        for (int i = 0; i < mVals.length; i++) {
            TextView tv = (TextView) mInflater.inflate(R.layout.item_text,
                    mFlowLayout, false);
            tv.setText(mVals[i]);
            mFlowLayout.addView(tv);
        }

    }
}

