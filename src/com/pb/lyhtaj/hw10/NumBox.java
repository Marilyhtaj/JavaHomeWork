package com.pb.lyhtaj.hw10;

public class NumBox <T extends Number> {
    private T[] numbers;

    public NumBox(int size){
        this.numbers = (T[]) new Number[size];
    }

    public T get(int index) {
        return numbers[index];
    }

    public void add(int index, T num)throws ArrayIndexOutOfBoundsException{
        if(index>numbers.length){
            throw new ArrayIndexOutOfBoundsException();
        } else numbers[index] = num;
    }


    public int length(){
        int length = 0;
        for(T i:numbers){
            if(i==null){
                length+=0;
            }else length++;
        }
        return length;
    }

    public double sum(){
        double sum = 0.0;
        for(T i:numbers){
            if(i==null){
                sum+=0;
            }else sum+=i.doubleValue();
        }
        return sum;
    }

    public double average(){
        double average = (sum()/length());
        return average;
    }

    public T max(){
        T max = numbers[0];
        for(int i=0;i< numbers.length;i++){
            if(numbers[i].doubleValue()>max.doubleValue()){
                max = numbers[i];
            }
        }
        return max;
    }
}

