package com.example.prac1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    EditText etn1;
    RadioButton rd_btn_C;
    RadioButton rd_btn_F;
    Button btn_cal;
    TextView tv_ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        etn1 = findViewById(R.id.etn1);
        rd_btn_C = findViewById(R.id.rd_btn_C);
        rd_btn_F = findViewById(R.id.rd_btn_F);
        btn_cal = findViewById(R.id.btn_cal);
        tv_ans = findViewById(R.id.tv_ans);
    }

    @Override
    protected void onResume() {
        super.onResume();
        btn_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateAnswer();
            }
        });
    }

    public void calculateAnswer(){
            Calculation cal = new Calculation();
            String value = etn1.getText().toString();
            if(TextUtils.isEmpty(value)){

                Toast.makeText(this, "Enter the temperature please!!!", Toast.LENGTH_SHORT).show();
            }
            else{
                Float temp= Float.parseFloat(value);
                if(rd_btn_C.isChecked()){
                    temp = cal.convertCelciusToFahrenheit(temp);

                }else if(rd_btn_F.isChecked()){
                    temp = cal.convertFajrenheitToCelcius(temp);
                }
                else{
                    Toast.makeText(this, "Please Select Any Option!!", Toast.LENGTH_SHORT).show();
                    temp=0.0f;
                }

                tv_ans.setText(new Float(temp).toString());
            }
    }
}