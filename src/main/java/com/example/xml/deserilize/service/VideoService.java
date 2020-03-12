package com.example.xml.deserilize.service;

import com.example.xml.deserilize.model.Videos;
import com.example.xml.deserilize.util.VideoUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class VideoService {
    @Autowired
    private VideoUtil videoUtil;

    @Bean
    public Videos getVideos(){
        Videos videos = videoUtil.deserialize();
        log.info("\nVideos >> {}",videos);
        return videos;
    }
}
