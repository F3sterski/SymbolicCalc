package com.example.adam.symboliccalc;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;
import java.util.Map;
import java.util.jar.Attributes;

import static com.example.adam.symboliccalc.BUTTON.*;

/**
 * Created by szkol_000 on 24.11.2016.
 */

enum BUTTON{
    ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,DOT,EXP,MOD,EQUAL,
    PLUS,MINUS,MUL,DIV,OPEN,CLOSE,LEFT,RIGHT,UNDO,DEL,CLEAR,POW,SQRT,
    LOG,LN,PERCENT,FUNC,IMAGINE,VARIABLE,PI,CONF
}

public class Buttons {
    HashMap<BUTTON,Button> buttonsMap = new HashMap<BUTTON,Button>();
    
    public Buttons(MainActivity m) {
     buttonsMap.put(ONE,(Button)m.findViewById(R.id.button26));
     buttonsMap.put(TWO,(Button)m.findViewById(R.id.button30));
     buttonsMap.put(ZERO,(Button)m.findViewById(R.id.button31));
     buttonsMap.put(DOT,(Button)m.findViewById(R.id.button35));
     buttonsMap.put(EXP,(Button)m.findViewById(R.id.button34));
     buttonsMap.put(MOD,(Button)m.findViewById(R.id.button33));
     buttonsMap.put(EQUAL,(Button)m.findViewById(R.id.button32));
     buttonsMap.put(THREE,(Button)m.findViewById(R.id.button29));
     buttonsMap.put(PLUS,(Button)m.findViewById(R.id.button28));
     buttonsMap.put(FOUR,(Button)m.findViewById(R.id.button21));
     buttonsMap.put(FIVE,(Button)m.findViewById(R.id.button24));
     buttonsMap.put(SIX,(Button)m.findViewById(R.id.button23));
     buttonsMap.put(MUL,(Button)m.findViewById(R.id.button22));
     buttonsMap.put(DIV,(Button)m.findViewById(R.id.button25));
     buttonsMap.put(SEVEN,(Button)m.findViewById(R.id.button16));
     buttonsMap.put(EIGHT,(Button)m.findViewById(R.id.button20));
     buttonsMap.put(NINE,(Button)m.findViewById(R.id.button19));
     buttonsMap.put(OPEN,(Button)m.findViewById(R.id.button18));
     buttonsMap.put(CLOSE,(Button)m.findViewById(R.id.button17));
     buttonsMap.put(LEFT,(Button)m.findViewById(R.id.button11));
     buttonsMap.put(RIGHT,(Button)m.findViewById(R.id.button15));
     buttonsMap.put(UNDO,(Button)m.findViewById(R.id.button14));
     buttonsMap.put(DEL,(Button)m.findViewById(R.id.button13));
     buttonsMap.put(CLEAR,(Button)m.findViewById(R.id.button12));
     buttonsMap.put(POW,(Button)m.findViewById(R.id.button3));
     buttonsMap.put(SQRT,(Button)m.findViewById(R.id.button10));
     buttonsMap.put(LOG,(Button)m.findViewById(R.id.button9));
     buttonsMap.put(LN,(Button)m.findViewById(R.id.button8));
     buttonsMap.put(PERCENT,(Button)m.findViewById(R.id.button7));
     buttonsMap.put(FUNC,(Button)m.findViewById(R.id.button2));
     buttonsMap.put(IMAGINE,(Button)m.findViewById(R.id.button));
     buttonsMap.put(VARIABLE,(Button)m.findViewById(R.id.button6));
     buttonsMap.put(PI,(Button)m.findViewById(R.id.button5));
     buttonsMap.put(CONF,(Button)m.findViewById(R.id.button4));
     buttonsMap.put(MINUS,(Button)m.findViewById(R.id.button27));
        makeListens(buttonsMap,m);
    }

    private void makeListens(Map<BUTTON, Button> buttonsMap, MainActivity m) {
        InputWindow ip = new InputWindow(m);
        Memory memory = new Memory();

        buttonsMap.get(ZERO).setOnClickListener((View v) -> ip.addToInputText("0"));
        buttonsMap.get(ONE).setOnClickListener((View v) -> ip.addToInputText("1"));
        buttonsMap.get(TWO).setOnClickListener((View v) -> ip.addToInputText("2"));
        buttonsMap.get(THREE).setOnClickListener((View v) -> ip.addToInputText("3"));
        buttonsMap.get(FOUR).setOnClickListener((View v) -> ip.addToInputText("4"));
        buttonsMap.get(FIVE).setOnClickListener((View v) -> ip.addToInputText("5"));
        buttonsMap.get(SIX).setOnClickListener((View v) -> ip.addToInputText("6"));
        buttonsMap.get(SEVEN).setOnClickListener((View v) -> ip.addToInputText("7"));
        buttonsMap.get(EIGHT).setOnClickListener((View v) -> ip.addToInputText("8"));
        buttonsMap.get(NINE).setOnClickListener((View v) -> ip.addToInputText("9"));
        buttonsMap.get(PLUS).setOnClickListener((View v) -> ip.addToInputText("+"));
        buttonsMap.get(MINUS).setOnClickListener((View v) -> ip.addToInputText("-"));
        buttonsMap.get(MUL).setOnClickListener((View v) -> ip.addToInputText("*"));
        buttonsMap.get(DIV).setOnClickListener((View v) -> ip.addToInputText("/"));
        buttonsMap.get(MOD).setOnClickListener((View v) -> ip.addToInputText("mod"));
        buttonsMap.get(EQUAL).setOnClickListener((View v) -> ip.addToInputText("="));
        buttonsMap.get(LEFT).setOnClickListener((View v) -> ip.cursorLeft());
        buttonsMap.get(RIGHT).setOnClickListener((View v) -> ip.cursorRight());
        buttonsMap.get(OPEN).setOnClickListener((View v) -> ip.addToInputText("("));
        buttonsMap.get(CLOSE).setOnClickListener((View v) -> ip.addToInputText(")"));
        buttonsMap.get(UNDO).setOnClickListener((View v) -> ip.setNewText(memory.popOperation()));
        buttonsMap.get(DEL).setOnClickListener((View v) -> ip.deleteLettter());
        buttonsMap.get(CLEAR).setOnClickListener((View v) -> ip.setNewText(""));
        buttonsMap.get(POW).setOnClickListener((View v) -> ip.addToInputText("^"));
        buttonsMap.get(SQRT).setOnClickListener((View v) -> {ip.addToInputText("sqrt()"); ip.cursorLeft();});
        buttonsMap.get(LOG).setOnClickListener((View v) -> {ip.addToInputText("log()"); ip.cursorLeft();});
        buttonsMap.get(LN).setOnClickListener((View v) -> {ip.addToInputText("ln()"); ip.cursorLeft();});
        buttonsMap.get(PERCENT).setOnClickListener((View v) -> ip.addToInputText("%"));
        buttonsMap.get(FUNC).setOnClickListener((View v) -> ip.addToInputText("f(x)="));
        buttonsMap.get(ONE).setOnClickListener((View v) -> ip.addToInputText("1"));
        buttonsMap.get(IMAGINE).setOnClickListener((View v) -> ip.addToInputText("i"));
        buttonsMap.get(VARIABLE).setOnClickListener((View v) -> ip.addToInputText("x"));
        buttonsMap.get(PI).setOnClickListener((View v) -> ip.addToInputText("pi"));
        buttonsMap.get(CONF).setOnClickListener((View v) -> changeButton());

    }

    void changeButton(){

    }
}
