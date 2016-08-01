package io.github.dalekocian.satjug;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvLocation = (TextView) findViewById(R.id.tvLocation);
        tvLocation.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
