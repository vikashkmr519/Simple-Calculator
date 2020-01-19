package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDivision,btnClear,btnAdd,btnSubtract,
    btnBracket,btnPercent,btnMultily,btnEqual,btnDot;
    TextView tvInput, tvOutput;
    String process;
    boolean Add,Sub,Mul,Div,Mod;
    float res1, res2,result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 =findViewById(R.id.btn0);
        btn1 =findViewById(R.id.btn1);
        btn2 =findViewById(R.id.btn2);
        btn3 =findViewById(R.id.btn3);
        btn4 =findViewById(R.id.btn4);
        btn5 =findViewById(R.id.btn5);
        btn6 =findViewById(R.id.btn6);
        btn7 =findViewById(R.id.btn7);
        btn8 =findViewById(R.id.btn8);
        btn9 =findViewById(R.id.btn9);
        btnAdd =findViewById(R.id.btnAdd);
        btnSubtract =findViewById(R.id.btnSubtract);
        btnDivision =findViewById(R.id.btnDivision);
        btnDot =findViewById(R.id.btnDot);
        btnEqual =findViewById(R.id.btnEqual);
        btnMultily =findViewById(R.id.btnMultiply);
        btnBracket =findViewById(R.id.btnBracket);
        btnClear =findViewById(R.id.btnClear);
        btnPercent =findViewById(R.id.btnPercent);

        tvInput =findViewById(R.id.tvInput);
        tvOutput =findViewById(R.id.tvOutput);

        btnClear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                tvInput.setText("");
                tvOutput.setText("");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +"0");

            }
        });
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +"1");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +"2");

            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +"3");

            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +"4");

            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +"5");

            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +"6");

            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +"7");

            }
        });

        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +"8");

            }
        });

        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +"9");

            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(tvInput == null){
                    tvInput.setText("");
                }else{
                    res1 = Float.parseFloat(tvInput.getText().toString());
                    Add =true;
                    tvInput.setText(null);
                }



            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(tvInput == null){
                    tvInput.setText("");
                }else{
                    res1 = Float.parseFloat(tvInput.getText().toString());
                    Sub =true;
                    tvInput.setText(null);
                }


            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(tvInput == null){
                    tvInput.setText("");
                }else{
                    res1 = Float.parseFloat(tvInput.getText().toString());
                    Div=true;
                    tvInput.setText(null);
                }



            }
        });

        btnMultily.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(tvInput == null){
                    tvInput.setText("");
                }else{
                    res1 = Float.parseFloat(tvInput.getText().toString());
                    Mul =true;
                    tvInput.setText(null);
                }




            }
        });

        btnDot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +".");

            }
        });
        btnPercent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(tvInput == null){
                    tvInput.setText("");
                    Toast.makeText(MainActivity.this,"Wrong Input",Toast.LENGTH_SHORT).show();
                }else{
                    res1 = Float.parseFloat(tvInput.getText().toString());
                    Mod =true;
                    tvInput.setText(null);
                }


            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               res2 = Float.parseFloat(tvInput.getText().toString());

               if(Add){
                   result = res1 + res2;
                   tvOutput.setText(String.valueOf(result));

               }else if(Mul){
                   result = res1 * res2;
                   tvOutput.setText(String.valueOf(result));


                }else if(Sub){
                   result = res1 - res2;
                   tvOutput.setText(String.valueOf(result));
               }else if(Div){
                   result = res1 / res2;
                   tvOutput.setText(String.valueOf(result));
               }else if(Mod){
                       result = res1 % res2;
                tvOutput.setText(String.valueOf(result));

               }

            }
        });

    }
}
