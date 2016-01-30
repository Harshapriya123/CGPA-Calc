package com.example.android.cgpacalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static float[] grade = new float[]{10, 10, 10, 10, 10, 10, 10, 10, 10};
    private float gpa, cgpa = (float)8.74;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //method called when '-' button is pressed
    public void minusGrade(View view) {

        TextView gradeID;
        switch (view.getId()) {
            case R.id.grade1minus:
                gradeID = (TextView) findViewById(R.id.grade1);
                if (grade[1] > 5) {
                    grade[1]--;
                    minusGradeText(gradeID);
                    calcGPA();
                }
                break;
            case R.id.grade2minus:
                gradeID = (TextView) findViewById(R.id.grade2);
                if (grade[2] > 5) {
                    grade[2]--;
                    minusGradeText(gradeID);
                    calcGPA();
                }
                break;
            case R.id.grade3minus:
                gradeID = (TextView) findViewById(R.id.grade3);
                if (grade[3] > 5) {
                    grade[3]--;
                    minusGradeText(gradeID);
                    calcGPA();
                }
                break;
            case R.id.grade4minus:
                gradeID = (TextView) findViewById(R.id.grade4);
                if (grade[4] > 5) {
                    grade[4]--;
                    minusGradeText(gradeID);
                    calcGPA();
                }
                break;
            case R.id.grade5minus:
                gradeID = (TextView) findViewById(R.id.grade5);
                minusGradeText(gradeID);
                if (grade[5] > 5) {
                    grade[5]--;
                    calcGPA();
                }
                break;
            case R.id.grade6minus:
                gradeID = (TextView) findViewById(R.id.grade6);
                if (grade[6] > 5) {
                    grade[6]--;
                    minusGradeText(gradeID);
                    calcGPA();
                }
                break;
            case R.id.grade7minus:
                gradeID = (TextView) findViewById(R.id.grade7);
                if (grade[7] > 5) {
                    grade[7]--;
                    minusGradeText(gradeID);
                    calcGPA();
                }
                break;
            case R.id.grade8minus:
                gradeID = (TextView) findViewById(R.id.grade8);
                if (grade[8] > 5) {
                    grade[8]--;
                    minusGradeText(gradeID);
                    calcGPA();
                }
                break;
            case R.id.grade9minus:
                gradeID = (TextView) findViewById(R.id.grade9);
                if (grade[0] > 5) {
                    grade[0]--;
                    minusGradeText(gradeID);
                    calcGPA();
                }
                break;
        }
    }

    private void minusGradeText(TextView gradeID) {

        switch ((String) gradeID.getText()) {
            case "S":
                gradeID.setText("A");
                break;
            case "A":
                gradeID.setText("B");
                break;
            case "B":
                gradeID.setText("C");
                break;
            case "C":
                gradeID.setText("D");
                break;
            case "D":
                gradeID.setText("E");
                break;
        }
    }

    public void plusGrade(View view) {

        TextView gradeID;
        switch (view.getId()) {
            case R.id.grade1plus:
                gradeID = (TextView) findViewById(R.id.grade1);
                if (grade[1] < 10) {
                    grade[1]++;
                    plusGradeText(gradeID);
                    calcGPA();
                }
                break;
            case R.id.grade2plus:
                gradeID = (TextView) findViewById(R.id.grade2);
                if (grade[2] < 10) {
                    grade[2]++;
                    plusGradeText(gradeID);
                    calcGPA();
                }
                break;
            case R.id.grade3plus:
                gradeID = (TextView) findViewById(R.id.grade3);
                if (grade[3] < 10) {
                    grade[3]++;
                    plusGradeText(gradeID);
                    calcGPA();
                }
                break;
            case R.id.grade4plus:
                gradeID = (TextView) findViewById(R.id.grade4);
                if (grade[4] < 10) {
                    grade[4]++;
                    plusGradeText(gradeID);
                    calcGPA();
                }
                break;
            case R.id.grade5plus:
                gradeID = (TextView) findViewById(R.id.grade5);
                if (grade[5] < 10) {
                    grade[5]++;
                    plusGradeText(gradeID);
                    calcGPA();
                }
                break;
            case R.id.grade6plus:
                gradeID = (TextView) findViewById(R.id.grade6);
                if (grade[6] < 10) {
                    grade[6]++;
                    plusGradeText(gradeID);
                    calcGPA();
                }

                break;
            case R.id.grade7plus:
                gradeID = (TextView) findViewById(R.id.grade7);
                if (grade[7] < 10) {
                    grade[7]++;
                    plusGradeText(gradeID);
                    calcGPA();
                }
                break;
            case R.id.grade8plus:
                gradeID = (TextView) findViewById(R.id.grade8);
                if (grade[8] < 10) {
                    grade[8]++;
                    plusGradeText(gradeID);
                    calcGPA();
                }
                break;
            case R.id.grade9plus:
                gradeID = (TextView) findViewById(R.id.grade9);
                if (grade[0] < 10) {
                    grade[0]++;
                    plusGradeText(gradeID);
                    calcGPA();
                }
                break;
        }
    }

    private void plusGradeText(TextView gradeID) {

        switch ((String) gradeID.getText()) {
            case "A":
                gradeID.setText("S");
                break;
            case "B":
                gradeID.setText("A");
                break;
            case "C":
                gradeID.setText("B");
                break;
            case "D":
                gradeID.setText("C");
                break;
            case "E":
                gradeID.setText("D");
                break;
        }
    }

    private void calcGPA() {

        gpa = (2 * grade[1] + 4 * grade[2] + 3 * grade[3] + 2 * grade[4] + 3 * grade[5] + 2 * grade[6] + 3 * grade[7] + 4 * grade[8] + 1 * grade[0]) / 24;
        TextView gpaText = (TextView) findViewById(R.id.gpa);
        gpaText.setText(Float.toString(gpa));
        updateCGPA();
    }

    private void updateCGPA(){

        cgpa = (float)((8.32*72) + (gpa*24))/96;
        TextView cgpaText = (TextView) findViewById(R.id.cgpa);
        cgpaText.setText(Float.toString(cgpa));
    }
}
