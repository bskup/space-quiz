package com.bskup.spacequiz;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
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
    public void checkQuestion1() {

        TextView questionTextView = (TextView) findViewById(R.id.question_text_view);

        Button multiUseButton = (Button) findViewById(R.id.multi_use_button);
        multiUseButton.setText(R.string.next_button);

        RadioButton radioButton1A = (RadioButton) findViewById(R.id.radio_button_1A);
        boolean isChecked1A = radioButton1A.isChecked();

        if (isChecked1A) {
            totalCorrect += 1;

            questionTextView.setText(R.string.correct);
        } else {
            questionTextView.setText(R.string.incorrect_response_1);
        }

    }

    /**
     * Checks question 2
     */
    public void checkQuestion2() {

        TextView questionTextView = (TextView) findViewById(R.id.question_text_view);

        Button multiUseButton = (Button) findViewById(R.id.multi_use_button);
        multiUseButton.setText(R.string.next_button);

        RadioButton radioButton2B = (RadioButton) findViewById(R.id.radio_button_2B);
        boolean isChecked2B = radioButton2B.isChecked();

        if (isChecked2B) {
            totalCorrect += 1;

            questionTextView.setText(R.string.correct);
        } else {
            questionTextView.setText(R.string.incorrect_response_2);
        }

    }

    /**
     * Checks question 3
     */
    public void checkQuestion3() {

        TextView questionTextView = (TextView) findViewById(R.id.question_text_view);

        Button multiUseButton = (Button) findViewById(R.id.multi_use_button);
        multiUseButton.setText(R.string.next_button);

        EditText editTextQ3 = (EditText) findViewById(R.id.edit_text_q3);
        String answerString = editTextQ3.getText().toString();
        String correctAnswer = getString(R.string.question_3_answer);

        if (answerString.equals(correctAnswer)) {
            totalCorrect += 1;

            questionTextView.setText(R.string.correct);
        } else {
            questionTextView.setText(R.string.incorrect_response_3);
        }

    }

    /**
     * Checks question 4
     */
    public void checkQuestion4() {

        TextView questionTextView = (TextView) findViewById(R.id.question_text_view);

        Button multiUseButton = (Button) findViewById(R.id.multi_use_button);
        multiUseButton.setText(R.string.next_button);

        EditText editTextQ4 = (EditText) findViewById(R.id.edit_text_q4);
        String answerString = editTextQ4.getText().toString();
        String correctAnswer = getString(R.string.question_4_answer);

        if (answerString.equals(correctAnswer)) {
            totalCorrect += 1;

            questionTextView.setText(R.string.correct);
        } else {
            questionTextView.setText(R.string.incorrect_response_4);
        }

    }

    /**
     * If question 5 is answered true
     */
    public void answerTrueQuestion5() {
        totalCorrect += 1;

        TextView questionTextView = (TextView) findViewById(R.id.question_text_view);
        questionTextView.setText(R.string.correct);

        Button multiUseButton = (Button) findViewById(R.id.multi_use_button);
        multiUseButton.setText(R.string.next_button);
    }

    /**
     * If question 5 is answered false
     */
    public void answerFalseQuestion5(View v) {
        TextView questionTextView = (TextView) findViewById(R.id.question_text_view);
        questionTextView.setText(R.string.incorrect_response_5);

        Button multiUseButton = (Button) findViewById(R.id.multi_use_button);
        multiUseButton.setText(R.string.next_button);

        Button falseButton = (Button) findViewById(R.id.false_button_q5);
        falseButton.setVisibility(View.GONE);
    }

    /**
     * If question 6 is answered true
     */
    public void answerTrueQuestion6() {
        TextView questionTextView = (TextView) findViewById(R.id.question_text_view);
        questionTextView.setText(R.string.incorrect_response_6);
    }

    /**
     * If question 6 is answered false
     */
    public void answerFalseQuestion6(View v) {
        totalCorrect += 1;

        TextView questionTextView = (TextView) findViewById(R.id.question_text_view);
        questionTextView.setText(R.string.correct);

        Button multiUseButton = (Button) findViewById(R.id.multi_use_button);
        multiUseButton.setText(R.string.next_button);

        Button falseButton = (Button) findViewById(R.id.false_button_q6);
        falseButton.setVisibility(View.GONE);
    }

    /**
     * Checks question 7
     */
    public void checkQuestion7() {

        TextView questionTextView = (TextView) findViewById(R.id.question_text_view);

        Button multiUseButton = (Button) findViewById(R.id.multi_use_button);
        multiUseButton.setText(R.string.next_button);

        CheckBox checkBox1 = (CheckBox) findViewById(R.id.check_box_7a);
        boolean isChecked1 = checkBox1.isChecked();

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.check_box_7b);
        boolean isChecked2 = checkBox2.isChecked();

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.check_box_7c);
        boolean isChecked3 = checkBox3.isChecked();

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.check_box_7d);
        boolean isChecked4 = checkBox4.isChecked();

        if (isChecked1 && isChecked2 && isChecked3 && !isChecked4) {
            totalCorrect += 1;

            questionTextView.setText(R.string.correct);
        } else {
            questionTextView.setText(R.string.incorrect_response_7);
        }

    }

    /**
     * Checks question 8
     */
    public void checkQuestion8() {

        TextView questionTextView = (TextView) findViewById(R.id.question_text_view);

        Button multiUseButton = (Button) findViewById(R.id.multi_use_button);
        multiUseButton.setText(R.string.next_button);

        CheckBox checkBox1 = (CheckBox) findViewById(R.id.check_box_8a);
        boolean isChecked1 = checkBox1.isChecked();

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.check_box_8b);
        boolean isChecked2 = checkBox2.isChecked();

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.check_box_8c);
        boolean isChecked3 = checkBox3.isChecked();

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.check_box_8d);
        boolean isChecked4 = checkBox4.isChecked();

        if (isChecked1 && isChecked3 && isChecked4 && !isChecked2) {
            totalCorrect += 1;

            questionTextView.setText(R.string.correct);
        } else {
            questionTextView.setText(R.string.incorrect_response_8);
        }

    }

    /**
     * Checks question 9
     */
    public void checkQuestion9() {

        TextView questionTextView = (TextView) findViewById(R.id.question_text_view);

        Button multiUseButton = (Button) findViewById(R.id.multi_use_button);
        multiUseButton.setText(R.string.next_button);

        RadioButton radioButtonD = (RadioButton) findViewById(R.id.radio_button_9d);
        boolean isCheckedD = radioButtonD.isChecked();

        if (isCheckedD) {
            totalCorrect += 1;

            questionTextView.setText(R.string.correct);
        } else {
            questionTextView.setText(R.string.incorrect_response_9);
        }

    }

    /**
     * Checks question 10
     */
    public void checkQuestion10() {

        TextView questionTextView = (TextView) findViewById(R.id.question_text_view);

        Button multiUseButton = (Button) findViewById(R.id.multi_use_button);
        multiUseButton.setText(R.string.results_button);

        RadioButton radioButtonB = (RadioButton) findViewById(R.id.radio_button_10b);
        boolean isCheckedB = radioButtonB.isChecked();

        if (isCheckedB) {
            totalCorrect += 1;

            questionTextView.setText(R.string.correct);
        } else {
            questionTextView.setText(R.string.incorrect_response_10);
        }

    }

    /**
     * Sets layout to summary layout
     */
    public void showSummary() {

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

        setContentView(R.layout.activity_main);

        Button multiUseButton = (Button) findViewById(R.id.multi_use_button);
        multiUseButton.setText(R.string.submit_button);

        TextView headerTextView = (TextView) findViewById(R.id.question_header_text_view);
        headerTextView.setText(R.string.question_header_1);

        TextView questionTextView = (TextView) findViewById(R.id.question_text_view);
        questionTextView.setText(R.string.question_1);

        RadioGroup radioGroupQ1 = (RadioGroup) findViewById(R.id.radio_group_q1);
        radioGroupQ1.clearCheck();
        radioGroupQ1.setVisibility(View.VISIBLE);

        RadioGroup radioGroupQ2 = (RadioGroup) findViewById(R.id.radio_group_q2);
        radioGroupQ2.clearCheck();

        EditText editTextQ3 = (EditText) findViewById(R.id.edit_text_q3);
        editTextQ3.getText().clear();

        EditText editTextQ4 = (EditText) findViewById(R.id.edit_text_q4);
        editTextQ4.getText().clear();

        CheckBox checkBox7a = (CheckBox) findViewById(R.id.check_box_7a);
        checkBox7a.setChecked(false);

        CheckBox checkBox7b = (CheckBox) findViewById(R.id.check_box_7b);
        checkBox7b.setChecked(false);

        CheckBox checkBox7c = (CheckBox) findViewById(R.id.check_box_7c);
        checkBox7c.setChecked(false);

        CheckBox checkBox7d = (CheckBox) findViewById(R.id.check_box_7d);
        checkBox7d.setChecked(false);

        CheckBox checkBox8a = (CheckBox) findViewById(R.id.check_box_8a);
        checkBox8a.setChecked(false);

        CheckBox checkBox8b = (CheckBox) findViewById(R.id.check_box_8b);
        checkBox8b.setChecked(false);

        CheckBox checkBox8c = (CheckBox) findViewById(R.id.check_box_8c);
        checkBox8c.setChecked(false);

        CheckBox checkBox8d = (CheckBox) findViewById(R.id.check_box_8d);
        checkBox8d.setChecked(false);

        RadioGroup radioGroupQ9 = (RadioGroup) findViewById(R.id.radio_group_q9);
        radioGroupQ9.clearCheck();

        RadioGroup radioGroupQ10 = (RadioGroup) findViewById(R.id.radio_group_q10);
        radioGroupQ10.clearCheck();
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
        Button falseButtonQ5 = (Button) findViewById(R.id.false_button_q5);
        Button falseButtonQ6 = (Button) findViewById(R.id.false_button_q6);

        TextView headerTextView = (TextView) findViewById(R.id.question_header_text_view);
        String headerText = headerTextView.getText().toString();

        TextView questionTextView = (TextView) findViewById(R.id.question_text_view);
        String questionText = questionTextView.getText().toString();

        RadioGroup radioGroupQ1 = (RadioGroup) findViewById(R.id.radio_group_q1);
        RadioGroup radioGroupQ2 = (RadioGroup) findViewById(R.id.radio_group_q2);

        EditText editTextQ3 = (EditText) findViewById(R.id.edit_text_q3);
        EditText editTextQ4 = (EditText) findViewById(R.id.edit_text_q4);

        LinearLayout checkBoxesQ7 = (LinearLayout) findViewById(R.id.check_boxes_q7);
        LinearLayout checkBoxesQ8 = (LinearLayout) findViewById(R.id.check_boxes_q8);

        RadioGroup radioGroupQ9 = (RadioGroup) findViewById(R.id.radio_group_q9);
        RadioGroup radioGroupQ10 = (RadioGroup) findViewById(R.id.radio_group_q10);

        if (headerText == getString(R.string.intro_header)) {
            headerTextView.setText(R.string.question_header_1);
            questionTextView.setText(R.string.question_1);
            multiUseButton.setText(R.string.submit_button);
            radioGroupQ1.setVisibility(View.VISIBLE);
        } else if ((headerText == getString(R.string.question_header_1)) && questionText == getString(R.string.question_1)) {
            radioGroupQ1.setVisibility(View.GONE);
            checkQuestion1();
        } else if ((headerText == getString(R.string.question_header_1)) && (questionText == getString(R.string.correct)) || questionText == getString(R.string.incorrect_response_1)) {
            headerTextView.setText(R.string.question_header_2);
            questionTextView.setText(R.string.question_2);
            multiUseButton.setText(R.string.submit_button);
            radioGroupQ2.setVisibility(View.VISIBLE);
        } else if ((headerText == getString(R.string.question_header_2)) && questionText == getString(R.string.question_2)) {
            radioGroupQ2.setVisibility(View.GONE);
            checkQuestion2();
        } else if ((headerText == getString(R.string.question_header_2)) && (questionText == getString(R.string.correct)) || questionText == getString(R.string.incorrect_response_2)) {
            headerTextView.setText(R.string.question_header_3);
            questionTextView.setText(R.string.question_3);
            multiUseButton.setText(R.string.submit_button);
            editTextQ3.setVisibility(View.VISIBLE);
        } else if ((headerText == getString(R.string.question_header_3)) && questionText == getString(R.string.question_3)) {
            editTextQ3.setVisibility(View.GONE);
            checkQuestion3();
        } else if ((headerText == getString(R.string.question_header_3)) && (questionText == getString(R.string.correct)) || questionText == getString(R.string.incorrect_response_3)) {
            headerTextView.setText(R.string.question_header_4);
            questionTextView.setText(R.string.question_4);
            multiUseButton.setText(R.string.submit_button);
            editTextQ4.setVisibility(View.VISIBLE);
        } else if ((headerText == getString(R.string.question_header_4)) && questionText == getString(R.string.question_4)) {
            editTextQ4.setVisibility(View.GONE);
            checkQuestion4();
        } else if ((headerText == getString(R.string.question_header_4)) && (questionText == getString(R.string.correct)) || questionText == getString(R.string.incorrect_response_4)) {
            headerTextView.setText(R.string.question_header_5);
            questionTextView.setText(R.string.question_5);
            multiUseButton.setText(R.string.true_button);
            falseButtonQ5.setVisibility(View.VISIBLE);
        } else if ((headerText == getString(R.string.question_header_5)) && (questionText == getString(R.string.question_5)) && (multiUseButton.getText().toString() == getString(R.string.true_button))) {
            falseButtonQ5.setVisibility(View.GONE);
            multiUseButton.setText(R.string.next_button);
            answerTrueQuestion5();
        } else if ((headerText == getString(R.string.question_header_5)) && (questionText == getString(R.string.correct)) || questionText == getString(R.string.incorrect_response_5)) {
            headerTextView.setText(R.string.question_header_6);
            questionTextView.setText(R.string.question_6);
            multiUseButton.setText(R.string.true_button);
            falseButtonQ6.setVisibility(View.VISIBLE);
        } else if ((headerText == getString(R.string.question_header_6)) && questionText == getString(R.string.question_6)) {
            falseButtonQ6.setVisibility(View.GONE);
            multiUseButton.setText(R.string.next_button);
            answerTrueQuestion6();
        } else if ((headerText == getString(R.string.question_header_6)) && (questionText == getString(R.string.correct)) || questionText == getString(R.string.incorrect_response_6)) {
            headerTextView.setText(R.string.question_header_7);
            questionTextView.setText(R.string.question_7);
            multiUseButton.setText(R.string.submit_button);
            checkBoxesQ7.setVisibility(View.VISIBLE);
        } else if ((headerText == getString(R.string.question_header_7)) && questionText == getString(R.string.question_7)) {
            checkBoxesQ7.setVisibility(View.GONE);
            checkQuestion7();
        } else if ((headerText == getString(R.string.question_header_7)) && (questionText == getString(R.string.correct)) || questionText == getString(R.string.incorrect_response_7)) {
            headerTextView.setText(R.string.question_header_8);
            questionTextView.setText(R.string.question_8);
            multiUseButton.setText(R.string.submit_button);
            checkBoxesQ8.setVisibility(View.VISIBLE);
        } else if ((headerText == getString(R.string.question_header_8)) && questionText == getString(R.string.question_8)) {
            checkBoxesQ8.setVisibility(View.GONE);
            checkQuestion8();
        } else if ((headerText == getString(R.string.question_header_8)) && (questionText == getString(R.string.correct)) || questionText == getString(R.string.incorrect_response_8)) {
            headerTextView.setText(R.string.question_header_9);
            questionTextView.setText(R.string.question_9);
            multiUseButton.setText(R.string.submit_button);
            radioGroupQ9.setVisibility(View.VISIBLE);
        } else if ((headerText == getString(R.string.question_header_9)) && questionText == getString(R.string.question_9)) {
            radioGroupQ9.setVisibility(View.GONE);
            checkQuestion9();
        } else if ((headerText == getString(R.string.question_header_9)) && (questionText == getString(R.string.correct)) || questionText == getString(R.string.incorrect_response_9)) {
            headerTextView.setText(R.string.question_header_10);
            questionTextView.setText(R.string.question_10);
            multiUseButton.setText(R.string.submit_button);
            radioGroupQ10.setVisibility(View.VISIBLE);
        } else if ((headerText == getString(R.string.question_header_10)) && questionText == getString(R.string.question_10)) {
            radioGroupQ10.setVisibility(View.GONE);
            checkQuestion10();
        } else if ((headerText == getString(R.string.question_header_10)) && (questionText == getString(R.string.correct)) || questionText == getString(R.string.incorrect_response_10)) {
            showSummary();
        }

    }

}
