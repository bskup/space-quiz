package com.bskup.spacequiz;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int totalCorrect = 0;
    int totalAttempts = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Checks question 1
     */
    public void checkQuestion1(View view) {

        RadioButton radioButtonA = (RadioButton) findViewById(R.id.radio_button_A);
        boolean isCheckedA = radioButtonA.isChecked();

        if (isCheckedA) {
            totalCorrect += 1;

            setContentView(R.layout.q1_correct);
        } else {
            setContentView(R.layout.q1_incorrect);
        }

    }

    /**
     * Checks question 2
     */
    public void checkQuestion2(View view) {

        RadioButton radioButtonB = (RadioButton) findViewById(R.id.radio_button_B);
        boolean isCheckedB = radioButtonB.isChecked();

        if (isCheckedB) {
            totalCorrect += 1;

            setContentView(R.layout.q2_correct);
        } else {
            setContentView(R.layout.q2_incorrect);
        }

    }

    /**
     * Checks question 3
     */
    public void checkQuestion3(View view) {

        EditText answerEditText = (EditText) findViewById(R.id.answer_edit_text);
        String answerString = answerEditText.getText().toString();
        String correctAnswer = getString(R.string.question_3_answer);

        if (answerString.equals(correctAnswer)) {
            totalCorrect += 1;

            setContentView(R.layout.q3_correct);
        } else {
            setContentView(R.layout.q3_incorrect);
        }

    }

    /**
     * Checks question 4
     */
    public void checkQuestion4(View view) {

        EditText answerEditText = (EditText) findViewById(R.id.answer_edit_text);
        String answerString = answerEditText.getText().toString();
        String correctAnswer = getString(R.string.question_4_answer);

        if (answerString.equals(correctAnswer)) {
            totalCorrect += 1;

            setContentView(R.layout.q4_correct);
        } else {
            setContentView(R.layout.q4_incorrect);
        }

    }

    /**
     * If question 5 is answered true
     */
    public void answerTrueQuestion5(View v) {
        totalCorrect += 1;

        setContentView(R.layout.q5_correct);
    }

    /**
     * If question 5 is answered false
     */
    public void answerFalseQuestion5(View v) {
        setContentView(R.layout.q5_incorrect);
    }

    /**
     * If question 6 is answered true
     */
    public void answerTrueQuestion6(View v) {
        setContentView(R.layout.q6_incorrect);
    }

    /**
     * If question 6 is answered false
     */
    public void answerFalseQuestion6(View v) {
        totalCorrect += 1;

        setContentView(R.layout.q6_correct);
    }

    /**
     * Checks question 7
     */
    public void checkQuestion7(View view) {

        CheckBox checkBox1 = (CheckBox) findViewById(R.id.check_box_1);
        boolean isChecked1 = checkBox1.isChecked();

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.check_box_2);
        boolean isChecked2 = checkBox2.isChecked();

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.check_box_3);
        boolean isChecked3 = checkBox3.isChecked();

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.check_box_4);
        boolean isChecked4 = checkBox4.isChecked();

        if (isChecked1 && isChecked2 && isChecked3 && !isChecked4) {
            totalCorrect += 1;

            setContentView(R.layout.q7_correct);
        } else {
            setContentView(R.layout.q7_incorrect);
        }

    }

    /**
     * Checks question 8
     */
    public void checkQuestion8(View view) {

        CheckBox checkBox1 = (CheckBox) findViewById(R.id.check_box_1);
        boolean isChecked1 = checkBox1.isChecked();

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.check_box_2);
        boolean isChecked2 = checkBox2.isChecked();

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.check_box_3);
        boolean isChecked3 = checkBox3.isChecked();

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.check_box_4);
        boolean isChecked4 = checkBox4.isChecked();

        if (isChecked1 && isChecked3 && isChecked4 && !isChecked2) {
            totalCorrect += 1;

            setContentView(R.layout.q8_correct);
        } else {
            setContentView(R.layout.q8_incorrect);
        }

    }

    /**
     * Checks question 9
     */
    public void checkQuestion9(View view) {

        RadioButton radioButtonD = (RadioButton) findViewById(R.id.radio_button_D);
        boolean isCheckedD = radioButtonD.isChecked();

        if (isCheckedD) {
            totalCorrect += 1;

            setContentView(R.layout.q9_correct);
        } else {
            setContentView(R.layout.q9_incorrect);
        }

    }

    /**
     * Checks question 10
     */
    public void checkQuestion10(View view) {

        RadioButton radioButtonB = (RadioButton) findViewById(R.id.radio_button_B);
        boolean isCheckedB = radioButtonB.isChecked();

        if (isCheckedB) {
            totalCorrect += 1;

            setContentView(R.layout.q10_correct);
        } else {
            setContentView(R.layout.q10_incorrect);
        }

    }

    /**
     * Sets layout to question 1 layout
     */
    public void showQuestion1(View v) {
        setContentView(R.layout.q1);
    }

    /**
     * Sets layout to question 2 layout
     */
    public void showQuestion2(View v) {
        setContentView(R.layout.q2);
    }

    /**
     * Sets layout to question 3 layout
     */
    public void showQuestion3(View v) {
        setContentView(R.layout.q3);
    }

    /**
     * Sets layout to question 4 layout
     */
    public void showQuestion4(View v) {
        setContentView(R.layout.q4);
    }

    /**
     * Sets layout to question 5 layout
     */
    public void showQuestion5(View v) {
        setContentView(R.layout.q5);
    }

    /**
     * Sets layout to question 6 layout
     */
    public void showQuestion6(View v) {
        setContentView(R.layout.q6);
    }

    /**
     * Sets layout to question 7 layout
     */
    public void showQuestion7(View v) {
        setContentView(R.layout.q7);
    }

    /**
     * Sets layout to question 8 layout
     */
    public void showQuestion8(View v) {
        setContentView(R.layout.q8);
    }

    /**
     * Sets layout to question 9 layout
     */
    public void showQuestion9(View v) {
        setContentView(R.layout.q9);
    }

    /**
     * Sets layout to question 10 layout
     */
    public void showQuestion10(View v) {
        setContentView(R.layout.q10);
    }

    /**
     * Sets layout to summary layout
     */
    public void showSummary(View v) {

        totalAttempts += 1;

        setContentView(R.layout.summary);

        String finalScore = getString(R.string.results_score, totalCorrect);
        String finalAttempts = getString(R.string.results_attempts, totalAttempts);

        TextView scoreTextView = (TextView) findViewById(R.id.score_text_view);
        scoreTextView.setText(finalScore);

        TextView attemptsTextView = (TextView) findViewById(R.id.attempts_text_view);
        attemptsTextView.setText(finalAttempts);

        if (totalCorrect == 10) {
            Toast.makeText(this, R.string.toast_message_10, Toast.LENGTH_LONG).show();
        } else if (totalCorrect >= 7 && totalCorrect <= 9) {
            Toast.makeText(this, R.string.toast_message_7_9, Toast.LENGTH_LONG).show();
        } else if (totalCorrect >= 4 && totalCorrect <= 6) {
            Toast.makeText(this, R.string.toast_message_4_6, Toast.LENGTH_LONG).show();
        } else if (totalCorrect >= 1 && totalCorrect <= 3) {
            Toast.makeText(this, R.string.toast_message_1_3, Toast.LENGTH_LONG).show();
        } else if (totalCorrect == 0) {
            Toast.makeText(this, R.string.toast_message_0, Toast.LENGTH_LONG).show();
        }

    }

    /**
     * Resets quiz to question 1 but keeps track of the attempt
     */
    public void resetQuiz(View v) {

        totalCorrect = 0;

        setContentView(R.layout.q1);
    }

    /**
     * Shares results to twitter, sort of
     */
    public void shareToTwitter(View v) {

        String twitterMessage = "";

        if (totalCorrect == 10) {
            twitterMessage = getString(R.string.tweet_message, totalCorrect, getString(R.string.tweet_nickname_1));
        } else if (totalCorrect >= 7 && totalCorrect <= 9) {
            twitterMessage = getString(R.string.tweet_message, totalCorrect, getString(R.string.tweet_nickname_2));
        } else if (totalCorrect >= 4 && totalCorrect <= 6) {
            twitterMessage = getString(R.string.tweet_message, totalCorrect, getString(R.string.tweet_nickname_3));
        } else if (totalCorrect >= 1 && totalCorrect <= 3) {
            twitterMessage = getString(R.string.tweet_message, totalCorrect, getString(R.string.tweet_nickname_4));
        } else if (totalCorrect == 0) {
            twitterMessage = getString(R.string.tweet_message, totalCorrect, getString(R.string.tweet_nickname_5));
        }

        String twitterUrl = "http://www.twitter.com/intent/tweet?text=" + Uri.encode(twitterMessage);

        Intent twitterIntent = new Intent(Intent.ACTION_VIEW);
        twitterIntent.setData(Uri.parse(twitterUrl));

        if (twitterIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(twitterIntent);
        }

    }

    /**
     * Button changes behavior based on which question and header are displayed
     */
    public void buttonSwitch (View v) {

        Button multiUseButton = (Button) findViewById(R.id.multi_use_button);

        TextView headerTextView = (TextView) findViewById(R.id.question_header_text_view);
        String headerText = headerTextView.getText().toString();

        TextView questionTextView = (TextView) findViewById(R.id.question_text_view);
        String questionText = questionTextView.getText().toString();

        if (headerText == getString(R.string.intro_header)) {
            headerTextView.setText(R.string.question_header_1);
            questionTextView.setText(R.string.question_1);
            multiUseButton.setText(R.string.submit_button);
        } else if ((headerText == getString(R.string.question_header_1)) && questionText == getString(R.string.question_1)) {
            checkAnswer();
            multiUseButton.setText(R.string.next_button);
        } else if (headerText == getString(R.string.question_header_1)) {
            headerTextView.setText(R.string.question_header_2);
            questionTextView.setText(R.string.question_2);
        }
    }

    /**
     * Check answer
     */
    public void checkAnswer () {

        //TODO: Move answer-checking logic here
        //TODO: Delete all 30 extra layouts...combine into activity_main

    }

}
