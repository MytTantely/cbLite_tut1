package qway.myt.com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mButtonChangeText;
    private TextView mTextViewHello;
    private static int inc = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewHello = findViewById(R.id.textView);

        mButtonChangeText = findViewById(R.id.button);
        mButtonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++inc;
                mTextViewHello.setText("" + inc);
            }
        });
    }
}
