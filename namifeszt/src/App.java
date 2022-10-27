/*
* File: App.java
* Author: Serényi Zsolt Ödön
* Copyright: 2022, Serényi Zsolt Ödön
* Group: Szoft_II_N
* Date: 2022-10-27
* Github: https://github.com/OneBoyTwoGirl/
* Licenc: GNU GPL
*/
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Publication publ = new Publication();
        ArrayList<String> nameList = publ.getNames();
        for (String names : nameList) {
            System.out.println(names);
        }
    }
}