package com.example.farmdoctor;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.farmdoctor.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // activity_main을 화면에 표시
        setContentView(R.layout.activity_main);
    }
}
