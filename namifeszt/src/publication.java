/*
* File: Publication.java
* Author: Serényi Zsolt Ödön
* Copyright: 2022, Serényi Zsolt Ödön
* Group: Szoft_II_N
* Date: 2022-10-27
* Github: https://github.com/OneBoyTwoGirl/
* Licenc: GNU GPL
*/

import java.util.ArrayList;
import java.util.Arrays;


public class Publication implements Names {

    @Override
    public ArrayList<String> getNames() {
        String[] names = {"Béla", "Géza"};
        ArrayList<String> nameList =
        new ArrayList<>(Arrays.asList(names));

        return nameList;
    }
    
}