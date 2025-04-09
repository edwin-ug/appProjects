package com.example.calculatorg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button add, sub, mul, div, per, equ, dec, del, cle, bu0, bu1, bu2, bu3, bu4, bu5, bu6, bu7, bu8, bu9, dot;

    TextView current;
    TextView method;

    StringBuilder currentString;
    String currentInput;
    ArrayList<String> allInts;
    ArrayList<String> operators;
    String sign;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        add = findViewById(R.id.buttonAddition);
        sub = findViewById(R.id.buttonSubtraction);
        mul = findViewById(R.id.buttonMultiplication);
        div = findViewById(R.id.buttonDivision);
        per = findViewById(R.id.buttonPercentage);
        equ = findViewById(R.id.buttonEqual);
        dec = findViewById(R.id.buttonDot);
        del = findViewById(R.id.buttonDelete);
        cle = findViewById(R.id.buttonClear);
        bu0 = findViewById(R.id.button0);
        bu1 = findViewById(R.id.button1);
        bu2 = findViewById(R.id.button2);
        bu3 = findViewById(R.id.button3);
        bu4 = findViewById(R.id.button4);
        bu5 = findViewById(R.id.button5);
        bu6 = findViewById(R.id.button6);
        bu7 = findViewById(R.id.button7);
        bu8 = findViewById(R.id.button8);
        bu9 = findViewById(R.id.button9);
        dot = findViewById(R.id.buttonDot);

        current = findViewById(R.id.textViewCurrent);
        method = findViewById(R.id.textViewMethod);

        currentString = new StringBuilder("0");

        currentInput = "";
        allInts = new ArrayList<>();
        operators = new ArrayList<>();
        DecimalFormat df = new DecimalFormat();

//_______________________Button clicks_______________________
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!currentInput.contains(".")) {
                    StringBuilder compare = new StringBuilder("0");
                    StringBuilder empty = new StringBuilder("");
                    if (currentString.toString().equals(compare.toString())) {
                        currentString.append(".");
                        currentInput = currentInput + ".";
                        current.setText(currentString);
                    } else if (currentString.toString().equals(empty.toString())) {
                        currentString.append("0.");
                        currentInput = currentInput + "0.";
                        current.setText(currentString);
                    }else {
                        currentString.append(".");
                        currentInput = currentInput + ".";
                        current.setText(currentString);
                    }
                } dot.setTextColor(getResources().getColor(R.color.greyedOut));
            }
        });
        bu0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentString.append("0");
                currentInput = currentInput + "0";
                current.setText(currentString);
                }
        });

        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder compare = new StringBuilder("0");
                if (currentString.toString().equals(compare.toString())){
                    currentString.deleteCharAt(currentString.length()-1);
                    currentString.append("1");
                    currentInput = currentInput + "1";
                    current.setText(currentString);
                } else {
                    currentString.append("1");
                    currentInput = currentInput + "1";
                    current.setText(currentString);
                }
            }
        });

        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder compare = new StringBuilder("0");
                if (currentString.toString().equals(compare.toString())){
                    currentString.deleteCharAt(currentString.length()-1);
                    currentString.append("2");
                    currentInput = currentInput + "2";
                    current.setText(currentString);
                } else {
                    currentString.append("2");
                    currentInput = currentInput + "2";
                    current.setText(currentString);
                }
            }
        });

        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder compare = new StringBuilder("0");
                if (currentString.toString().equals(compare.toString())){
                    currentString.deleteCharAt(currentString.length()-1);
                    currentString.append("3");
                    currentInput = currentInput + "3";
                    current.setText(currentString);
                } else {
                    currentString.append("3");
                    currentInput = currentInput + "3";
                    current.setText(currentString);
                }
            }
        });

        bu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder compare = new StringBuilder("0");
                if (currentString.toString().equals(compare.toString())){
                    currentString.deleteCharAt(currentString.length()-1);
                    currentString.append("4");
                    currentInput = currentInput + "4";
                    current.setText(currentString);
                } else {
                    currentString.append("4");
                    currentInput = currentInput + "4";
                    current.setText(currentString);
                }
            }
        });

        bu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder compare = new StringBuilder("0");
                if (currentString.toString().equals(compare.toString())){
                    currentString.deleteCharAt(currentString.length()-1);
                    currentString.append("5");
                    currentInput = currentInput + "5";
                    current.setText(currentString);
                } else {
                    currentString.append("5");
                    currentInput = currentInput + "5";
                    current.setText(currentString);
                }
            }
        });

        bu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder compare = new StringBuilder("0");
                if (currentString.toString().equals(compare.toString())){
                    currentString.deleteCharAt(currentString.length()-1);
                    currentString.append("6");
                    currentInput = currentInput + "6";
                    current.setText(currentString);
                } else {
                    currentString.append("6");
                    currentInput = currentInput + "6";
                    current.setText(currentString);
                }
            }
        });

        bu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder compare = new StringBuilder("0");
                if (currentString.toString().equals(compare.toString())){
                    currentString.deleteCharAt(currentString.length()-1);
                    currentString.append("7");
                    currentInput = currentInput + "7";
                    current.setText(currentString);
                } else {
                    currentString.append("7");
                    currentInput = currentInput + "7";
                    current.setText(currentString);
                }
            }
        });

        bu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder compare = new StringBuilder("0");
                if (currentString.toString().equals(compare.toString())){
                    currentString.deleteCharAt(currentString.length()-1);
                    currentString.append("8");
                    currentInput = currentInput + "8";
                    current.setText(currentString);
                } else {
                    currentString.append("8");
                    currentInput = currentInput + "8";
                    current.setText(currentString);
                }
            }
        });

        bu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder compare = new StringBuilder("0");
                if (currentString.toString().equals(compare.toString())){
                    currentString.deleteCharAt(currentString.length()-1);
                    currentString.append("9");
                    currentInput = currentInput + "9";
                    current.setText(currentString);
                } else {
                currentString.append("9");
                    currentInput = currentInput + "9";
                current.setText(currentString);
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentInput == "" & sign == "+") {
                    // Do nothing
                }else if(currentInput == "" & sign != "+"){
                    currentString.deleteCharAt(currentString.length()-1);
                    currentString.append("+");
                    current.setText(currentString);
                    operators.remove(operators.size()-1);
                    operators.add("+");
                    sign = "+";
                } else {
                    currentString.append("+");
                    current.setText(currentString);
                    allInts.add(currentInput);
                    currentInput = "";
                    operators.add("+");
                    sign = "+";
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentInput == "" & sign == "-"){
                    // Do nothing
                }else if(currentInput == "" & sign != "-"){
                    currentString.deleteCharAt(currentString.length()-1);
                    currentString.append("-");
                    current.setText(currentString);
                    operators.remove(operators.size()-1);
                    operators.add("-");
                    sign = "-";
                } else {
                    currentString.append("-");
                    current.setText(currentString);
                    allInts.add(currentInput);
                    currentInput = "";
                    operators.add("-");
                    sign = "-";
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentInput == "" & sign == "x"){
                    // Do nothing
                }else if(currentInput == "" & sign != "x"){
                    currentString.deleteCharAt(currentString.length()-1);
                    currentString.append("x");
                    current.setText(currentString);
                    operators.remove(operators.size()-1);
                    operators.add("x");
                    sign = "x";
                } else {
                    currentString.append("x");
                    current.setText(currentString);
                    allInts.add(currentInput);   //problem
                    currentInput = "";
                    operators.add("x");
                    sign = "x";
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentInput == "" & sign == "/"){
                    // Do nothing
                }else if(currentInput == "" & sign != "/"){
                    currentString.deleteCharAt(currentString.length()-1);
                    currentString.append("/");
                    current.setText(currentString);
                    operators.remove(operators.size()-1);
                    operators.add("/");
                    sign = "/";

                } else {
                    currentString.append("/");
                    current.setText(currentString);
                    allInts.add(currentInput);
                    currentInput = "";
                    operators.add("/");
                    sign = "/";
                }
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentString.length() > 1){
                    currentString.deleteCharAt(currentString.length()-1);
                    currentInput = currentInput.substring(0, currentInput.length() - 1);
                    current.setText(currentString);
                }else if (currentString.length() == 1){
                    currentString.deleteCharAt(0);
                    currentInput = currentInput.substring(0, 0);
                    current.setText(currentString);
                }else{
                    // Do nothing: Cant delete what's not there to begin with
                }
            }
        });

        cle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder def = new StringBuilder("");
                currentString = def;
                currentInput = "";
                operators.clear();
                allInts.clear();
                current.setText(currentString);
            }
        });

        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allInts.add(currentInput);

                while(operators.contains("/")){
                    int index = operators.indexOf("/");
                    Float valA = Float.parseFloat(allInts.get(index));
                    Float valB = Float.parseFloat(allInts.get(index + 1));
                    Float newValFloat = valA / valB;
                    String newValString = String.valueOf(df.format(newValFloat)) ;
                    allInts.set(index, newValString);
                    allInts.remove(index + 1);
                    operators.remove(index);
                }

                while(operators.contains("x")){
                    int index = operators.indexOf("x");
                    Float valA = Float.parseFloat(allInts.get(index));
                    Float valB = Float.parseFloat(allInts.get(index + 1));
                    Float newValFloat = valA * valB;
                    String newValString = String.valueOf(df.format(newValFloat)) ;
                    allInts.set(index, newValString);
                    allInts.remove(index + 1);
                    operators.remove(index);
                }

                while(operators.contains("+")){
                    int index = operators.indexOf("+");
                    Float valA = Float.parseFloat(allInts.get(index));
                    Float valB = Float.parseFloat(allInts.get(index + 1));
                    Float newValFloat = valA + valB;
                    String newValString = String.valueOf(df.format(newValFloat)) ;
                    allInts.set(index, newValString);
                    allInts.remove(index + 1);
                    operators.remove(index);
                }

                while(operators.contains("-")){
                    int index = operators.indexOf("-");
                    Float valA = Float.parseFloat(allInts.get(index));
                    Float valB = Float.parseFloat(allInts.get(index + 1));
                    Float newValFloat = valA - valB;
                    String newValString = String.valueOf(df.format(newValFloat)) ;
                    allInts.set(index, newValString);
                    allInts.remove(index + 1);
                    operators.remove(index);
                }

                String result = allInts.get(0) ;
                StringBuilder resultStringBuilder = new StringBuilder(result);
                currentString = resultStringBuilder;
                currentInput = result;
                current.setText(result);
                if(!allInts.isEmpty()){
                    allInts.remove(0);
                }else{
                    // Do absolutely nothing
                }
            }
        });
    }
}