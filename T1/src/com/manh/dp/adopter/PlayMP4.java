package com.manh.dp.adopter;

public class PlayMP4 implements AdvancedMediaPlayer
{
    @Override
    public void playMP4(String filename)
    {
        System.out.println("Playing MP4 : " + filename);

    }

    @Override
    public void playVLC(String filename)
    {
        // TODO Auto-generated method stub

    }

}
