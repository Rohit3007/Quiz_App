package com.example.quizapp;

import static com.example.quizapp.MainActivity.ListOfQ;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DashBoardActivity extends AppCompatActivity {

    CountDownTimer countDownTimer ;
    int timerValue=20;
    ProgressBar progressBar;
    List<Modelclass> allQuestionsList;
    Modelclass modelclass;
    int index=0;
    TextView card_question,card_optiona,card_optionb,card_optionc,card_optiond;
    CardView cardOA,cardOB,cardOC,cardOD;
    int correctCount = 0;
    int WrongCount = 0;
    LinearLayout next_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        Hooks();
        allQuestionsList = ListOfQ;
        Collections.shuffle(allQuestionsList);

        modelclass = ListOfQ.get(index);

        setAllData();

        cardOA.setBackgroundColor(getResources().getColor(R.color.white));
        cardOB.setBackgroundColor(getResources().getColor(R.color.white));
        cardOC.setBackgroundColor(getResources().getColor(R.color.white));
        cardOD.setBackgroundColor(getResources().getColor(R.color.white));

        next_btn.setClickable(false);

        countDownTimer = new CountDownTimer(20000, 1000) {
            @Override
            public void onTick(long l) {
                timerValue = (int) (l / 1000); // Calculate remaining seconds
                progressBar.setProgress(timerValue);
            }

            @Override
            public void onFinish() {
                // Handle timer finish, e.g., show a dialog
                Dialog dialog = new Dialog(DashBoardActivity.this);
                dialog.setContentView(R.layout.time_out_dialog);
                dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);

                dialog.findViewById(R.id.btn_tryAgain).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(DashBoardActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                });

                dialog.show();
            }
        };

        countDownTimer.start(); // Start the timer
    }

    private void setAllData() {
        card_question.setText(modelclass.getQuestion());
        card_optiona.setText(modelclass.getoA());
        card_optionb.setText(modelclass.getoB());
        card_optionc.setText(modelclass.getoC());
        card_optiond.setText(modelclass.getoD());

    }

    private void Hooks() {
        progressBar = findViewById(R.id.quiz_timer);
        card_question =findViewById(R.id.card_question);
        card_optiona = findViewById(R.id.card_optiona);
        card_optionb = findViewById(R.id.card_optionb);
        card_optionc = findViewById(R.id.card_optionc);
        card_optiond = findViewById(R.id.card_optiond);

        next_btn=findViewById(R.id.next_btn);

        cardOA = findViewById(R.id.card1);
        cardOB = findViewById(R.id.card2);
        cardOC = findViewById(R.id.card3);
        cardOD = findViewById(R.id.card4);

    }
    public void Correct(CardView cardView){

        cardView.setBackgroundColor(getResources().getColor(R.color.Green));

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correctCount++;
                index++;
                modelclass=ListOfQ.get(index);
                setAllData();
                resetColor();
                enableButton();
                countDownTimer.cancel();
                countDownTimer.start();
            }
        });
    }

    public void wrong(CardView cardOA){

        cardOA.setBackgroundColor(getResources().getColor(R.color.Red));

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WrongCount++;
                if(index<ListOfQ.size()-1){
                    index++;
                    modelclass=ListOfQ.get(index);
                    setAllData();
                    resetColor();
                    enableButton();
                    countDownTimer.cancel();
                    countDownTimer.start();
                }else {
                    gameWon();
                }
            }
        });

    }

    private void gameWon() {
        Intent intent = new Intent(DashBoardActivity.this,wonActivty.class);
        startActivity(intent);
    }

    public void enableButton(){
        cardOA.setClickable(true);
        cardOB.setClickable(true);
        cardOC.setClickable(true);
        cardOD.setClickable(true);

    }
    public void disableButton(){
        cardOA.setClickable(false);
        cardOB.setClickable(false);
        cardOC.setClickable(false);
        cardOD.setClickable(false);

    }

    public void resetColor(){
        cardOA.setBackgroundColor(getResources().getColor(R.color.white));
        cardOB.setBackgroundColor(getResources().getColor(R.color.white));
        cardOC.setBackgroundColor(getResources().getColor(R.color.white));
        cardOD.setBackgroundColor(getResources().getColor(R.color.white));
    }

    public void optionAClick(View view) {
        disableButton();
        next_btn.setClickable(true);
        if(modelclass.getoA().equals(modelclass.getAns())){
            cardOA.setBackgroundColor(getResources().getColor(R.color.Green));

            if(index<ListOfQ.size()-1){
                Correct(cardOA);
            }else{
                gameWon();
            }
        }
        else{
            wrong(cardOA);
        }
    }
    public void optionBClick(View view) {
        disableButton();
        next_btn.setClickable(true);
        if(modelclass.getoB().equals(modelclass.getAns())){
            cardOB.setBackgroundColor(getResources().getColor(R.color.Green));

            if(index<ListOfQ.size()-1){
                Correct(cardOB);
            }else{
                gameWon();
            }
        }
        else{
            wrong(cardOB);
        }
    }
    public void optionCClick(View view) {
        disableButton();
        next_btn.setClickable(true);
        if(modelclass.getoC().equals(modelclass.getAns())){
            cardOC.setBackgroundColor(getResources().getColor(R.color.Green));

            if(index<ListOfQ.size()-1){
                Correct(cardOC);
            }else{
                gameWon();
            }
        }
        else{
            wrong(cardOC);
        }
    }

    public void optionDClick(View view) {
        disableButton();
        next_btn.setClickable(true);
        if(modelclass.getoD().equals(modelclass.getAns())){
            cardOD.setBackgroundColor(getResources().getColor(R.color.Green));

            if(index<ListOfQ.size()-1){
                Correct(cardOD);
            }else{
                gameWon();
            }
        }
        else{
            wrong(cardOD);
        }
    }
}