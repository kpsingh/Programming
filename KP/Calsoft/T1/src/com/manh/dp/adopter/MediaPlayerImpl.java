package com.manh.dp.adopter;

public class MediaPlayerImpl implements MediaPlayer
{

    MediaAdapter mediaAdapter = new MediaAdapter();
    public void play(String type, String filename)
    {
        if (type.equalsIgnoreCase("mp3"))
        {
            System.out.println("Playing " + type + " : " + filename);
            
        }
        else if (type.equalsIgnoreCase("vlc"))
        {
            
            mediaAdapter.play(type, filename);
        }
        else if (type.equalsIgnoreCase("mp4"))
        {
            
            mediaAdapter.play(type, filename);
        }
        else
        {
            System.out.println(type + " is not a supported format.");
        }
    }
}
