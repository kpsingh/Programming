package com.manh.dp.adopter;

public class MediaAdapter implements MediaPlayer
{

    AdvancedMediaPlayer advanceMediaPlayer ;
    
    
    
    public void play(String type, String filename)
    {
        if(type.equalsIgnoreCase("vlc"))
        {
            new PlayVLC().playVLC(filename);
        }
        if(type.equalsIgnoreCase("mp4"))
        {
           new PlayMP4().playMP4(filename);
        }


    }

}
