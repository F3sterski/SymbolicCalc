package com.example.adam.symboliccalc;

import android.util.Log;

import java.util.EmptyStackException;
import java.util.Stack;

import static android.content.ContentValues.TAG;


class Memory {

    Stack<Operation> operationList = new Stack<Operation>();

    public Stack<Operation> getOperationList() {
        return operationList;
    }

    public void setOperationList(Stack<Operation> operationList) {
        this.operationList = operationList;
    }

    private class Operation {
        String item;

        public String getItem() {
            return item;
        }

        public void setItem(String item) {
            this.item = item;
        }
    }

    public void pushOperation(Operation o){
        operationList.push(o);
    }

    public String popOperation(){
        try{
            return operationList.pop().getItem();
        }catch (EmptyStackException e){
            Log.i(TAG, "popOperation: empty");
            return "";
        }

    }
}
