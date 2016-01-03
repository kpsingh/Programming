package com.manh.dp.adopter;

public class PlayVLC implements AdvancedMediaPlayer
{
    @Override
    public void playMP4(String filename)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void playVLC(String filename)
    {
        System.out.println("Playing VLC : " + filename);

    }
}
