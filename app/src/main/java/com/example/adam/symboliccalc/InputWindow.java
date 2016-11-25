package com.example.adam.symboliccalc;


import android.widget.EditText;

class InputWindow {
    private EditText tv = null;

    private int cursorPosition = 0;

    InputWindow(MainActivity m) {
        tv = (EditText)m.findViewById(R.id.textView4);
        tv.setSelection(cursorPosition);
        cursorPosition = 0;
    }
    private String getStartInput(){
        return tv.getText().toString().substring(0,cursorPosition);
    }
    private String getStartInputWithoutLast(){
        return tv.getText().toString().substring(0,cursorPosition-1);
    }
    private String getEndInput(){
        return tv.getText().toString().substring(cursorPosition,tv.getText().length());
    }
    void addToInputText(String text) {
        tv.setText(getStartInput() + text + getEndInput());
        cursorPosition += 1;
        tv.setSelection(cursorPosition);
    }

    void cursorLeft() {
        if(cursorPosition>0){
            cursorPosition--;
            tv.setSelection(cursorPosition);
        }
    }

    void cursorRight() {
        if(cursorPosition < tv.getText().length()){
            cursorPosition++;
            tv.setSelection(cursorPosition);
        }
    }

    void setNewText(String m){
        if(m.equals("")) return;
        tv.setText(m);
        cursorPosition = m.length();
        tv.setSelection(cursorPosition);
    }

    void deleteLettter(){
        if(tv.getText().length() > 0){
            if(cursorPosition > 0){
                tv.setText(getStartInputWithoutLast()+getEndInput()+"");
                cursorPosition--;
                tv.setSelection(cursorPosition);
            }
        }
    }
}
