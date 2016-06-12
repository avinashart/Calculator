package com.example.avinash.calculator3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import net.objecthunter.exp4j.ExpressionBuilder;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ValidationResult;


public class MainActivity extends AppCompatActivity {

    public int check=1;
    public int dotCheck=1;
    public int operatorCheck=1;

    TextView topDisplay,bottomDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topDisplay = (TextView) findViewById(R.id.topDisplay);
        bottomDisplay = (TextView)findViewById(R.id.bottomDisplay);
        Button zero = (Button)findViewById(R.id.zero);
        Button one = (Button)findViewById(R.id.one);
        Button two = (Button)findViewById(R.id.two);
        Button three = (Button)findViewById(R.id.three);
        Button four = (Button)findViewById(R.id.four);
        Button five = (Button)findViewById(R.id.five);
        Button six = (Button)findViewById(R.id.six);
        Button seven = (Button)findViewById(R.id.seven);
        Button eight = (Button)findViewById(R.id.eight);
        Button nine = (Button)findViewById(R.id.nine);
        Button dot = (Button)findViewById(R.id.dot);
        Button plus = (Button)findViewById(R.id.plus);
        Button minus = (Button)findViewById(R.id.minus);
        Button multiply = (Button)findViewById(R.id.multiply);
        Button divide = (Button)findViewById(R.id.divide);
        Button equals = (Button)findViewById(R.id.equals);
        Button clear = (Button)findViewById(R.id.clearall);
        Button allClear = (Button)findViewById(R.id.allClear);

        if (allClear != null) {
            allClear.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        topDisplay.setText(null);
                        bottomDisplay.setText(null);
                    }
                }
            );
        }

        if (clear != null) {
            clear.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick(View v){

                            String str = (String)topDisplay.getText();
                            if(str.length()!=0){
                                String str2 = str.substring(0,str.length()-1);
                                topDisplay.setText(str2);
                            }

                        }
                    }
            );
        }
        if (zero != null) {
            zero.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {
                            operatorCheck=1;
                            if(check==1){
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "0");
                            }else{
                                check=1;
                                topDisplay.setText(null);
                                bottomDisplay.setText(null);
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "0");

                            }

                        }
                    }
            );
        }
        if (one != null) {
            one.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick(View v){

                            operatorCheck=1;
                            if(check==1){
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "1");
                            }else{
                                check=1;
                                topDisplay.setText(null);
                                bottomDisplay.setText(null);
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "1");

                            }
                        }
                    }
            );
        }
        if (two != null) {
            two.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick(View v){

                            operatorCheck=1;
                            if(check==1){
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "2");
                            }else{
                                check=1;
                                topDisplay.setText(null);
                                bottomDisplay.setText(null);
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "2");

                            }
                        }
                    }
            );
        }
        if (three != null) {
            three.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick(View v){

                            operatorCheck=1;
                            if(check==1){
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "3");
                            }else{
                                check=1;
                                topDisplay.setText(null);
                                bottomDisplay.setText(null);
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "3");

                            }
                        }
                    }
            );
        }
        if (four != null) {
            four.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick(View v){

                            operatorCheck=1;
                            if(check==1){
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "4");
                            }else{
                                check=1;
                                topDisplay.setText(null);
                                bottomDisplay.setText(null);
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "4");

                            }
                        }
                    }
            );
        }
        if (five != null) {
            five.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick(View v){

                            operatorCheck=1;
                            if(check==1){
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "5");
                            }else{
                                check=1;
                                topDisplay.setText(null);
                                bottomDisplay.setText(null);
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "5");

                            }
                        }
                    }
            );
        }
        if (six != null) {
            six.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick(View v){

                            operatorCheck=1;
                            if(check==1){
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "6");
                            }else{
                                check=1;
                                topDisplay.setText(null);
                                bottomDisplay.setText(null);
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "6");

                            }
                        }
                    }
            );
        }
        if (seven != null) {
            seven.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick(View v){

                            operatorCheck=1;
                            if(check==1){
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "7");
                            }else{
                                check=1;
                                topDisplay.setText(null);
                                bottomDisplay.setText(null);
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "7");

                            }
                        }
                    }
            );
        }
        if (eight != null) {
            eight.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick(View v){

                            operatorCheck=1;
                            if(check==1){
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "8");
                            }else{
                                check=1;
                                topDisplay.setText(null);
                                bottomDisplay.setText(null);
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "8");

                            }
                        }
                    }
            );
        }
        if (nine != null) {
            nine.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick(View v){

                            operatorCheck=1;
                            if(check==1){
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "9");
                            }else{
                                check=1;
                                topDisplay.setText(null);
                                bottomDisplay.setText(null);
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "9");

                            }
                        }
                    }
            );
        }
        if (dot != null) {
            dot.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick(View v){

                            if(dotCheck==1){
                                ///////
                                            if(check==1){
                                                dotCheck=0;
                                                String s = (String) topDisplay.getText();
                                                topDisplay.setText(s + ".");
                                            }else{
                                                check=1;
                                                dotCheck=0;
                                                topDisplay.setText(null);
                                                bottomDisplay.setText(null);
                                                String s = (String) topDisplay.getText();
                                                topDisplay.setText(s + ".");
                                            }
                                ///////
                            }

                        }
                    }
            );
        }
        if (plus != null) {
            plus.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {
                            check=1;
                            dotCheck=1;

                            if(operatorCheck==1){
                                operatorCheck=0;
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "+");
                            }else{

                                String s = (String)topDisplay.getText();
                                String str = s.substring(0,s.length()-1);
                                topDisplay.setText(str+"+");
                            }

                        }
                    }
            );
        }
        if (minus != null) {
            minus.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick(View v){
                            check=1;
                            dotCheck=1;

                            if(operatorCheck==1){
                                operatorCheck=0;
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s+"-");
                            }else{

                                String s = (String)topDisplay.getText();
                                String str = s.substring(0,s.length()-1);
                                topDisplay.setText(str+"-");
                            }



                        }
                    }
            );
        }
        if (multiply != null) {
            multiply.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {
                            check=1;
                            dotCheck=1;
                            if(operatorCheck==1){
                                operatorCheck=0;
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "*");
                            }else{

                                String s = (String)topDisplay.getText();
                                String str = s.substring(0,s.length()-1);
                                topDisplay.setText(str+"*");
                            }


                        }
                    }
            );
        }
        if (divide != null) {
            divide.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick(View v){
                            check=1;
                            dotCheck=1;
                            if(operatorCheck==1){
                                operatorCheck=0;
                                String s = (String) topDisplay.getText();
                                topDisplay.setText(s + "/");
                            }else{

                                String s = (String)topDisplay.getText();
                                String str = s.substring(0,s.length()-1);
                                topDisplay.setText(str+"/");
                            }


                        }
                    }
            );
        }

        if (equals != null) {
            equals.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick(View v){
                            check=0;
                            operatorCheck=1;
                            if(topDisplay.length()!=0)
                            equalsClicked(topDisplay,bottomDisplay);
                        }
                    }
            );
        }
    }

    public void equalsClicked(TextView topDisplay,TextView bottomDisplay){

        String txt = topDisplay.getText().toString();

        Expression exp = new ExpressionBuilder(txt).build();

            //Validate before Printing
            ValidationResult res = exp.validate();
        try {
            if(res.isValid()){
                double result = exp.evaluate();
                bottomDisplay.setText(Double.toString(result));

            }else {
                bottomDisplay.setText("SYNTAX ERROR!");
            }
        } catch (Exception e) {
            bottomDisplay.setText("INVALID");
        }


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
