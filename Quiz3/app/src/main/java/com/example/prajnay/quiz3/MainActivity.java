package com.example.prajnay.quiz3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Scorecal(View view) {
        Check_Q1();
        Check_Q2();
        Check_Q3();
        Check_Q4();
        finalscore(score);
        Reset();
    }

    private void Check_Q1() {
        String ans = getString(R.string.A1);
        EditText userans = (EditText) findViewById(R.id.userans1);
        Editable user_ans = userans.getText();
        String ansbyuser = user_ans.toString();
        if (ansbyuser.equals(ans)) {
            increment();
        }
        return;
    }

    private void Check_Q2() {
        CheckBox op1 = findViewById(R.id.a2op1);
        CheckBox op2 = findViewById(R.id.a2op2);
        CheckBox op3 = findViewById(R.id.a2op3);
        if(op1.isChecked() && op2.isChecked() && !op3.isChecked()){
            score += 1;
        }
    }

    private void Check_Q3() {
        RadioButton True1 = findViewById(R.id.Q3T);
        if (True1.isChecked()) {
            increment();
        }
    }

    private void Check_Q4() {
        EditText userans1 = (EditText) findViewById(R.id.userans2);
        Editable user_ans1 = userans1.getText();
        String ansbyuser1 = user_ans1.toString();
        String ans1 = getString(R.string.A4);
        if (ansbyuser1.equals(ans1)) {
            increment();
        }
    }

    int score = 0;

    private void increment() {
        score = score + 1;
    }

    private void finalscore(int fscore) {
        TextView score1 = (TextView) findViewById(R.id.Score);
        score1.setText("Your score is " + fscore);
        Toast.makeText(MainActivity.this,"Your score is " + fscore, Toast.LENGTH_SHORT).show();
    }

    private void Reset() {
        score = 0;
    }
}








