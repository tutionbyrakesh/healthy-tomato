package com.rakesh.java.youtube;

import java.io.File;
import java.net.URL;

import com.github.axet.vget.VGet;

public class YoutubeDownloader {

		
	public static void main(String[] args) {
        try {
            String url = "https://www.youtube.com/watch?v=s10ARdfQUOY";
            String path = "C:\\MyData\\Tutorial\\Video Tutorial\\wiremock\\";
            VGet v = new VGet(new URL(url), new File(path));
            v.download();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
