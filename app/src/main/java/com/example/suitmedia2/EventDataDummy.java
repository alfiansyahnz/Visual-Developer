package com.example.suitmedia2;

import java.util.ArrayList;

public class EventDataDummy {

    public static String[][] data = new String[][]{
            {"Lets Succes Make The Noise", "Nov 09 2014", "https://cdn.pixabay.com/photo/2015/05/15/14/50/concert-768722__340.jpg" ,"This is version of lorem ipsum , Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries"},
            {"Liver Music Batu", "15", "https://cdn.pixabay.com/photo/2017/04/10/16/55/live-music-2219036__340.jpg","This is version of lorem ipsum , Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries"},
            {"Koktail Sosialisasi", "24 ", "https://cdn.pixabay.com/photo/2016/01/19/15/07/cocktails-1149171__340.jpg","This is version of lorem ipsum , Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries"},
            {"Gelanggang Pekan Raya", "27 ", "https://cdn.pixabay.com/photo/2016/01/19/17/18/fairground-1149626__340.jpg","This is version of lorem ipsum , Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries"},
            {"Konser Kinerja Musik", "18 ", "https://cdn.pixabay.com/photo/2015/10/12/15/09/concert-984237__340.jpg","This is version of lorem ipsum , Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries"}

    };

    public static ArrayList<Event> getData() {
        ArrayList<Event> list = new ArrayList<>();
        for (String[] aData : data) {
            Event event = new Event();
            event.setNama(aData[0]);
            event.setTanggal(aData[1]);
            event.setImage(aData[2]);
            event.setDesc(aData[3]);
            list.add(event);

        }
        return list;
    }
}
