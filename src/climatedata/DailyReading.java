/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climatedata;

/**
 * @author Musta
 */
public class DailyReading {

    private Date date;
    private int matxTemp;
    private int minTemp;

    public DailyReading(Date date, int maxTemp, int minTemp) {
        this.date = date;
        this.matxTemp = maxTemp;
        this.minTemp = minTemp;

    }

    public Date getDate() {
        return date;
    }

    public int getMatxTemp() {
        return matxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public String toString() {
        return String.format("%s %6d %6d", date.toString(), matxTemp, minTemp);
    }
}
