package com.example.timetomath2;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Integer extends AppCompatActivity {
    public SharedPreferences sPref;
    public SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sPref = getSharedPreferences("app_settings", Context.MODE_PRIVATE);
        editor = sPref.edit();

        switch (sPref.getString("app_theme","")){
            case "1":
                setContentView(R.layout.activity_integer);
                break;
            case "2":
                setContentView(R.layout.activity_integer2);
                break;
            default: setContentView(R.layout.activity_integer);
        }
    }


    public class IntegerTest {

        public int currentInt;

        public IntegerTest(int height) { //от 0 до height
            currentInt = (int) (Math.random() * height + 1);
        }

        public IntegerTest(int height, int bottom) { //от bottom до height, на один больше и меньше
            currentInt = (int) (Math.random() * (height - bottom) + bottom);
        }

        public int getNumber() { //возвращает значение
            return currentInt;
        }

        public void printNumber() { //печатает значение
            System.out.println(currentInt);
            return;
        }

        public void changeNumber(int height) { //изменяет значение от 0 до height
            currentInt = (int) (Math.random() * height);
        }

        public void changeNumber(int height, int bottom) { //изменяет значение от bottom до height, на один больше и меньше
            currentInt = (int) (Math.random() * (height - bottom) + bottom);
        }

        public void changeNumberFrom(IntegerTest fromInt) {
            int curr = (int) (Math.random() * 200) - 100;
            currentInt = fromInt.getNumber() * curr;
        }

        public int getFirstResult(IntegerTest bInt, IntegerTest cInt) {
            int res, a, b, c;
            a = IntegerTest.this.getNumber();
            b = bInt.getNumber();
            c = cInt.getNumber();

            res = a + b + c;
            return res;
        }

        public String printFirst(IntegerTest bInt, IntegerTest cInt) {
            int a, b, c;
            String res;

            a = IntegerTest.this.getNumber();
            b = bInt.getNumber();
            c = cInt.getNumber();
            res = "(" + String.valueOf(a);
            if (b > -1) {
                res = res + " + " + b;
            } else {
                res = res + " - " + b * -1;
            }

            if (c > -1) {
                res = res + ") + " + c;
            } else {
                res = res + ") - " + c * -1;
            }

            return res + "=";

        }

        public int getSecondResult(IntegerTest bInt, IntegerTest cInt) {
            int res, a, b, c;
            a = IntegerTest.this.getNumber();
            b = bInt.getNumber();
            c = cInt.getNumber();

            res = a * (b + c);
            return res;
        }

        public String printSecond(IntegerTest bInt, IntegerTest cInt) {
            int a, b, c;
            String res;
            a = IntegerTest.this.getNumber();
            b = bInt.getNumber();
            c = cInt.getNumber();

            res = String.valueOf(a) + "*(" + String.valueOf(b);
            if (c > -1) {
                res = res + " + " + c + ")";
            } else {
                res = res + " - " + c * -1 + ")";
            }
            return res + "=";

        }

        public int getThirdResult(IntegerTest bInt, IntegerTest cInt) {
            int res, a, b, c;
            a = IntegerTest.this.getNumber();
            b = bInt.getNumber();
            c = cInt.getNumber();

            res = b / c;
            res += a;
            return res;
        }

        public String printThird(IntegerTest bInt, IntegerTest cInt) {
            int a, b, c;
            String res;
            a = IntegerTest.this.getNumber();
            b = bInt.getNumber();
            c = cInt.getNumber();

            res = String.valueOf(a);
            if (b > -1) {
                res = res + " + " + b;
            } else {
                res = res + " - " + b * -1;
            }

            res = res + "/" + String.valueOf(c);
            return res + "=";
        }

        public int getFourthResult(IntegerTest bInt, IntegerTest cInt, IntegerTest dInt) {
            int res, a, b, c, d;
            a = IntegerTest.this.getNumber();
            b = bInt.getNumber();
            c = cInt.getNumber();
            d = dInt.getNumber();

            res = a + b + c + d;
            return res;
        }

        public String printFourth(IntegerTest bInt, IntegerTest cInt, IntegerTest dInt) {
            int a, b, c, d;
            String res;
            a = IntegerTest.this.getNumber();
            b = bInt.getNumber();
            c = cInt.getNumber();
            d = dInt.getNumber();

            res = String.valueOf(a);
            if (b > -1) {
                res = res + " + " + b;
            } else {
                res = res + " - " + b * -1;
            }

            if (c > -1) {
                res = res + " + " + c;
            } else {
                res = res + " - " + c * -1;
            }

            if (d > -1) {
                res = res + " + " + d;
            } else {
                res = res + " - " + d * -1;
            }
            return res + "=";
        }

        public int getFifthResult(IntegerTest bInt, IntegerTest cInt, IntegerTest dInt) {
            int res, a, b, c, d;
            a = IntegerTest.this.getNumber();
            b = bInt.getNumber();
            c = cInt.getNumber();
            d = dInt.getNumber();

            res = b / c;
            res = (a + res) * d;
            return res;
        }

        public String printFifth(IntegerTest bInt, IntegerTest cInt, IntegerTest dInt) {
            int a, b, c, d;
            String res;
            a = IntegerTest.this.getNumber();
            b = bInt.getNumber();
            c = cInt.getNumber();
            d = dInt.getNumber();

            res = "(" + String.valueOf(a);
            if (b > -1) {
                res = res + " + " + b;
            } else {
                res = res + " - " + b * -1;
            }
            res = res + "/" + String.valueOf(c) + ")*";
            if (d > -1) {
                res = res + String.valueOf(d);
            } else {
                res = res + "(" + String.valueOf(d) + ")";
            }
            return res + "=";

        }
    }}
