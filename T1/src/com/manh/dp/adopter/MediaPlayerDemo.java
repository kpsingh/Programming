package com.manh.dp.adopter;

public class MediaPlayerDemo
{

    public static void main(String[] args)
    {
        MediaPlayerImpl media = new MediaPlayerImpl();
        media.play("mp3","O Palan Hari");
        media.play("mp4","Ek Onkar");
        media.play("vlc","Hanuman Chalisa");
        media.play("avi","Ramayan");
        media.play("kfc","Ramayan");
    }
}
