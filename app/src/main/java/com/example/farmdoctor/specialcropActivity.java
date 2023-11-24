package com.example.farmdoctor;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class specialcropActivity extends AppCompatActivity {

    public static String keyItemCode, keyKindCode, keyRanks, keyImage;

    String [] fcItemCodeList = {"_", "315", "315", "315", "315", "314", "314", "314", "317", "317", "312", "312", "312", "312", "312", "312", "312", "316", "316"
    };

    String [] fcKindCodeList = {"_", "00", "00", "01", "01", "01", "01", "02", "00", "00", "01", "01", "02", "03", "01", "01", "02", "00", "00"
    };
    String [] fcRanksList = {"_", "상품", "중품", "상품", "중품", "상품", "중품", "중품", "상품", "중품", "상품", "중품", "중품", "중품", "상품", "중품", "중품", "상품", "중품"
    };
    String [] fcImageList = {"_", "aoystermushroom", "aoystermushroom", "aoystermushroom", "aoystermushroom", "peanut", "peanut", "peanut", "kingtrumpetmushroom", "kingtrumpetmushroom", "sesame", "sesame", "sesame", "sesame", "sesame", "sesame", "sesame", "enokimushroom", "enokimushroom"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.specialcrop_page_1);

        // 'homebutton' 버튼 클릭 이벤트 처리
        ImageButton homeButton = findViewById(R.id.homebutton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'MainActivity'로 이동
                Intent intent = new Intent(specialcropActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 'backbutton' 버튼 클릭 이벤트 처리
        ImageButton backButton = findViewById(R.id.backbutton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 'MainActivity'로 이동
                Intent intent = new Intent(specialcropActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 버튼들을 생성하고 클릭 이벤트 처리 함수 호출
        createButtons();
    }

    // 버튼 생성 및 클릭 이벤트 처리 함수
    private void createButtons() {
        for (int i = 1; i <= 42; i++) {
            createButton(i);
        }
    }

    // 각 버튼의 생성 및 클릭 이벤트 처리 함수
    private void createButton(final int index) {
        Button button = findViewById(getResources().getIdentifier("button" + index, "id", getPackageName()));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keyItemCode = fcItemCodeList[index];
                keyKindCode = fcKindCodeList[index];
                keyRanks = fcRanksList[index];
                keyImage = fcImageList[index];
                Intent intent = new Intent(specialcropActivity.this, guideSpecialcropActivity.class);
                startActivity(intent);
            }
        });
    }
}
