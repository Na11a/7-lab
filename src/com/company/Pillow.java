package com.company;

import javax.xml.crypto.Data;
import java.util.Date;
enum Matherial{
    SATIN,
    JACQUARD,
    BATISTE,
}
public class Pillow {
    public String Name;
    public int height;
    public int width;
    public int volume;

    protected Date created_date;
    protected int weight;

    private Matherial matherial;
    private int price;
    private int  code;
    protected static int pillowsCount = 0;
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Matherial getMatherial() {
        return matherial;
    }

    public void setMatherial(Matherial matherial) {
        this.matherial = matherial;
    }

    protected static int getPillowsCount(){
        return pillowsCount;
    }

    public Pillow(String name, int height, int width, int volume) {
        this.Name = name;
        this.height = height;
        this.width = width;
        this.volume = volume;
        pillowsCount +=1;
    }

    public Pillow(String name, int height, int width, int volume, Date created_date, int weight, Matherial matherial, int price, int code) {
        this(name, height, width, volume);
        this.created_date = created_date;
        this.weight = weight;
        this.matherial = matherial;
        this.price = price;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Pillow{" +
                "Name='" + Name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", volume=" + volume +
                ", created_date=" + created_date +
                ", weight=" + weight +
                ", matherial=" + matherial +
                ", price=" + price +
                ", code=" + code +
                '}';
    }

}
