package com.example.demo.repository;

import com.example.demo.dao.Register;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parsing {

    public static List<Register> parseTxtFile()  {
        List<Register> returnedRegister = new ArrayList<>();
        try {
            URL url = new URL("http://tuftuf.gambitlabs.fi/feed.txt");
            Scanner myReader = new Scanner(url.openStream());
            String strCurrentLine;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                strCurrentLine = data;
                if (!strCurrentLine.contains(" ")) {
                    String[] gottenData = data.split(":");
                    Register registerToBeAdded = new Register(Double.parseDouble(gottenData[1])
                            , Integer.parseInt(gottenData[0]));
                    returnedRegister.add(registerToBeAdded);
                }
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }


        return returnedRegister;

    }
}
